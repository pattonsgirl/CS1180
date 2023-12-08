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
- Random number generators

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
- see [03-Conditionals](../03-Conditionals/)

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
- see [04-Loops](../04-Loops/)

## Methods

- `main`
- return types
- parameter definitions
- calling methods
- passing methods arguments
- method overloading
- scoping & methods
- see [05-Methods](../05-Methods/)

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

## Exceptions & File I/O

- try-catch-finally statements (I don't care about finally)
- using try-catch statements to prompt user for correct input type

```
try{
  // code
}
catch(exception) {
  // code
}
```

- read data from a file
- write data to a file
- close reader / writer (and correct order)
- see [06-FileIO](../06-FileIO/)

## Arrays

- one-dimensional arrays
- elements & indices
- size of an array & manipulating array elements
  - finding min, max, sorting
- command line arguments
- arrays & methods
- for-each loop
- parallel arrays (having related data stored at known indices across arrays)
- multi-dimensional arrays (accessing elements via multiple indices)
- see [07-Arrays](../07-Arrays/) and [10-2DArrays](../10-2DArrays/)

## ArrayLists

- defining ArrayList of objects
  - Integer, Double, String, & custom objects
- methods that manipulate an ArrayList
- accessing elements of an ArrayList by index
- note: a pro of an ArrayList is using sort
  - to use sort on an ArrayList of custom objects, be aware of what method(s) need to be overridden and defined in the class
- see [08-ArrayLists](../08-ArrayLists/)

## HashMaps

- defining a HashMap of key/value pairs
- methods to access and manipulate data in a HashMap
- ~~hashCode & storing data without an index~~
- ~~note: to use custom objects as keys, an overridden hashCode method needs to be defined in the class, along with an overridden equals method~~
- see [09-HashMaps](../09-HashMaps)

## Classes & Objects

- using classes to define objects
  - fields
  - Constructors
  - class methods
    - static vs non-static methods
  - access modifiers (public versus private)
- Java Class Diagrams & UMLs (how to read them to build a class)
- Use of the `this` keyword
- Overriding:
  - `toString` to print an object
    - `System.out.println(objectA);`
  - `compareTo` to compare object order (primarily for sorting)
    - see [Demos](../11-Classes-Objects/Demos/)
  - ~~`hashCode` to use objects as keys (HashMaps cannot have duplicate keys)~~
    - see [HashDemo](../11-Classes-Objects/HashDemo/)
  - `equals` to check if two objects are equivalent
    - `objectA.equals(objectB);`
- see [11-Classes-Objects](../11-Classes-Objects/)
