
Simple Java, JUnit and ANT Example
==================================

Prerequisites
=============

Java 1.6+ JDK and JRE
---------------------

Check if they are installed already
$ java -version
java version "1.6.0_24"
OpenJDK Runtime Environment (IcedTea6 1.11.3) (6b24-1.11.3-1ubuntu0.11.04.1)
OpenJDK Client VM (build 20.0-b12, mixed mode, sharing)
$ javac -version
javac 1.6.0_24

If not, then see

Oracle Java
http://www.oracle.com/technetwork/java/javase/overview/index.html
OR
OpenJDK Java
http://openjdk.java.net/

JUnit 1.4+
----------

This is in lib/junit-4.10.jar
From http://github.com/KentBeck/junit
See junit.licence for licencing

ANT 1.8+
--------

Check if it is installed already
$ ant -version
Apache Ant(TM) version 1.8.4 compiled on May 22 2012
 
If not, then see http://ant.apache.org/bindownload.cgi

After installing ensure ANT is in your path e.g.
$ export PATH=/home/user/apache-ant-1.8.4/bin:$PATH

Use
===

Compile and JAR
$ ant jar

Run
$ java -classpath lib/math.jar math.Math 1 2

Compile and JAR tests
$ ant jarTests

Run tests
$ ant runTests
runTests:
    [mkdir] Created dir: /home/user/ci/java/build/test-xml
    [mkdir] Created dir: /home/user/ci/java/build/test-html
    [junit] Running MathTest
    [junit] Tests run: 2, Failures: 0, Errors: 0, Time elapsed: 0.407 sec

testreport:
...
BUILD SUCCESSFUL

View results
XML test reports are put in build/test-xml
HTML test reports can be browsed via build/test-html/index.html

Clean up
$ ant clean

Copyright and contact
=====================

Mike Jackson - info@software.ac.uk

Copyright (c) The University of Edinburgh, 2012.
