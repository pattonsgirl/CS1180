# Week 08 - Arrays

- [Programiz - Java array w/ examples](https://www.programiz.com/java-programming/arrays)

### What is an array

An array of a collection / list of similar types

- A `String` is an array of `char`acters
- As an intro, we will play with arrays of "primitive" data types
  - `int`, `char`, `double`, `byte`, `short`, `float`, `boolean`
- Once declared, the size **or length** of an array in Java is fixed
- An array reserves a **block** of memory to store n-many elements of the datatype specified
- Array indices are actually addresses of heap locations (location in memory where the array exists when the program runs)
  - Note: this is easier to see and play with in C / C++ since it supports **pointers**, a data type for addresses

### Declaring an array

- `double[] data;`

  - creates the array, but does NOT set a size. This array would not yet be usable until a size is declared: `data = new double[4];`

- `double[] data = new double[numElements];`

  - creates the array and sets it to size / length `numElements`

- `double[] data = {2.3, 1.2, 8.9, 4.0}`

  - creates the array and loads each element with a default value.
  - size is set to number of elements listed on declaration

### Accessing array elements

The table below is of an array initialized to hold 5 **elements**

- `int[] numarr = {24, 90, 65, 32, 3};`

The value stored in each element of the array can be accessed by **index**
To access the value, use the array name followed by `[`, `index` number, and `]`

- `System.out.println(numarr[3]);` Would print `32` to the console
- `numarr[3] = 42;` would store the value 42 in `numarr` at index 3 (element 4)

Valid array **indices** are 0 to n-1, where n is the number of elements in the array

- The **first** index of an array is **0**
- The **last** index of of array is **number of elements - 1** OR **arrayname.length - 1**
  - In the table below, index **5** or `numarr` would return an **index out of bounds exception**

| Element | Value | Index |
| ------- | ----- | ----- |
| 1       | 24    | 0     |
| 2       | 90    | 1     |
| 3       | 65    | 2     |
| 4       | 32    | 3     |
| 5       | 3     | 4     |

#### Length / size of an array

Arrays have a method, `length` that returns the number of elements of the array.

- `int size = numarr.length;`
- Example situation: User defines how many elements for an array.
  - Program defines size of array based on user input.
  - Program prompts user for values to fill array of defined size.

#### Printing / manipulating values stored in array

To print an array, need to know how many elements are in the array.  
Can query the size using `arrayname.length` to get number of elements.  
Can use the iterator of a `for` loop to access each index value.

```
for (int i = 0; i <= arrayname.length - 1; i++) {
  // starting at 0, going to number of elements minus 1
  System.out.println(i);
}
```

#### Converting array `toString` for printing

Sometimes you want an array to print, and three lines of a for loop is too much code. Check out this magic, but note it is **only useful for printing an array**

- `import java.util.Arrays;`
- `System.out.print("All values in numarr: " + Arrays.toString(numarr));`

#### `for-each loop`

Can also use an [**enhanced for loop aka `for-each` loop**](programiz.com/java-programming/enhanced-for-loop) - since an array is a list being accessed index by index, there is a `for` loop designed for that purpose

```
// Think for each value at each index of the array
// store the value at the index in `num`, iterate by one each time
for (int num: numarr) {
  System.out.println(num); // prints value
}
```

### ArrayIndexOutOfBoundsException

If an attempt is made to access a non-existent array index for a given array,
an **Array Index Out Of Bounds Exception** exception will be thrown.  
Exception can be caught in `try / catch`

# Week 09 - More on Arrays

### Strings and arrays

A String is an array of characters. A String can be split into an array of substrings using the [`split` method](https://www.programiz.com/java-programming/library/string/split).

- The String `split()` method can take two parameters:

  - `regex` - the string is divided at this regex (can be strings)
    - regex = regular expressions. Defines a pattern of text to look for
  - `limit` (optional) - controls the number of resulting substrings

- The String `split()` method returns an array of substrings

```
String text = "Java is a fun programming language";

// split string, use "space" as separation character to split on
String[] result = text.split(" ");
```

### Array Operations

- Common array operations (copy, findMin, shuffle, shift, etc.)

### Command line arguments

- command line arguments
- var args

### Arrays & Methods

- passing
- returning

### ArrayLists

- adding, removing, retrieving and iterating

### HashMaps

- adding, removing, retrieving and iterating
