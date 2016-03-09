# Unit Testing and Continuous Integration

## What is unit testing

### Exercise: (30 minutes)

Please read:
https://en.wikipedia.org/wiki/Unit_testing

* Discuss with instrcutor the following topics
 * What does unit testing do
 * What are the benefits of unit testing
 * Why is unit testing important
 * What is the structure of a unit test
 * Where is unit testing commonly used


## Fakes, stubs, mocks and doubles

Fake objects (or stubs, mocks, etc) are classes, methods or objects which
remove an external dependency of the system under test. The important rule
to remember is: always fake code which is outside your test case
(unit under test)!


For example, given the code below:

```
def hello(name):
    if time.clock.hour < 12:
        print "Good morning", name
    elif time.clock.isAfternoon():
        print "Good afternoon", name
    else:
        print "Good evening", name
```

The above pseudo-code is dependent on the current time of the day. If you want
to test it you need to control the time module. Either:

1. Modify the system clock of the system executing the test
2. Supply a fake time module which we can control

### Exercise: (10 minutes)

* Discuss with instructor the negatives of each method


### Exercise: (30 minutes)

Please read:
http://atodorov.org/blog/2015/11/23/bad-stub-design-in-dnf/

* Instructor will explain the code under test
* Discuss with instructor why the initial stub implementation was wrong.

## Using and abusing unit tests

Whenever unit tests cross the class boundaries of the unit under test
or cross process/network boundaries and utilize external dependencies like
database, network server, etc. they become integration tests.

**Unit test frameworks can and often are used for integration type tests!
Remember this and learn to distinguish between the two.**

Instructor will give some examples to illustrate the idea.


## Introduction to JUnit

JUnit is the standard unit testing framework for Java.
See http://junit.org/ for more informaton.

### Exercise: (20 minutes)

* On Linux you should have access to JUnit using the system package manager
* If not installed, then install junit

On Fedora do::

    # dnf install junit

Otherwise download the jar file from junit.org!

* Follow the JUnit Getting started guide:
https://github.com/junit-team/junit/wiki/Getting-started

NOTE: On Fedora replace the `junit-4.XX.jar` in examples with
`/usr/share/java/junit4.jar` (full path to jar file). `hamcrest-core-1.3.jar` is
not needed! Otherwise you can use the jar files from a local directory!

### Exercise: (20 minutes)

* Write a new test for your Calculator class from the previous exercise
 * for example for a new `add(a+b)` method
* Run the tests - they should fail
* Implement the missing functionality and re-run the tests until they PASS
* Answer the question:
* what is this method of development called


## Continuous Integration

Please read:
https://en.wikipedia.org/wiki/Continuous_integration

### Exercise: (30 minutes)

* Discuss with instructor what CI is
* Discuss the best practices of CI and why they are important

Remember:
* CI is a shared effort between developers and QA
* In Agile environment it can be cheaper to revert instead of exhaustive testing
* DevOps relies heavily on CI and automated testing

## Introduction to Travis-CI

Travis-CI is a CI software and a hosted service popular with open source
projects. The service is free for public repositories on GitHub.

### Exercise: (10 minutes)

* Login (using GitHub) to http://travis-ci.org
* Examine a sample project to become familiar with the interface:
https://travis-ci.org/atodorov/JavaCalc
* Answer the questions
 * why build #1 failed
 * how many environments are there in the test matrix


### Exercise: (30 minutes)

* Publish your Calculator example on GitHub
* Enable the repository inside Travis-CI
* Create a `.travis.yml` file which tells Travis-CI how to build and test
your project
* Push the changes to GitHub
* Investigate the failures
* Fix the problems and push again until the result is PASS
* Expand your build matrix

## Code coverage in CI

Code coverage is commonly used with unit tests and CI as a metric of how
much testing is performed. The metric is not a silver bullet.

REMEMBER:
* 100% unit test coverage is almost impossible to achieve
* 100% unit test coverage doesn't mean we don't have any bugs
* code coverage can be used as metric to direct further testing efforts
* code coverage is not limited to unit testing only
* there are code coverage tools for every programming language


### Exercise: (20 minutes)

* Examine the code coverage reports for Apache commons-math module:
 * https://commons.apache.org/proper/commons-math/jacoco/index.html
 * https://coveralls.io/github/apache/commons-math?branch=master
* Discuss with your peers and instructor your findings


### Homework

Prepare yourself for Lesson06 by familiarizing as best as possible with
one of the Apache Commons components!
