# Week 08 - File I/O

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

- locating files using new File(“.”).getAbsolutePath()
- review of basic String methods
- recommended activity: l33t translator
