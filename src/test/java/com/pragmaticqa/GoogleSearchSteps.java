package com.pragmaticqa;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;


public class GoogleSearchSteps {

    WebDriver driver;
    WebElement searchInputField;

    @Given("^The search is Hello World$")
    public void theSearchIsHelloWorld() {
        driver = new FirefoxDriver();
        driver.get("http://www.google.co.uk");
        searchInputField = driver.findElement(By.name("q"));
        searchInputField.sendKeys("Hello World");
    }

    @When("^The Search is performed$")
    public void theSearchIsPerformed() {
        searchInputField.submit();
    }

    @Then("^The browser title should have Hello World$")
    public void theBrowserTitleShouldHaveHelloWorld() {
        (new WebDriverWait(driver, 5)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getTitle().toLowerCase().startsWith("hello world");
            }
        });
        assertThat ("Browser title:",driver.getTitle(), containsString("Hello World"));
        driver.quit();
    }
}