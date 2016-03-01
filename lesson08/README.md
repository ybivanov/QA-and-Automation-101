# Lesson 8 - Writing Selenium tests for Mozilla Add-ons website

Mozilla Add-ons is a collection of Firefox add-ons. The URL to be tested is:
https://addons.mozilla.org/

Their automated test suite uses Selenium and is written with the Python
bindings. It is located at https://github.com/mozilla/Addon-Tests

For source of inspiration you can use:
* https://github.com/mozilla/Addon-Tests/issues
* https://bugzilla.mozilla.org/buglist.cgi?product=addons.mozilla.org&resolution=---
  * look at component Administration

### Exercise: (30 minutes)

* Fork & clone the Addon-Tests repository
* Read README
* Create a Python virtualenv and install all requirements
* Make sure everything works by trying to execute the test suite

### Exercise: (180 minutes)

* Work in pairs or small groups
* Examine the issues and bug reports and select a suitable topic
for a test case
* Define your test steps - you need to know what needs to be done
before continuing with automation
* Look at existing test cases for hints and inspiration how things
are done in the code
* Create an automated test case and submit it in GitHub
* Make sure your new test case works as expected. It is OK to FAIL if the bug
is still not fixed
* Make sure your new test passes quality inspection (hint: enable Travis-CI)

* Discuss the solution with your peers
* Switch roles and create more tests until time is over

### Homework:

* Clean up your tests and submit PR to Mozilla on GitHub

