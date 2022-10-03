## Data types

- int
- double
- float
- char
- String
- bool
- data type overloading
- data type conversion

## Mathematical operations

- `+`, `-`, `*`, `/`, `%`
- order of operations
- Math class

## Conditionals

- relational operators
  - `==`
  - `<`
  - `<=`
  - `>`
  - `>=`
  - `!=`
- logical operators
  - `||`
  - `&&`
  - `!`
- if statements:

```
if (condition) {
    do these things
}
else if (condition) {
    do these things
}
else {
    do these things
}
```

- switch statements

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

- ternary operators
  - `variable = Expression ? expression1 : expression2`

## String operations

- Syntax: stringName.method(stuff) Return types vary based on method purpose
- length()
- toUpperCase()
- toLowerCase()
- equals(String s)
- charAt(int i)
- indexOf(String s)
- substring(int i, int j)
- contains(String s)
- compareTo(String s)
- concat(String b)
- replace(String a, String b)
- split(String delimiter)
  - will revisit w/ arrays

## Character operations

- relational operators & characters
- Character.isLetter(char c)
- Character.isDigit(char c)
- Character.isWhitespace(char c)
- Character.toUpperCase(char c)
- Character.toLowerCase(char c)

## Loops

- for loop

```
for (initialExpression; testExpression; updateExpression) {
    do these things
}
```

- while loop

```
while (testExpression) {
    do these things
}
```

- do while

```
do {
    // do these things
} while(testExpression);
```

- break
- continue

## Methods

- `main`
- return types
- parameter definitions
- calling methods
- passing methods arguments
- method overloading

```
access_modifiers return_data_type methodName (parameters) {
    // body here;
    // return data_type_data
}
```

```
// method has no parameters and no return value
printMenu();
// method has no return value but defined parameters
printMenu(arg1, arg2, ...);
// method has return value but no parameters
int result = addRandNums();
// method has return value and defined parameters
double result = calcAverage(num1, num2, num3);
```
