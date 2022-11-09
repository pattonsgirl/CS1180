# What's inside

Everything is in the `src` folder

## Classes

- [Candy.java](src/Candy.java)
  - `implements Comparable<Candy>` to create a custom `compareTo` method
    - this is then used by `sort`
  - defines properties for objects made with class `Candy`
  - constructors for Candy
  - getter and setter methods for properties
  - `toString` method to print Candy objects
  - `equals` method to check if Candy objects are equals (properties have same value)
  - `compareTo` method that defines priorities of properties to sort an object
    - in this implementation, sorts by Candy `name`, then `quantity`
- [Bowl.java](src/Bowl.java)
  - imports `java.util.Collections`
  - defines properties for objects made with class `Bowl`
    - includes an `ArrayList` of `Candy` objects
  - constructors for Bowl
  - getter and setter methods for properties
  - `addCandy` - adds `Candy` object to `ArrayList` of candies
  - `eatCandy` - overloaded method (there are two)
    - one removes a Candy by index
    - one removes a Candy by description of the Candy
  - `sortCandies` - calls `sort` on ArrayList of candies
    - `sort` looks for `compareTo` in Candy class

## Driver programs - each has a `main` method

- [App.java](src/App.java)
  - focuses on playing with `Candy` class, creating objects, and creating an `ArrayList` of those object types
- [AppwBowl.java](src/AppwBowl.java)
  - creates `Bowl` objects - bowls have a `location` and `ArrayList` of `candies`
- [AppwSortCandy.java](src/AppwSortCandy.java)
  - plays with how `compareTo` works (the rules), calls a method in `Bowl` to sort the `candies`
