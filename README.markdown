A project setup to help you with getting started with [Cucumber](http://cukes.info) features using [cuke4duke](http://github.com/aslakhellesoy/cuke4duke) maven plugin.

## Usage ##
Just run one of the cucumber actions to run all of the cucumber features. Features go in a 'features' directory at the root of the project. Step definitions go in 'src/test/java'. 

If you are running the feature files for the very first time then perform the following maven command:
    mvn clean integration-test -Dcucumber.installGems=true
this would install the necessary gem files to run the Cucumber feature files using [JRuby](http://jruby.org).

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
Step definitions are written in Java, using the cuke4duke Java DSL. More information on this api can be obtained from the the [cuke4duke wiki page for java](http://wiki.github.com/aslakhellesoy/cuke4duke/java).

## Roadmap ##
Current plans:

* Add page object example to the project.

