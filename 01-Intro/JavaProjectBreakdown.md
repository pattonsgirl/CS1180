# Dissecting Hello World

When you first create a Java project in VSCode, you will be given a starter template as pictured below.

![First Project](firstproject.PNG)

Let's discuss some things going on here.  We'll be revisiting a lot of this once we have more knowledge under our belt, but we should give a few things a nod.

## Project Folder Contents

Looking at your side bar, you'll see that within your project a series of folders were created.

- `.vscode`
- `bin`
  - You will write source code (in java) in files in the `src` folder.  When you "run" your program (shortcut is F5 key), your course code will be compiled  
  into a binary.  The compiled binary(ies) will be here, in your `bin` folder.
  - You don't edit these.  You edit the source code, then compile a new binary.
  - Fun fact: you can run this on any machine that has a JRE (you installed JDK, which in development + runtime).  It's compiled and ready to be ran in a  
  Java Virtual Machine 
- `lib`
  - collection of JAR files or folders with compiled classes, which can optionally have associated source files and Javadoc documentation
  - Let's say Bob wrote a cool Java class, and you'd like to use what he made and create solutions with it.  Bob could create a jar, and you could import  
  it into your project
  - Anything put in `lib` at the project level will only be available to that project
- `src`
  - Where your source code goes!
  - In java, source code files need a `.java` extentsion.
  - The name of the Java file must be the name of the **class**
    - **A program needs an entry and a Java program needs a class to host its entry.**
  - `App.java`
    - A hello world starter program.  See below for comments on the contents
- `README.md`
  - This is a README file.  `.md` means you can format it with [markdown](https://www.markdownguide.org/basic-syntax/)
  - What should go here is a plain english description of your project

## `App.java` Contents

`App.java` is created by default and is in the `src` folder of your project.  At the time of this writing, it is a lovely "Hello, World!" program,  
which is the traditional start for any language or project

```
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}
```

Let's talk about what these lines of text mean.

```
public class App {
```
- In Java, every line of code that can actually run needs to be inside a `class`. This line declares a `class` named `App`, which is `public` 
  - `public` means any other `class` can access it (topic for another day).
  - Note that the **class** name is **`App`** **and** the **file** name is **`App.java`**
  - Failure to follow the name rule will result in a **compiliation error** - as in the code will not compile (and therefore your compiled program will not execute)

```
    public static void main(String[] args) throws Exception {
```
- This is the entry point of our Java program. The `main` **method** has to have this exact structure in order to be able to run our program.
- The `main` method will always be the first method to run in any program
- `public static`
  - The `public` keyword is an access specifier, which allows the programmer to control the visibility of `class` members. 
  - When a `class` member is preceded by `public`, then that member may be accessed by code outside the class in which it is declared. (The opposite of public is private, which prevents a member from being used by code defined outside of its class.)
  - In this case, `main` must be declared as public, since it must be called by code outside of its class when the program is started.
  - The keyword `static` allows `main` to be called without having to instantiate a particular instance of the `class`. This is necessary since `main` is called by the Java interpreter before any objects are made. 
  - [Source](https://stackoverflow.com/questions/2390063/what-does-public-static-void-mean-in-java)
- `void`
  - The method `main` does not return a value.  We will get to returning values from methods.
- `main`
  - name of the method.  A method named `main` needs to exist as a driver for what the program does.
- `String[] args`
  - The arguments that we can capture when running the program with parameters
  - `java App.class 7 hello Bob`
- `throws Exception`

```
        System.out.println("Hello, World!");
```
- `System` is a pre-defined class that Java includes and it holds some useful methods and variables.
- `out` is a static variable within `System` that represents the output of your program (stdout = standard output).
- `println` is a method of `out` that can be used to print a line.

## Other References

- [Learn Java Online - Hello World](https://www.learnjavaonline.org/en/Hello%2C_World%21)

