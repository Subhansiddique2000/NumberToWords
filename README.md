# NumberToWords
It converts an integer to works
## Methods Used
* getDigitCount(): To calculate how many digits for in an integer. For example '123' is 3 digits
* reverse(): To reverse an integer. For example '123' would be '321'
* numberToWords(): will convert the reversed number to words so the output would be 'one two three' for '123'. Rather then 'three two one'
## I/O
Input:
```java
getDigitCount(101);
getDigitCount(123);
getDigitCount(reverse(1000));
getDigitCount(1000);
reverse(101);
reverse(1212);
reverse(1234;
reverse(100);
numberToWords(13400);
```
Output:
```java
3
3
1
4
101
2121
4321
1
One
Three
Four
Zero
Zero
```
