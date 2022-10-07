## Problem: Dog food estimator

Animal care is a lot, so you are going to help a new shelter owner out. The user will input whether the dog is an 'adult' or is a 'puppy'. The user will also provide a weight in pounds, rounded to the nearest whole number. Use the information provided by the user to determine how many cups of food per day to feed the dog. The user should be allowed to enter information for multiple dogs until they enter `q` to quit the estimator.

| Adult dog weight (lbs) | Cups per day |
| ---------------------- | ------------ |
| 2 - 19                 | 3 cups       |
| 20 - 40                | 4 cups       |

| Puppy weight (lbs) | Cups per day |
| ------------------ | ------------ |
| 2 - 10             | 1 cup        |
| 11 - 20            | 2 cups       |

| User input | Program output       |
| ---------- | -------------------- |
| adult 5    | "3 cups per day"     |
| puppy 2    | "1 cup per day"      |
| puppy 15   | "2 cups per day"     |
| abc 44     | "Do you have a dog?" |
| q          | "Ending program"     |

Do not factor in edge cases, like input given in the wrong order.

**Safety warning**: this information used in this program is not accurate. Consult with a veterinarian and read the label on your dog's food bag to determine the correct amount of food per day.

Rubric:

- 1 pt: Prompts for user input for adult / puppy and weight
- 1 pt: Store user input for adult / puppy and weight
- 0.5 pt: Prints corresponding cups per day for puppies based on weight
- 0.5 pt: Prints corresponding cups per day for adults based on weight
- 1 pt: Program iterates until user enters `q`
- 1 pt: If user gives bad input, like `abc` instead of adult / puppy, move to next loop iteration
