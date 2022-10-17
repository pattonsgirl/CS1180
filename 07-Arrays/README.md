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

- [find min / max value in an array](https://beginnersbook.com/2014/07/java-finding-minimum-and-maximum-values-in-an-array/)
- [copy an array](https://programiz.xyz/-/copy-arrays-in-java/)
- [shift array values](https://www.delftstack.com/howto/java/shift-java-array/)
- [shuffle array values - see sample two](https://www.digitalocean.com/community/tutorials/shuffle-array-java)
- [sort - specifically `quicksort`](https://www.programiz.com/java-programming/examples/quick-sort)
- [sort - Arrays.sort](<https://www.javatpoint.com/how-to-sort-an-array-in-java#:~:text=In%20Java%2C%20Arrays%20is%20the,(n%20log(n)).>)

### Arrays & Methods

[Software Testing Help - Passing & Returning Arrays](https://www.softwaretestinghelp.com/pass-return-array-in-java/)

### Command line arguments

[Programiz - Java Command Line Arguments](https://www.programiz.com/java-programming/command-line-arguments)

To talk about command line arguments for a program, first we need to discuss compiling source code and running the compiled code using commands.

In VS Code, you get access to a Terminal when you select the Play / Run Java button. This is `Powershell` (if you are a Windows user).

In the Terminal, type `javac` or `java` and hit enter. You should get a very long help menu. Let's look at how to use these commands.

`javac sourcecode.java` will compile a source code file named `sourcecode.java` into a **class** file named `sourcecode.class` This will be a file that is created by this command.

`java sourcecode` (note the `.class` extension is not used) will run the `.class` file named `sourcecode`, if it exists. If this "does not work", check you compiled your source code.

```
public static void main(String[] args)
```

You've been creating a `class` with a `main` method. `main` is a method with a parameter defined - an `array` of type `String` called `args`

To **populate** the array, you pass arguments via the command line.

`java sourcecode 3 4 hello "my name"`

In `main`, you can write code to access these values, and check if values were given

```
int argc = args.length; // get number of elements passed

System.out.println(args[3] + " is " + args[2]); // Outputs: my name is hello

int val1 = Integer.parseInt(args[0]); // converts "3" to 3 for usage as an int
```
