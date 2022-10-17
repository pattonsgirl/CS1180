# Week 09 - HashMaps

[Programiz - HashMap](https://www.programiz.com/java-programming/hashmap)

### Initializing a HashMap

```
import java.util.HashMap;
```

HashMaps stores elements in key/value pairs.

**keys** are unique identifiers used to associate each **value** on a map.

```
HashMap<String, Integer> languages = new HashMap<>();
```

### HashMap Methods

All HashMap methods below work as: `mapName.method(arguments)`

- [put() method](https://www.programiz.com/java-programming/library/hashmap/put)
  - .put(key, value) adds the key of "key" and value of "value" to HashMap table.
  - This will also **replace** a value if key exists
- [putIfAbsent() method](https://www.programiz.com/java-programming/library/hashmap/putifabsent)
  - .putItAbsent(key, value)adds the key of "key" and value of "value" to HashMap table **if** key was not already in HashMap
  - returns `null` if the specified key is already not present in the HashMap
- [get() method](https://www.programiz.com/java-programming/library/hashmap/get)
  - .get(key) returns value at key
  - returns null, if either the specified key is mapped to a null value or the key is not present on the HashMap.
- [replace() method](https://www.programiz.com/java-programming/library/hashmap/replace)
  - .replace(key, newvalue) replaces the mapping for the specified key with the specified new value in a HashMap
  - If all values need an update (toUppercase, for example), the [replaceAll method](https://www.programiz.com/java-programming/library/hashmap/replaceall) can be used
- [remove() method](https://www.programiz.com/java-programming/library/hashmap/remove)
  - .remove(key) removes the mapping from the HashMap associated with the specified key
  - .remove(key, value) removes only if the value matches at that key
- [keyset() method](https://www.programiz.com/java-programming/library/hashmap/keyset)
  - .keyset() returns a set view of all the keys present in the HashMap
- [containsKey() method](https://www.programiz.com/java-programming/library/hashmap/containskey)
  - .containsKey(key) checks if the mapping for the specified key is present in the HashMap
- [values() method](https://www.programiz.com/java-programming/library/hashmap/values)
  - .values() returns a view of all the values present in the HashMap
- [containsValue() method](https://www.programiz.com/java-programming/library/hashmap/containsvalue)
  - .containsValue(value) checks if the specified value is present in one or more mappings of the HashMap
- [size() method](https://www.programiz.com/java-programming/library/hashmap/size)
  - .size() returns the number of key/value **pairs** present in the HashMap
- [clear() method](https://www.programiz.com/java-programming/library/hashmap/clear)
  - .clear() clears all key / value pairs in the HashMap
- [isEmpty() method](https://www.programiz.com/java-programming/library/hashmap/isempty)
  - .isEmpty() returns true if HashMap is empty (no key/value pairs)

### Iterating a HashMap

Using a `for-each` loop, can iterate through - keys only - values only - key/value mappings (pairs)

```
    // Example from Programiz
    // iterate through keys only
    System.out.print("Keys: ");
    for (Integer key : languages.keySet()) {
      System.out.print(key);
      System.out.print(", ");
    }

    // iterate through values only
    System.out.print("\nValues: ");
    for (String value : languages.values()) {
      System.out.print(value);
      System.out.print(", ");
    }

    // iterate through key/value entries
    System.out.print("\nEntries: ");
    for (Entry<Integer, String> entry : languages.entrySet()) {
      System.out.print(entry);
      System.out.print(", ");
    }
```
