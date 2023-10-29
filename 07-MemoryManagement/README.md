# Somewhere after Arrays - Memory Management

At some point, you know enough that you need to start to know how it really works.

To that end, there are two talks we need to have:
- Memory allocation on the **stack** versus the **heap**
- The role of the **Java Garbage Collector**

## Stack vs Heap


## Garbage Collector

Quick note: Java does not have a one-size fits all Garbage Collector.  There are different garbage collectors for different scopes of work.  Dig into the resource articles at the bottom of this section for more info.

Java has a built in **Garbage Collector**.  At a super high level metaphor, here's what
happens:
- You go to the grocery store and buy stuff.  You take it all to your kitchen.  Some stuff you use to make a meal come together, some you don't use at all, some things you use for a moment, like a spice, but then you're done with it. But it's all in your kitchen.
    - This is your program reserving space for `int`s, `double`s, `arrays`, popping into and out of methods, etc.
- When you leave your kitchen, a cleaner comes in, does all the dishes and clears all the counters, closes the cabinets and recipe books.
    - This is the **Garbage Collector**

You need to care that Java does this for you because other languages won't.  C & C++ are likely to be the first languages you encounter where you will be responsible for allocating and releasing memory.

You should know by now that methods allocate memory for items in it.  But one you exit that method and return to the next statement in your code, that memory is eligible for cleanup.  If you call the method again, that will be new allocations of memory.  (Yes, passing arrays, as we learned, is different as the memory address is passed, not a value).

The Java **Garbage Collector** has a primary set of jobs that make you able to program relatively care free:
1. Identify all objects that are still in use or "alive".
2. Remove all other objects that are considered dead or unused (i.e., unreachable).

### Resources:

I ranked these based on how in the weeds they go.

- [Memory Management in Java: An Introduction](https://foojay.io/today/java-memory-management/)
- [Video - G1: Java's Default Garbage Collector](https://inside.java/2023/10/15/g1/)
- [Get in-depth information on Java Garbage Collection](https://www.eginnovations.com/blog/what-is-garbage-collection-java/)
