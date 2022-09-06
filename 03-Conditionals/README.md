# Week 03 - Conditionals

- Note: no class Monday 9/5
- [booleans](https://www.youtube.com/watch?v=kTHNpusq654)
  - data type that stores `true` or `false`
  - https://www.w3schools.com/java/java_booleans.asp
- [If/Else Statements](https://www.w3schools.com/java/java_conditions.asp) aka conditional expressions

```
if (expression) {
  //what to do if expression is true
}
else if (expression2) {
  //what to do if expression2 is true
}
else {
  //what to do if all expressions were false
}
```

- [Relational operators](https://www.programiz.com/java-programming/operators)

  - `==`
    - A == B, A is equal to B
  - `!=`
    - A != B, A is NOT equal to B
  - `<`
    - A < B, A is less than B
  - `>`
    - A > B, A is greater than B
  - `<=`
    - A >= B, A is greater than or equal to B
  - `>=`
    - A <= B, A is less than or equal to B

- [Logical operators](https://www.programiz.com/java-programming/operators)

  - `&&` - AND
    - A OR B, A or B are true (A is true or B is true or both are true)
    - If both are false, then the result is false
  - `||` - OR
    - A AND B, A and B are true
    - If A or B is false, then the result is false
  - `!` - NOT
    - NOT (A), opposite day
    - If A was true, it is now false
    - If A was false, it is now true

- [Short-circuit evaluation](https://www.geeksforgeeks.org/short-circuit-logical-operators-in-java-with-examples/)

- [String comparison](https://www.baeldung.com/java-compare-strings)
- [Switch statements](https://www.w3schools.com/java/java_switch.asp)

```
switch(expression){
  case static_condition:
    //what to do for case
    break;
  case other_condition_value:
    //what to do for case
    break;
  default:
    //if no other conditions met, do this
    break;
}
```

- Ternary operator
  - aka conditional operator - shorthand for if-then-else statements
  - `variable = Expression ? expression1 : expression2`
  - If the `Expression` is true, `expression1` is assigned to the variable, else assigned `expression2`
  - https://www.w3schools.com/java/java_conditions_shorthand.asp
