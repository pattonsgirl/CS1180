# Final Exam Coding Problem

- [Truck class](#truck-class---minimum-implementation)
- [Driver program](#driver-program---minimum-implementation)
- [**Bonus** Driver program with menu](#bonus-driver-program---menu-implementation)
- [Rubric](#rubric)
- [Sample program run](#sample-program-run)

Bob the Builder needs to keep track of his construction trucks and how much fuel they have.

## Book class - minimum implementation

Create a class called Book using the following UML diagram. Additional methods or setters for the class are optional based on how you implement the program logic.   
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
new Book("The Three-Body Problem", "Cixin Liu", "0765377063")
new Book("Unlikely Animals", "Annie Hartnett", "059316024X")
new Book("Learn Java the Easy Way", "Bryson Payne", "1593278055")
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

1. Check all book conditions.  If any are below 2, remove them from the `library`
2. Implement a menu that enacts the features above.  Only a user input of `6` should end the program.  The menu must have the following options:
```
1 - view library
2 - view book info
3 - checkout book
4 - checkin book
5 - check library condition
6 - end program
```

2. 

1. The program should present the user (the librarian) with a menu of options.
   - Program should continue until option 6 is entered
   - If the user enters an option that is the correct data type, but not a menu option, output "Not an option".
   - If the user provides a string instead of an integer, output "Bad input" and prompt the user until they provide input that is an integer. Sample bad input: "checkout"

```
1 - view library
2 - view book info
3 - checkout book
4 - checkin book
5 - check library condition
6 - end program
```

- View library should:
  - print info for all books in library

- View book should:
  - prompt the user for a book title
  - show info for book specified

- Checkout should:
  - prompt the user for a book title
  - set book availability to false
  - output "This title is not available"

- Checkin should:
  - prompt the user for a book title
  - set book availability to true
  - decrement book condition by 1

- Check library condition should:
  - check condition of all books
  - if any book condition is below 2, remove book from library

- End program should exit the program

## Rubric ( / 10)

**Code that does not compile will not be given any credit** If you have a piece to the solution that is buggy, comment it out, and partial credit may be given

- 5 pt - Book class the following as defined by the class diagram:
  - fields
  - constructors
  - methods in diagram (additional methods are optional)
- 1 pt - creates an `ArrayList` of Book objects
- 1 pt - adds 3 books to the `ArrayList` using details given
- 1 pt - prints details for the book title specified
- 1 pt - checkout (if book is available) sets book title specified to not available
- 1 pt - checkin sets book title specified to available and decreases condition by 1
- 1 pt - books with condition less than 2 are removed from `ArrayList`

**Bonus credit:** ( / 2)

- 1 pt - program prints a menu of options, does specified task per option entered, ends if (and only if) option 6 is given
- 1 pt - handles bad menu input (invalid menu options): ex. "7" and "checkout"

## Sample program run (with **bonus** menu implemented)

```
1 - view truck status
2 - assign job to truck
3 - refuel truck
4 - end program
1
Truck name?
Dizzy
Dizzy:
Current Fuel: 4
Max Fuel: 20
1 - view truck status
2 - assign job to truck
3 - refuel truck
4 - end program
2
Truck name?
Dizzy
Fuel for job?
10
Insufficient fuel, job not assigned
1 - view truck status
2 - assign job to truck
3 - refuel truck
4 - end program
3
Truck name?
Dizzy
1 - view truck status
2 - assign job to truck
3 - refuel truck
4 - end program
2
Truck name?
Dizzy
Fuel for job?
10
1 - view truck status
2 - assign job to truck
3 - refuel truck
4 - end program
refuel
Bad input
5
Not an option
1 - view truck status
2 - assign job to truck
3 - refuel truck
4 - end program
1 - view truck status
2 - assign job to truck
3 - refuel truck
4 - end program
4
```
