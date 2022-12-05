# Final Exam Coding Problem

- [Truck class](#truck-class---minimum-implementation)
- [Driver program](#driver-program---minimum-implementation)
- [**Bonus** Driver program with menu](#bonus-driver-program---menu-implementation)
- [Rubric](#rubric)
- [Sample program run](#sample-program-run)

Bob the Builder needs to keep track of his construction trucks and how much fuel they have.

## Truck class - minimum implementation

Create a class called Truck using the following UML diagram. Additional methods or setters for the class are optional based on how you implement the program logic.
| Truck |
| --- |
| -name: String |
| -currentFuel: int |
| -maxFuel: int |
| +Truck(name: String, currentFuel: int, maxFuel: int) |
| +getName(): String |
| +getCurrentFuel(): int |
| +setCurrentFuel(fuel: int): void |
| +getMaxFuel(): int |
| +spendFuel(fuel: int): void |
| +toString():String |

## Driver program - minimum implementation

1. Creates three trucks using the Truck class constructor. Prompting the user is not required.
   | Name | Current Fuel | Max Fuel |
   | -- | -- | -- |
   | Scoop | 5 | 10 |
   | Muck | 2 | 8 |
   | Dizzy | 4 | 20 |

2. Prompt the user for a truck name. Show information about the truck specified per the following format:

```
Truck: Dizzy
Current Fuel: 4
Max Fuel: 20
```

3. Assign a job to a truck by prompting the user for a truck name and amount of fuel needed for the job

   - use the spendFuel method in the Truck class to reduce the gallons remaining by that amount.
   - If the job needs more fuel than the truck has, output "Insufficient fuel, job not assigned" and not remove fuel from the truck.

4. Refuel a truck by prompting the user for a truck name. Set the current fuel for the truck to max fuel for the truck.

## (Bonus) Driver program - menu implementation

1. The program should present the user (Bob) with a menu of options.
   - Program should continue until option 4 is entered
   - If the user enters an option that is the correct data type, but not a menu option, output "Not an option".
   - If the user provides a string instead of an integer, output "Bad input" and prompt the user until they provide input that is an integer. Sample bad input: "refuel"

```
1 - view truck status
2 - assign job to truck
3 - refuel truck
4 - end program
```

- View truck status should:

  - prompt the user for a truck name
  - show information about the truck specified per the following format:

  ```
  Dizzy:
  Current Fuel: 4
  Max Fuel: 20
  ```

- Assign jobs to truck should:

  - prompt the user for a truck name
  - prompt the user for amount of fuel needed for the job
  - use the spendFuel method in the Truck class to reduce the gallons remaining by that amount.
    - If the job needs more fuel than the truck has, output "Insufficient fuel, job not assigned" and not remove fuel from the truck.

- Refuel truck should:

  - prompt the user for a truck name
  - sets current fuel for the truck to max fuel for the truck.

- End program should exit the program

## Rubric ( / 8)

**Code that does not compile will not be given any credit** If you have a piece to the solution that is buggy, comment it out, and partial credit may be given

- 3 pt - Truck class the following as defined by the class diagram:
  - fields
  - constructors
  - methods in diagram (additional methods are optional)
- 1 pt - creates 3 trucks using details given
- 1 pt - prints details for the Truck specified
- 1 pt - reduces fuel by amount specified for job for specified truck
- 1 pt - does not remove fuel if truck does not have enough fuel for job
- 1 pt - refuels specified truck based on max fuel for truck

**Bonus credit:** ( / 2)

- 1 pt - program prints a menu of options, does specified task per option entered, ends if (and only if) option 4 is given
- 1 pt - handles bad menu input (invalid menu options): ex. "5" and "refuel"

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
