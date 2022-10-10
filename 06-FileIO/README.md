# Week 08 - File I/O

Note: There are other methods / classes for File Reading / Writing. The notes below cover what is used in the course (what we will know best).

### Catching Exceptions

- **RuntimeException** happens due to a programming error. They are also known as unchecked exceptions
  - InputMismatchException
  - ArithmeticException
  - ArrayIndexOutOfBoundsException
- **IOException** is also known as a checked exception. They are checked by the compiler at the compile-time and the programmer is prompted to handle these exceptions.
  - FileNotFoundException
  - EOFException
- [Rollbar - Java Exceptions Hierarchy](https://rollbar.com/blog/java-exceptions-hierarchy-explained/)
- Syntax of a try/ catch block:
  - [`try... catch... finally...` samples](https://www.programiz.com/java-programming/try-catch)

```
try{
  // code
}
catch(exception) {
  // code
}
```

- `throw` and `throws` keywords
  - `throw new exceptiontype("phrase goes here")`
  - `public class static main(String[] args) throws IOException {`
  - [Programiz - Exception handling](https://www.programiz.com/java-programming/exception-handling)

### Reading from a file

- `import` `java.io.FileInputStream` & `java.util.Scanner`

```
// assuming readdata.txt is in your current working directory
// ie. same folder as your program code
FileInputStream fileByteStream = new FileInputStream("readdata.txt");
Scanner inFS = new Scanner(fileByteStream);
// use inFS. followed by scanner methods
.
.
.
// close file when done
inFS.close();
```

### Writing to a file

- `import` `java.io.FileOutputStream` & `java.io.PrintWriter;`

```
FileOutputStream fileOutStream = new FileOutputStream("output.txt");
PrintWriter outFS = new PrintWriter(fileOutStream);
// use outFS. print, printf, println methods
.
.
.
// close output file & the file Writer (done writing)
outFS.close();
fileOutStream.close();
```

### Creating new files

- `import` `java.io.File`
- `createNewFile` method returns `true` is success and `false` if file already exists
- [Programiz - Java create new file](https://www.programiz.com/java-programming/file)

```
File file = new File("newFile.txt");
// trying to create a file based on the object
boolean value = file.createNewFile();
if (value) {
   System.out.println("The new file is created.");
}
```

### Deleting files

- `import` `java.io.File`
- `delete` method returns `true` is success and `false` if file does not exist
- [Programiz - Java delete file](https://www.programiz.com/java-programming/file)

```
File file = new File("file.txt");
// deletes the file
boolean value = file.delete();
if(value) {
  System.out.println("The File is deleted.");
}
```

### Locating files

- `import` `java.io.File`
- `exists` method returns `true` if file exists in specified location
- `getAbsolutePath` method returns `String` of exact location file is stored on system
- [tutorialspoint - Java getAbsolutePath](https://www.tutorialspoint.com/java/io/file_getabsolutepath.htm)

```
File file = new File("test.txt");
// returns true if the file exists
boolean bool = file.exists();
// if file exists
if(bool) {
    // get absolute path
    path = file.getAbsolutePath();
    // prints
    System.out.print("Absolute Pathname "+ path);
}
```
