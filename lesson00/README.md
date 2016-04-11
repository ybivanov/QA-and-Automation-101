# Intro to Java

In order to use JUnit & Selenium, we are going to introduce ourselves to some basic Java concepts.

## Requirements

You need to have:

* [Java](https://java.com/en/download/)
* Some Java IDE (For example - [Eclipse](https://eclipse.org/subversive/latest-releases.php))

## Materials

The slides can be found here:

* [Intro to Java - Types, Data Structurs & Basic Object Model]()
* [Intro to Java - Polymorphism - Interfaces & Abstrat Classes]()
* [Intro to Java - Exceptions & JUnit]()

## Problem 1 - Zero Insertion

In a `com.hackbulgaria.qa.week1` package, create a class called `ZeroInsertionImpl` which implements the following interface:

```java
public interface ZeroInsertion {
  public int zeroInsertion(int n);
}
```

The method should return a new integer, based on the following rules:

* If two neighboring digits are the same (like `55`), insert a 0 between them (`505`)
* Also, if we add two neighboring digits and take their module by 10 (`% 10`) and the result is 0 - add 0 between them.

For example, if we have the number `116457`, result will be: `10160457`:

* 1 and 1 are the same, so we insert 0 between them
* `6 + 4 % 10 = 0`, so we insert 0 between them.


### Examples

```java
zeroInsertion(116457) == 10160457
zeroInsertion(55555555) == 505050505050505
zeroInsertion(1) == 1
zeroInsertion(6446) == 6040406
```

## Problem 2 - Hack Numbers

In a `com.hackbulgaria.qa.week1` package, create a class called `HackNumbersImpl` which implements the following interface:

```java
public interface HackNumbers {
  // checks if n is a hack number
  public boolean isHack(int n);
  // returns the next hack number, that is bigger than n
  public int nextHack(int n);
}
```

A hack number is an integer, that matches the following criteria:

* The number, represented in binary, is a palindrome
* The number, represented in binary, has an odd number of 1's in it

Example of hack numbers:

* 1 is `1` in binary
* 7 is `111` in binary
* 7919 is `1111011101111` in binary

### Examples

```java
isHack(1) == True
nextHack(0) == 1

isHack(21) == True
nextHack(10) == 21

isHack(8191) == True
nextHack(8031) == 8191
```

## Problem 3 - 100 SMS

In a `com.hackbulgaria.qa.week1` package, create a class called `OneHundredSmsImpl` which implements the following interface:

```java
public interface OneHundredSms {
  public String numbersToMessage(int[] numbers);
  public int[] messageToNumbers(String message);
}
```

Before the smartphones, when you had to write some message, the keypads looked like that:

![Nokia 3310 Keypad](nokia.jpg)

For example, on such keypad, if you want to write **Java**, you had to press the following sequence of numbers:

```
528882
```

Each key contains some letters from the alphabet. And by pressing that key, you rotate the letters until you get to your desired one.

It's time to implement some encode / decode functions for the old keypads!

### `String numbersToMessage(int[] numbers)`

First, implement the function that takes a array of integers - the sequence of numbers that have been pressed. The function should return the corresponding string of the message. 

There are a few special rules:

* If you press `1`, the next letter is going to be capitalized
* If you press `0`, this will insert a single white-space
* If you press a number and wait for a few seconds, the special breaking number `-1` enters the sequence. This is the way to write different letters from only one keypad!

Few examples:

```
* numbersToMessage([2, -1, 2, 2, -1, 2, 2, 2]) == "abc"
* numbersToMessage([2, 2, 2, 2]) == "a"
* numbersToMessage([1, 4, 4, 4, 8, 8, 8, 6, 6, 6, 0, 3, 3, 0, 1, 7, 7, 7, 7, 7, 2, 6, 6, 3, 2])
==
"Ivo e panda"
```

### `int[] messageToNumbers(String message)`

This function takes a string - the `message` and returns the **minimal** keystrokes that you need to write that `message`

Few examples:

```
messageToNumbers("abc") == [2, -1, 2, 2, -1, 2, 2, 2]
messageToNumbers("a") == [2]
messageToNumbers("Ivo e panda")
==
[1, 4, 4, 4, 8, 8, 6, 6, 0, 3, 3, 0, 1, 7, 2, 6, 6, 3, 2]
messageToNumbers("aabbcc") == [2, -1, 2, -1, 2, 2, -1, 2, 2, -1, 2, 2, 2, -1, 2, 2, 2]
```

For more information about Java, see:
https://github.com/HackBulgaria/Programming101-Java
