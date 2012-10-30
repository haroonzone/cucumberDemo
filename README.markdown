A project setup to help you with getting started with [Cucumber](http://cukes.info) features using [cucumber-jvm](http://github.com/cucumber/cucumber-jvm) and maven.

## Usage ##
Just run one of the cucumber actions to run all of the cucumber features.

You can run the tests using the following command.


    mvn clean test

this would download all the necessary jar files and will run the tests.

## Writing Features ##
Features are written in text format and are placed in .feature files inside the 'features' directory. For more info on writing features please see the [Cucumber](http://cukes.info) website.
For example:
    Feature: Google Search Feature
		In order to ensure that Google Search works
		I want to run a quick Hello World search.
	Scenario: Hello World Scenario
		Given The search is Hello World
		When The Search is performed
		Then The browser title should have Hello World

## Writing Step Defitions ##
Step definitions are written in Java.

## Roadmap ##
Current plans:

* Add page object example to the project.