# Lesson 6 - Writing JUnit tests for Apache Commons

Apache Commons is a collection of reusable Java components which are heavily
used in most other Java projects. The list of components to test is at:
http://commons.apache.org/components.html

* The commons have a GitHub mirror at https://github.com/apache/commons-XXXX/
* All the projects use the Maven build system
* To build and test a project run the command

    mvn test jacoco:report

* Coverage report is available in `./target/site/jacoco/index.html`
* To execute a single test (for example file MyTest.java) use the command

    mvn -Dtest=MyTest test

* Suitable components for beginners are:
 * commons-codec
 * commons-collections
 * commons-compress
 * commons-configuration
 * commons-csv
 * commons-discovery
 * commons-email
 * commons-exec
 * commons-imaging
 * commons-lang
 * commons-logging
 * commons-math
 * commons-net


### Exercise: (30 minutes)

* Work in teams of 4-5 people
* Select a project to work on - 1 project per team!
* Fork the project on GitHub
* Create a local branch for your changes
* Build it locally, execute the tests and generate coverage report with JaCoCo
* Investigate the coverage report to see where the component is missing coverage
* Determine what needs to be done in order to cover the missing lines.
Don't write any code yet, just write down your results (e.g. I need method X to
throw an exception and assert that this happened. For that I need input A and B).
* Identify what you need to assert in your tests. Helpful documentation can be
found at http://junit.org! (e.g. how to assert an exception was thrown).

* Consult with instructor and your peers if the chosen test areas are
appropriate

### Exercise: (150 minutes)

* After finding places which need coverage split in pairs
* Each pair of students select 1 method/class which isn't covered

* NOTE: copy the coverage results directory for backup (it will be used later)

* Investigate what the method does and write a unit test for it
* HELP: look for similar tests in the test suite, ask instructor for help

* After the test finally passes compare the new coverage with the old one.
How much did you improve ?

* Reverse roles with your peer and write more unit tests. Coordinate with
the rest of your team to avoid working on the same item.

### Exercise: (60 minutes)

* Prepare your tests for submitting a PR on GitHub
 * Create a clean branch following master - 1 branch per change
 * Cherry-pick individual commits
 * Clean up comments, etc
* Re-run the test suite to make sure it passes
* Push the new branch to your GitHub repo
* Open a PR with the upstream project
* Ask instructor for help with the final wording if necessary


## Homework

Follow up on your pull requests and aim to have them accepted upstream!
Ask instructor and your peers for help if necessary.
