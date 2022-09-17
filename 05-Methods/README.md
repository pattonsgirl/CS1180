# Week 06 - Methods

- [Java Methods 101](https://www.programiz.com/java-programming/methods)
- purpose of methods
  - reduce redundancy
  - clean up code flow
  - code reusability
- [method syntax](https://docs.oracle.com/javase/tutorial/java/javaOO/methods.html)
  - Access modifiers `public static` are used for intro programmers
    - use the `static` keyword to access methods without creating objects
  - `return_data_type`
    - return `void` (nothing)
    - return _one_ data type
  - `methodName` rules
    - method names should be a verb in lowercase or a multi-word name that begins with a verb in lowercase, followed by adjectives, nouns, etc.
    - in general they use camelCase for multi-word names
  - `parameters`
    - define none (no arguments can be passed to method) `()`
    - define one or more, along with data type and variable name to access within method

```
access_modifiers return_data_type methodName (parameters) {
    // body here;
    // return data_type_data
}
```

- void methods
  - these methods return nothing and declare a return type of `void`

```
public static void printMenu (parameters) {
    // do stuff
    // return statement is optional
}
```

- return values from methods
  - methods can return **one** data type
  - int, double, float, String, char - all options
  - must `return` a value of that type when leaving method

```
public static int calcSum (parameters) {
    // do stuff
    return intValue;
}
```

- define parameters of methods
  - methods can define one or more parameters
  - parameters store the value given when the method is called with arguments

```
public static int calcSum (int var1, String var2, double var3) {
    // values passed by argument to method calcSum
    // can be accessed in method via var1, var2, and var3
    int added = var1 + var2;
    return added;
}
```

- calling a method
  - arguments must be passed in order defined by method parameters
  - store a method's return type in a variable of corresponding type

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

- [variable scope in classes & methods](https://www.geeksforgeeks.org/variable-scope-in-java/)
  - variables declared in a method can only be referenced in that method
    - assuming they are referenced after being defined
  - variables declared outside of methods, or class variables, can be accessed by any method: `final static double GRAVITY = 9.8;`
- method scope
  - methods declared in the same class can be called regardless of order declared
  - is it good practice to declare methods before `main` as other languages are not as forgiving
- [**pass by value** vs pass by reference](https://www.cs.virginia.edu/~jh2jf/courses/cs2110/java-pass-by-value.html)
  - Java is a "pass by value" language.
  - Methods receive a **copy** of data given by argument to a parameter
  - In Java, methods cannot directly modify the original's contents
  - This is compared to C or C++, which allow for pass by reference
    - In these languages, we can pass the **address** the value is stored at, and manipulate directly the data stored at that address
- [overloading methods](https://www.programiz.com/java-programming/method-overloading)
  - methods with the same name, but define different parameter sets

```
public static int feetToInches(int feet, int inches){
    //convert feet to inches, add just inches

    // this is a common thing to do with a method stub
    // return "something", fill in blank later
    return -1;
}

public static int feetToInches(int feet){
    //convert feet to inches

    // this is a common thing to do with a method stub
    // return "something", fill in blank later
    return -1;
}

public static void main(String[] args) {
    int result;
    int feet = 8;
    int inches = 7;
    result = feetToInches(feet);
    result = feetToInches(feet, inches);
}
```
