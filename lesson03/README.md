# Lesson 3 - Test Case Management

This lesson will start with brief theory of test management presented by the
instructor. The goal is to get slightly familiar with the terms used.
The later part of the lesson includes practical exercises to help the
students become familiar with one particular TCMS.


## What is test management

“If it is not in the TCMS then we do not do it”, and the converse:
“If we do it then it is in the TCMS” -- Nitrate.

Test Case Management System (TCMS) is a software tool which helps documenting
and managing the test process. You can document individual test cases,
organize them in test plans and monitor execution progress and defects found.

There are many TCMS systems available. Each one is different from the rest.

For more information see:
https://en.wikipedia.org/wiki/Test_management
https://en.wikipedia.org/wiki/Test_management_tools

## Generic definitions

**Test Case** is a set of conditions under which a tester will determine
whether an application, software system or one of its features is working as
it was originally established for it to do. 

The mechanism for determining whether a software program or system has passed
or failed such a test is known as a test oracle. In some settings, an oracle
could be a requirement or use case, while in others it could be a heuristic.

It may take many test cases to determine that a software program or system is
considered sufficiently scrutinized to be released. Test cases are often
referred to as test scripts, particularly when written - when they are usually
collected into test suites.

https://en.wikipedia.org/wiki/Test_case


### Exercise: (30 minutes)

* Work alone.
* Instructor will pick a few students to present their solutions to the class

* You are given the following sign-up form:
https://www.openshift.com/app/account/new

* Explain how exactly will you test the following test case.
NOTE: Write down step-by-step is the best thing to do.

CASE 01 - Create account with bad password
------------------------------------------

Setup:

1. Open the sign-up form in your browser

Actions:

1. Fill-in the form
2. Use a bad password to register

Expected results:

1. The form returns an error about bad password.




How did you test:

...






* Answer the questions
 * what browser did you use
 * how did you navigate to the URL (type, copy&paste, click a link)
 * what type of bad password did you use
 * what was the exact error message on the form




* Explain how exactly will you test the following test case.
NOTE: Write down step-by-step is the best thing to do.


CASE 02 - Create account with short password
---------------------------------------------

Setup:

1. Open the https://www.openshift.com/app/account/new URL in Firefox

Actions:

1. Fill-in a valid email address
2. For password use "1234"
3. Confirm the password "1234"
4. Enter the CAPTCHA challenge
5. Click Sign up button

Expected results:

1. The form returns an error message.
Password needs to be at lest 6 characters long!



How did you test

...





* Answer the questions
 * what browser did you use
 * how did you navigate to the URL (type, copy&paste, click a link)
 * what type of bad password did you use
 * what was the exact error message on the form


* Answer the questions
 * find the differences between the two test cases
 * which test case is better and why
 * what are the attributes of a well defined test case







**Test Plan** is a document detailing the objectives, target market, internal
team, and processes for a specific test for a software or hardware product.
The plan typically contains a detailed description of the eventual workflow.

For more information read:
https://en.wikipedia.org/wiki/Test_plan



**Test Run** aka **Test Execution** is a single execution of the chosen
test plan or test case (depending on context and tools) which contains essential
information as to what happened during this particular execution. For example:

* which version of the software was tested
* what environment was tested (e.g. Android vs. iOS, Linux vs. Windows)
* when were the test(s) executed
* who executed the tests
* what is the overall progress of execution
* what bugs were found (if any)
* comments describing what has been done
* statuses of test cases (e.g. PASS, FAIL, BLOCKED)
* freehand notes


## IEEE test plan structure (30 minutes)

1. Test plan identifier
2. Introduction
3. Test items
4. Features to be tested
5. Features not to be tested
6. Approach
7. Item pass/fail criteria
8. Suspension criteria and resumption requirements
9. Test deliverables
10. Testing tasks
11. Environmental needs
12. Responsibilities
13. Staffing and training needs
14. Schedule
15. Risks and contingencies
16. Approvals

Instructor will explain what this is and what the various clauses (or sections)
means and what information is supposed to go into them. Please take notes because
this will be used in the next exercise. Ask questions when unclear.


For more information read:
http://www.coleyconsulting.co.uk/testplan.htm
http://www.coleyconsulting.co.uk/IEEE829.htm


## Positive and negative tests

### Exercise: (15 minutes)

* Read the following article:
http://www.guru99.com/positive-vs-negative-testing.html

* Go back to the Sudoku exercise in Lesson 1
* Answer the questions:
 * Which tests are positive
 * Which tests are negative



## Practice with Nitrate TCMS

We have a demo TCMS system available at https://nitrate-hackbg.rhcloud.com/.
User guide is available at http://nitrate.readthedocs.org/en/latest/tutorial.html

### Exercise: (45 minutes)

* Register an account with Nitrate
* NOTE: The email confirmation will not work b/c we don't have the mailer configured
* Ask instructor to activate your user accounts
* Spend some time exploring Nitrate and become familiar with it.
* Ask instructor for help where necessary
* Create plans, products, cases, etc.


### Exercise: (60 minutes)

* Work in groups of 4-5 people
* Select a favorite software which everybody in the group
knows or uses

* Create a test plan in Nitrate following the IEEE standard.
You can use a local text editor and paste the text in Nitrate if
this is easier for you.

NOTE: in the test plan briefly describe what the tested software
and environment is.

* Decide what test cases will be necessary for your test plan and
software under test. Write positive and negative test cases for it.

* When satisfied simulate a few test runs (e.g. ver 1, ver 2, ver 3).
 * leave some items untested, failed or blocked

* Play the role of test manager (or test lead) - tell the customer
(usually Project Manager) what is the overall level of testing and risk.
Use the reports to collect the required information.

* Instructor will come to you in the role of The Customer and
ask you to make a change in the software. Clone existing test plans
and cases to accommodate the request.

### Homework

* For reference purposes (and personal archive) you can try the
Print Plan button and extract the test plan and test cases information
as HTML/plain text.


### Homework

Prepare user accounts for Lesson 4. We will be testing and reporting bugs
in the wild.
