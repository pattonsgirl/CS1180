# Week 09 - ArrayLists

[Programiz - ArrayLists](https://www.programiz.com/java-programming/arraylist)

### Initializing an ArrayList

```
import java.util.ArrayList;
```

ArrayLists keep arrays of Objects (Integer), not primitive data types (int)

```
ArrayList<Integer> data = new ArrayList<Integer>();
```

ArrayLists do not get initialized to a set `size` - rather they can grow (`add`) or shrink (`remove`).

### ArrayList methods

All ArrayList methods below work as: `listName.method(arguments)`

- [add() method](https://www.programiz.com/java-programming/library/arraylist/add)
  - .add(value) appends element value to end of list
  - .add(index, value) sets value at index to be `value` - elements effected have their indices moved up by one. See `set` method if you are looking to replace
- [get() method](https://www.programiz.com/java-programming/library/arraylist/get)
  - .get(index) returns value at index
- [set() method](https://www.programiz.com/java-programming/library/arraylist/set)
  - .set(index, value) sets value at index to be new `value`
- [sort() method](https://www.programiz.com/java-programming/library/arraylist/sort)
  - sorts the elements in an ArrayList according to the specified order.
  - .sort(comparator) specifies sort type
  - `Comparator.naturalOrder()` = ascending order
  - `Comparator.reverseOrder()` = descending order
- [remove() method](https://www.programiz.com/java-programming/library/arraylist/remove)
  - .remove(value) removes first occurrence of value in ArrayList
  - .remove(index) removes index from ArrayList. Indices or elements after are shifted up one
- [clear() method](https://www.programiz.com/java-programming/library/arraylist/clear)
  - .clear() clears ArrayList - sets size to 0
- [size() method](https://www.programiz.com/java-programming/library/arraylist/size)
  - .size() returns number of elements in ArrayList
- [isEmpty() method](https://www.programiz.com/java-programming/library/arraylist/isempty)
  - .isEmpty() returns true if ArrayList is empty, else returns false
- [contains() method](https://www.programiz.com/java-programming/library/arraylist/contains)
  - The contains() method checks if the specified element is present in the ArrayList.
  - .contains(value) checks if value is present in ArrayList
    - does not return index of location of value
- [indexOf() method](https://www.programiz.com/java-programming/library/arraylist/indexof)
  - .indexOf(value) returns index of value in ArrayList
    - Returns `-1` if not found

### Iterate through ArrayList
