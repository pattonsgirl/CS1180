# Final Exam Coding Problem

- [Book class](#book-class---minimum-implementation)
- [Driver program](#driver-program---minimum-implementation)
- [**Bonus Options**](#bonus-options)
- [Rubric](#rubric)
- [Sample program run](#sample-program-run)

Using `javadoc` standards and good comments are a rubric item (worth 1 of 10 points)

## Book class - minimum implementation

Create a class called Book using the following UML diagram. A scaffolded Book class is available in Pilot to download.  Additional methods or setters for the class are optional based on how you implement the program logic. 

Notes: 
- By default, books are available.  
- A new book has a condition score of 10, indicating mint condition.

| Book |
| --- |
| -title: String |
| -author: String |
| -isbn: String |
| -available: boolean |
| -condition: int |
| +Book(title: String, author: String, isbn: String) |
| +getTitle(): String |
| +getCondition(): int |
| +setCondition(num: int): void |
| +checkout(): void |
| +checkin(): void |
| +toString(): String |

## Driver program - minimum implementation

1. Create a `library` - an `ArrayList` of three books. Prompting the user is not required.  For the purpose of speed, it is recommended to copy / paste the table values or use the lines below the table.
   | Title | Author | ISBN |
   | -- | -- | -- |
   | The Three-Body Problem | Cixin Liu | 0765377063 |
   | Unlikely Animals | Annie Hartnett | 059316024X |
   | Learn Java the Easy Way | Bryson Payne | 1593278055 |

```
("The Three-Body Problem", "Cixin Liu", "0765377063")
("Unlikely Animals", "Annie Hartnett", "059316024X")
("Learn Java the Easy Way", "Bryson Payne", "1593278055")
```

2. Print all books in `library`

3. Prompt the user for a book title. Show information about the book specified per the following format:

```
Title: The Three-Body Problem
  Author: Cixin Liu
  ISBN: 0765377063
  Available for checkout: true
  Condition: 10
```

4. Checkout a book by prompting the user for a book title.

   - use the `checkout` method in the `Book` class to change the `available` field to `false` for the book specified.
   - if the book is not available, output "This title is not available".
   - print book details after status changes.

5. Check-in a book by prompting the user for a book title.
   - use the `checkin` method in the `Book` class to change the `available` field to `true` for the book specified.
   - decrease the condition of the book by 1.
   - print book details after status changes

## Bonus Options

You may complete 1 or all 3 options presented below.  1 point per bonus implemented.

1. Create a `searchLibrary` method that returns the Book object given the `library` and book title
2. Check all book conditions.  If any are less than 2, remove them from the `library`
3. Implement a menu that enacts the features above.  Only a user input of `6` should end the program.  The menu must have the following options:
```
1 - view library
2 - view book info
3 - checkout book
4 - checkin book
5 - check library condition
6 - end program
```

## Rubric ( / 10)

**Code that does not compile will not be given any credit**  
If you have a piece to the solution that is buggy, comment it out, and partial credit may be given

- 5 pt - Book class the following as defined by the class diagram:
  - fields
  - constructors
  - methods in diagram (additional methods are optional)
- 1 pt - adds 3 books to the `ArrayList` using details given
- 1 pt - prints details for the book title specified
- 1 pt - checkout (if book is available) sets book title specified to not available
- 1 pt - checkin sets book title specified to available and decreases condition by 1
- 1 pt - code is commented and uses good `javadoc` standards

**Bonus credit:** ( / 3)

- 1 pt - Create a `searchLibrary` method that returns the Book object given the `library` and book title
- 1 pt - Check all book conditions.  If any are less than 2, remove them from the `library`
- 1 pt - Implement a menu

## Sample program run (with **bonus** menu implemented)

```
---- LIBRARY STATUS ----
Title: The Three-Body Problem
  Author: Cixin Liu
  ISBN: 0765377063
  Available: true
  Condition: 10
Title: Unlikely Animals
  Author: Annie Hartnett
  ISBN: 059316024X
  Available: true
  Condition: 10
Title: Learn Java the Easy Way
  Author: Bryson Payne
  ISBN: 1593278055
  Available: true
  Condition: 10

Book title to lookup: The Three-Body Problem
Title: The Three-Body Problem
  Author: Cixin Liu
  ISBN: 0765377063
  Available: true
  Condition: 10

Book title to checkout: The Three-Body Problem
Title: The Three-Body Problem
  Author: Cixin Liu
  ISBN: 0765377063
  Available: false
  Condition: 10

Book title to check in: The Three-Body Problem
Title: The Three-Body Problem
  Author: Cixin Liu
  ISBN: 0765377063
  Available: true
  Condition: 9
```
