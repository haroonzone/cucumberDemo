package com.pragmaticqa.calculator;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.hamcrest.MatcherAssert;

import static org.hamcrest.CoreMatchers.equalTo;

public class CalculatorSteps {

    Number inputA;
    Number inputB;
    Number result;
    String operation;
    Calculator calculator;

    @Given("^the input \"([^\"]*)\"$")
    public void the_input(String input) {
        parseInput(input);
        calculator = new Calculator();
    }

    @When("^the calculator is run$")
    public void the_calculator_is_run() {
        if (operation.equals("+")){
            result = calculator.add(inputA , inputB);
        }else if(operation.equals("/")){
            result = calculator.divide(inputA,inputB);
        }else if(operation.equals("*")){
            result = calculator.multiply(inputA,inputB);
        }else if(operation.equals("-")) {
            result = calculator.subtract(inputA, inputB);
        }
    }

    @Then("^the output should be \"([^\"]*)\"$")
    public void the_output_should_be(String output) {
        MatcherAssert.assertThat(result, equalTo((Number) (Double.valueOf(output))));
    }

    private void parseInput(String input){
        if (input.contains("+")){
            inputA = Integer.valueOf(input.substring(0,input.indexOf("+")));
            inputB = Integer.valueOf(input.substring(input.lastIndexOf("+") + 1));
            operation = "+";
        }

        if (input.contains("/")){
            inputA = Integer.valueOf(input.substring(0,input.indexOf("/")));
            inputB = Integer.valueOf(input.substring(input.lastIndexOf("/") + 1));
            operation = "/";
        }

        if (input.contains("*")){
            inputA = Integer.valueOf(input.substring(0,input.indexOf("*")));
            inputB = Integer.valueOf(input.substring(input.lastIndexOf("*") + 1));
            operation = "*";
        }

        if (input.contains("-")){
            inputA = Integer.valueOf(input.substring(0,input.indexOf("-")));
            inputB = Integer.valueOf(input.substring(input.lastIndexOf("-") + 1));
            operation = "-";
        }
    }
}
