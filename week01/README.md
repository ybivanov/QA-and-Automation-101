# Week 1 - QA fundamentals

## Definition of testing, QA and QE

The software industry uses many terms to describe testing
disciplines. Their meaning is similar in most cases but subtle
differences exist.

### Exercise: (30 minutes)

Read the following articles (10 minutes):

* https://en.wikipedia.org/wiki/Software_testing (up to section 2. History)
* https://en.wikipedia.org/wiki/Software_quality_assurance

Answer the following questions (10 minutes):

* In a software system, what properties are of interest to a QA person ?
* At which point in the software development life-cycle is QA involved ?

Instructor will discuss with the class why these are important (10 minutes).

## Tester vs. QA vs. QE

What are the differences between these in terms of job description ?

### Exercise: (20 minutes)

Read the following articles (10 minutes):
* http://www.quality-vectors.com/qe_qa.shtml
* http://manishrathi.com/2009/09/11/qa-tester-vs-qa-engineer-vs-qa-architect/


Answer the following questions (10 minutes):

* What is a tester good for ?
* What are the weak sides of a tester ?
* What is a QA good for ?
* What are some tasks of a QE engineer ?
* Bonus question: Which one do you want to be ?


## Why we need testing

### Exercise: (20 minutes)

* Work in groups of 4-5 people (organized per topic)
* Select a topic (e.g. mobile, automotive, server, banking software, etc)
* Describe examples of bugs you have experienced or have read/heard about
* Why are these bugs bad ?
** How did they hurt the user ?
** How did they hurt the software vendor ?

Summary: we need testing because everything in today's world is programmable
and/or controlled by software. Depending on the environment and the types of
bugs the results can lead to severe loss, injury or even death.


## How do we know when to stop

Testing should provide sufficient information to stakeholders to make informed
decisions about the release of the software to the next development step or
to customers. Constraints are defined per project, per company and depending
on the goals the software is meant to achieve.

### Exercise: (40 minutes)

* You have the following pseudo code:

function Sudoku(input: Array[2]) {
    .....
    return Array[2]
}

Input is 2 dimensional array, representing known fields in a Sudoku matrix.
Output is the entire Sudoku matrix.

* You are given the following environments (pick one):
** all environments accept user input (the known numbers in Sudoku)
** code is JavaScript, runs in the browser
** code is JavaScript, runs on the server
** code is native, runs on mobile device
** code runs on web server, reads Sudoku variants from DB

* Work in groups of 4-5 people, organized by environment

* Half will analyze and test the code above, the other half will
analyze their peers test cases.

* You have 5 minutes to create test cases to prove that the software works
  correctly.
* Reviewers (5 minutes): Analyze and tell us if the presented solution is enough,
if it is missing something (what) or if it has incorporated unnecessary tests (why)

* Discuss with the class your solution - 20 minutes


## The psychology of testing

### Exercise: (10 minutes)

Read Pages 18-19 from:
http://www.istqb.org/downloads/send/2-foundation-level-documents/3-foundation-level-syllabus-2011.html4

Answer the questions:

* What personal qualities make a good tester ?
* How is testers differ from developers ?

Instructor will quickly discuss with the class the key findings.

## 7 testing principles (from ISTQB)

### Exercise: (20 minutes)

Read the principles below. The instructor will explain what they
mean. Volunteer to stand-up and answer the minor questions below.

1. Testing shows presence of defects
- what does it not show ?

2. Exhaustive testing is impossible
- why ?
- how to deal with this then ?

3. Early testing

4. Defect clustering
- 80/20 rule (of sorts)

5. Pesticide paradox
- no more bugs found in the same place
- and what to do about it

6. Testing is context dependent
- one size doesn't fit all

7. Absence of errors fallacy
- the only software which doesn't have bugs is the one which is not used



## Different levels and types of testing

### Exercise: (40 minutes)

Read Page 24-30 from
http://www.istqb.org/downloads/send/2-foundation-level-documents/3-foundation-level-syllabus-2011.html4

* Ask the instructor to explain individual test levels and types

* Go back to the previous Sudoku example
* Describe which of the proposed tests are Component, System, Integration
or Acceptance tests.
* Which are functional and non-functional. Propose new tests if missing
from previous exercise.
* What is a software regression
* How do we Regression test the new version Sudoku 2.0




## Testing techniques

### Exercise: (30 minutes)

Read Page 37-44 from
http://www.istqb.org/downloads/send/2-foundation-level-documents/3-foundation-level-syllabus-2011.html4

Ask the instructor to give examples and explain the described techniques.


## Homework:

Write down your answers to the above exercises in this file and commit
it under version control.
