# Week 04 & 05 - Loops

- [for loop](https://www.programiz.com/java-programming/for-loop)
  - used when number of iterations is known

```
for (initialExpression; testExpression; updateExpression) {
    do these things
}
```

- [while loop](https://www.programiz.com/java-programming/do-while-loop#syntax-while)
  - used when number of iterations is unknown

```
while (testExpression) {
    do these things
    on repeat
    until testExpression is false
    testExpression is evaulated at beginning of each iteration
}
```

- [do-while loop](https://www.programiz.com/java-programming/do-while-loop#syntax-while)
  - used when number of iterations is unknown

```
do {
    // body of loop
    // testExpression is evaluated at end of each iteration
} while(testExpression);
```

- [break statement](https://www.programiz.com/java-programming/break-statement)
  - used to break out of a loop early, usually based on a condition
  - also used to break out of a switch case statement
- [continue](https://www.programiz.com/java-programming/continue-statement)
  - used to skip current iteration of a loop
  - move to next iteration if a condition is met
- [variable scope](https://www.javatpoint.com/scope-of-variables-in-java)
  - focus on "method" scope for now.
  - variables only exist in the scope of the block they were created
  - ex. if a variable was **declared** in a loop, it is only accessible in the loop. Once the loop exists, the variable can no longer be referenced.
- [nested loops](https://www.programiz.com/java-programming/nested-loop)
- dangers of floating point loop control variables
  - the core message: you can initialize a loop control variable with double or float, but it can lead to... unexpected results.
  - https://chortle.ccsu.edu/java5/notes/chap42/ch42_6.html
  - https://wiki.sei.cmu.edu/confluence/display/java/NUM09-J.+Do+not+use+floating-point+variables+as+loop+counters
