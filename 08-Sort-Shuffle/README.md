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

## Shuffling Algorithms

Some argue that the act of shuffling is to un-sort something.  But how to shuffle algorithmically (using programming) is neat!

This [link is fantastic for breaking down how to approach shuffling](https://bost.ocks.org/mike/shuffle/).  I like that it shows how you would first think about shuffling, and the issues with under-thinking the problem.  It focuses on leading you to the Fisher-Yates shuffle.

Common Algorithms:
- Fisher-Yates shuffle

A hunk of algorithms are based on shuffling cards for exactly the reason you think - online gambling is huge, and accurately shuffling decks is important.  You can [look at different card shuffling strategies here](https://en.wikipedia.org/wiki/Shuffling).  Today I learned I do a Corgi shuffle.

Now, just like with `sort` above, some libraries are going to include a `shuffle`.  `shuffle` is again implemented by `Collections` - the idea here is we **shuffle** on Objects.  An `ArrayList` is a `Collection` of Objects.  The Java `Collection` framework contains a shuffle that implements **Fisher-Yates**.

[Read here how to use `shuffle` from `Collections` on things like `ArrayLists`](https://www.digitalocean.com/community/tutorials/shuffle-array-java)

### Resources
- [Other shuffling algorithms represented visually](https://observablehq.com/@jonhelfman/shuffling-algorithms)



