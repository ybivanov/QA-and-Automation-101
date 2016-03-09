# Integration Testing with Selenium

## Theory of test automation

### Exercise: (30 minutes)

Please read
https://en.wikipedia.org/wiki/Test_automation

Answer the questions
* Why we need to automate
* What we have to automate
* How test cases need to be written to be automatable
(remember Lesson 3)


### Exercise: (10 minutes)

* Execute the example `flaky.py` test - it should pass
* Execute the same test again - it should fail
* Examine the test and answer the question - why did it fail

Flaky tests are tests which fail from time to time depending on their
order of execution or on external factors. This means that the test script
is poorly written. Automated tests should be designed in such a way that they
are independent of the order in which they are executed and of the
environment. That's why it is important to start the tests in a clean
environment.

**NOTE:** sometimes starting in a non-clean environment, e.g. pre-existing
database, is a good way to cause your automated tests to fail. This can be used
as a method of finding flaky tests.

**NOTE:** some test frameworks, like RSpec (for Ruby) have the ability to
execute tests in random order and help identify flaky tests. Others may not
have this ability.

### Exercise: (10 minutes)

* You are working in Agile environment
* It is highly likely that there are flaky tests
* What will happen if you enable --order random on the CI server
* How will you deal with the problem


For further reading please see:
* http://googletesting.blogspot.bg/2008/04/tott-avoiding-flakey-tests.html
* https://semaphoreci.com/community/tutorials/how-to-deal-with-and-eliminate-flaky-tests




## What is automatable software

Automatable software is one that makes it easier to write automated tests.
Some important properties include
* being able to build the software repeatably and consistently (make, maven, etc)
* being able to easily install the software and required dependencies (e.g. rpm)
* being able to easily configure the required settings, for example configuration
stored in database, config files (various formats, text or binary), command line
options, environment variables
* being able to easily access individual components for testing (classes, widgets,
etc)

An automation framework or automation infrastructure or QA lab is an environment
where different testing tools can perform their tasks easily. An automation
framework integrates with the tools inside in order to control and execute
the automated tests and report the results. In many companies a CI server
(usually Jenkins) is the central hub of the test automation infrastructure.

Lots of the talks at *Google Testing and Automation Conference 2015* described
various test automation solutions developed by different companies to suit their
needs. Recorded video can be found at:
https://www.youtube.com/watch?list=PLSIUOFhnxEiCWGsN9t5A-XOhRbmz54IS1&v=Uszbcu3HqBQ


### Exercise: (30 minutes)

* Discuss all of the points above
* Discuss with the class what we need to do if the software under test
is not automatable ?


## Introduction to Integration Testing with Selenium

Instructor will explain what Selenium is and briefly explain how it works.

### Exercise: (120 minutes)

* Install Selenium IDE from http://docs.seleniumhq.org/
* Become familiar with the basics of using Selenium. See:
 * http://docs.seleniumhq.org/docs/02_selenium_ide.jsp#commonly-used-selenium-commands
 * http://docs.seleniumhq.org/docs/02_selenium_ide.jsp#locating-elements
* Explore the Selenium IDE user interface - work in pair and explain to your
peers what the IDE does.
* Open the provided example test and execute it in the Selenium IDE
* Add modifications to the test
* Add several new tests to your test suite

* Save your existing test cases and commit them to GitHub


Ask instructor for help.


### Homework

Prepare for Lessons 8 and 9 by familiarizing yourself with the Python
module for Selenium and the application under test.
