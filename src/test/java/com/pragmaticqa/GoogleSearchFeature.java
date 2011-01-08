package com.pragmaticqa;

import cuke4duke.annotation.I18n;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Haroon Rasheed
 * Date: 18-Nov-2010
 */

public class GoogleSearchFeature {

    WebDriver driver;

    @I18n.EN.Given("^The search is Hello World$")
    public void theSearchIsHelloWorld() {
        driver = new HtmlUnitDriver();
        driver.get("http://www.google.co.uk");
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Hello World");
    }

    @I18n.EN.When("^The Search is performed$")
    public void theSearchIsPerformed() {
        driver.findElement(By.xpath("//input[@name='btnG']")).click();
    }

    @I18n.EN.Then("^The browser title should have Hello World$")
    public void theBrowserTitleShouldHaveHelloWorld() {
        assertThat ("Browser title:",driver.getTitle(), containsString("Hello World"));
        driver.quit();
    }
}