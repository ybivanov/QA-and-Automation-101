# Lesson 9 - Introduction to performance testing

Performance testing is a testing practice performed to determine how a system
performs in terms of responsiveness and stability under a particular workload.
It can also serve to investigate, measure, validate or verify other quality
attributes of the system, such as scalability, reliability and resource usage.

### Exercise: (45 minutes)

Read the following articles:

* https://en.wikipedia.org/wiki/Software_performance_testing
* https://msdn.microsoft.com/en-us/library/bb924357.aspx

NOTE: Instructor will discuss with the class individual types of performance
testing activities and what their goals/benefits are. Examples will be given
for all of them (so write them down).

Answer the following questions:

* What are the different purposes of performance testing
* Which questions are important for a performance specification


### Exercise: (45 minutes)

* Discuss with the class and instructor the following examples

Profiling tools (among others) may be used to measure performance of
individual components like functions. For more information see:
* http://atodorov.org/blog/2014/11/05/performance-profiling-in-python-with-cprofile/
* http://atodorov.org/blog/2015/12/23/interesting-ruby-resources/
* http://atodorov.org/blog/2014/11/05/speeding-up-celery-backends/
* http://atodorov.org/blog/2014/11/07/speeding-up-celery-backends-part-2/
* http://atodorov.org/blog/2014/11/11/speeding-up-celery-backends-part-3/

For more examples of simple performance tests see:
* http://atodorov.org/blog/2013/02/05/performance-test-md5-sha1-sha256-sha512/
* http://atodorov.org/blog/2013/02/26/performance-test-amazon-ebs-vs-instance-storage-pt1/
* http://atodorov.org/blog/2013/06/26/performance-test-amazon-elasticache-vs-amazon-s3/
* http://atodorov.org/blog/2014/11/19/speed-comparison-of-web-proxies-written-in-python-twisted-and-go/

### Exercise: (60 minutes)

* Create a simple performance test to measure which Crypt class from
Apache Commons Codec is faster. Classes can be found under
`commons-codec/src/main/java/org/apache/commons/codec/digest`

* HINT: Use one of the solutions at:
http://stackoverflow.com/questions/3382954/measure-execution-time-for-a-java-method/3383047


### Exercise: (90 minutes)

* Your application under test is GitHub
* It is generally accepted that there are 10 million user accounts on GitHub
* Work in small groups
* Make a list of which of all GitHub features need to be performance tested the most
* Discuss with other groups and instructor your lists
* Select one of the features from your list to work on
* Create a performance test plan for the chosen feature
 * what performance test types are you going to use
 * what information do you expect to produce from them
 * HINT: Ask instructor for a simulated arhitecture overview of GitHub

