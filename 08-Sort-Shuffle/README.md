# Sort & Shuffle

This is an extra deep dive into sorting and shuffling for the curious.  You'll hit this again in CS 1181 & CS 3100 (and other various courses).

What to know in general: there are a variety of algorithms that sort and that shuffle.  Which one you pick comes down to knowing your data and knowing the system you are running on - hardware can create interesting limitations.

## Sorting Algorithms

Common algorithms:
- Selection sort - see [basicarraysort.java](../07-Arrays/basicarraysort.java) for a rough demo
    - [Geeks for Geeks - Selection Sort](https://www.geeksforgeeks.org/selection-sort/)
- Bubble sort
- Insertion sort
- [Merge sort - used by Java `Collections`](https://programiz.com/dsa/merge-sort)
- Quick sort
- Heap sort
- Counting sort
- Radix sort
- Bucket sort
- Cocktail sort
- [Wikipedia - all acknowledged sorts](https://en.wikipedia.org/wiki/Sorting_algorithm)

You need to know options exist because some libraries are going to let you use a sort.  For example, you can `.sort()` and `ArrayList`.  An `ArrayList` is a `Collection` of Objects.  The Java `Collection` framework contains a sort that implements **merge sort**

[Read here about how to use the `sort` from `Collections` on things like ArrayLists](https://www.programiz.com/java-programming/collections-sort)

### Resources
- [Read about each algorithm](https://www.freecodecamp.org/news/sorting-algorithms-explained-with-examples-in-python-java-and-c/)
- [See how things shift in a static chart](https://observablehq.com/@stwind/sorting-algorithms)
- [VIDEO - watch and listen to sorting algorithms in action](https://www.youtube.com/watch?v=kPRA0W1kECg&ab_channel=TimoBingmann)
- [VIDEO - watch a side-by-side to see time-to-sort](https://www.youtube.com/watch?v=BeoCbJPuvSE&ab_channel=ViktorBohush)