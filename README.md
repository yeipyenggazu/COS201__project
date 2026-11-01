# COS 201 — Computer Programming I

My practical exercises and programming assignments for COS 201, with one folder for each week.

## Student Details

- **Name:** Mary Joy Gazu
- **Matriculation Number:** 25/17852
- **Programme:** Cyber Security
- **Course:** COS 201 — Computer Programming I

## Repository Structure

```
.
├── README.md
├── week01/
│   └── FirstProgram.java
├── week02/
│   ├── HelloWorld.java
│   ├── StudentProfile.java
│   ├── PrintExample.java
│   └── ErrorExample.java
└── week03/
    ├── SimpleCalculator.java
    ├── AverageCalculator.java
    └── ItemCost.java
```

---

## Week 1: Introduction to Programming and Problem-Solving

### Practical Exercise

I wrote, compiled and ran my first Java programme. It shows the welcome messages from the practical steps. It then shows my course, my programme, three reasons why programming is important in computing, and my goal for COS 201.

Activities A, B and C for Week 1 were done by hand on paper, so they are not in this repository.

### File

- `week01/FirstProgram.java`

### How to Run

```bash
cd week01
javac FirstProgram.java
java FirstProgram
```

### Output

```
Welcome to COS 201!
I am learning computer programming.
Programming begins with problem-solving.
My programme is running successfully.
I will practise programming every week.

Course: COS 201 - Computer Programming I
Programme: Cyber Security
Reason 1: Programming turns the steps for solving a problem into instructions a computer can follow.
Reason 2: The tools that protect computers, such as firewalls, antivirus software and password checkers, are all programs.
Reason 3: Knowing how programs are written helps me find the coding mistakes that attackers take advantage of.
My goal: To learn Java well enough to write correct, secure programs and later build my own security tools.
```

### What I Practised

- Writing a Java class that has a `main` method
- Printing text with `System.out.println()`
- Compiling with `javac` and running with `java`
- Keeping my work on GitHub

---

## Week 2: Development Environment and First Java Program

### Objective

To set up the Java development environment, write a simple Java program, compile it, run it and submit the source code through GitHub.

### Tools Used

- Java Development Kit (JDK)
- Visual Studio Code
- Git
- GitHub Desktop
- GitHub

### Files

- `week02/HelloWorld.java`: the main practical program. It prints three lines of text.
- `week02/StudentProfile.java`: the personalised program. It prints my name, course and programme details.
- `week02/PrintExample.java`: the practice exercise that shows how `print()` and `println()` differ.
- `week02/ErrorExample.java`: the "find and fix the error" exercise. I added the missing semicolon, so it now compiles.

### How to Run

1. Open a terminal in the `week02` directory.
2. Compile the program using `javac HelloWorld.java`.
3. Run the program using `java HelloWorld`.

The other three programs are compiled and run in the same way. For example, `javac StudentProfile.java` and then `java StudentProfile`.

### Output

**HelloWorld**

```
Hello, World!
Welcome to COS 201.
I am learning Java programming.
```

**StudentProfile**

```
NAME: Mary Joy Gazu
COURSE: COS 201
COURSE TITLE: Computer Programming I
PROGRAMME: Cyber Security
WEEK: 2
TOPIC: Development Environment and Java
GOAL: To write, compile and debug Java programs on my own.
```

**PrintExample**

```
COS 201
Java
```

**ErrorExample**

```
Learning Java
```

### Learning Outcome

I installed and set up the JDK, Visual Studio Code and Git. I then wrote, compiled and ran Java programs and submitted them through GitHub. I learned that `print()` leaves the cursor on the same line, while `println()` moves it to the next line. I also learned to read compiler errors: `';' expected` told me exactly which line was missing a semicolon.

---

## Week 3: Variables, Data Types, Expressions and Input/Output

### Objectives

- Declare and initialise Java variables.
- Use appropriate primitive and reference data types.
- Perform arithmetic calculations.
- Read keyboard input using `Scanner`.
- Display formatted output.
- Compile, test and submit Java programs using GitHub.

### Programs

1. `week03/SimpleCalculator.java`
   - Reads two numbers and calculates their sum, difference, product and quotient.
   - Checks that the second number is not zero before it divides.
2. `week03/AverageCalculator.java`
   - Reads a student's name and three course scores, then calculates the total and the average.
   - Extension exercise: checks that each score is from 0 to 100 before calculating anything.
3. `week03/ItemCost.java`
   - Reads an item name, the quantity and the unit price, then calculates the total cost (quantity × unit price).
   - Checks that the quantity is at least 1 and that the unit price is not negative.

### Data Types Used

| Variable | Type | Why I chose it |
|---|---|---|
| `num1`, `num2` in `SimpleCalculator` | `double` | The user can type decimal numbers. |
| `studentName`, `itemName` | `String` | They hold text that can contain spaces, so they are read with `nextLine()`. |
| `score1`, `score2`, `score3` | `double` | A score such as 62.5 has to be accepted. |
| `quantity` | `int` | Items are bought in whole numbers. |
| `unitPrice`, `totalCost` | `double` | Prices can include kobo, which is a decimal part. |
| `MIN_SCORE`, `MAX_SCORE`, `COURSE_COUNT` | `final` constants | These values do not change while the program runs. |

### How to Run

You need the Java Development Kit (JDK). Check that it is installed with `java -version` and `javac -version`.

Open a terminal in the `week03` directory:

```bash
cd week03
```

Compile and run the calculator:

```bash
javac SimpleCalculator.java
java SimpleCalculator
```

Compile and run the average calculator:

```bash
javac AverageCalculator.java
java AverageCalculator
```

Compile and run the item cost program:

```bash
javac ItemCost.java
java ItemCost
```

Type each value when the program asks for it, then press **Enter**.

### Sample Runs

**SimpleCalculator**

```
Enter the first number: 84
Enter the second number: 12
Sum: 96.00
Difference: 72.00
Product: 1008.00
Quotient: 7.00
```

**SimpleCalculator (zero divisor)**

```
Enter the first number: 25
Enter the second number: 0
Sum: 25.00
Difference: 25.00
Product: 0.00
Division is undefined for a zero divisor.
```

**AverageCalculator**

```
Enter student name: Mary Joy Gazu
Enter score for Course 1: 68
Enter score for Course 2: 74
Enter score for Course 3: 81

--- STUDENT RESULT ---
Student: Mary Joy Gazu
Total: 223.00
Average: 74.33
```

**AverageCalculator (invalid score)**

```
Enter student name: Mary Joy Gazu
Enter score for Course 1: 68
Enter score for Course 2: 105
Enter score for Course 3: 81

Invalid score entered. Every score must be from 0 to 100.
No result was calculated. Please run the program again.
```

**ItemCost**

```
Enter item name: USB Flash Drive
Enter quantity: 3
Enter unit price: 6500

--- PURCHASE SUMMARY ---
Item: USB Flash Drive
Quantity: 3
Unit price: 6500.00
Total cost: 19500.00
```

### Testing

I tested each program with normal values, boundary values and invalid values. I worked out every expected result by hand first, then compared it with what the program printed.

| Program | Input | Expected result | Actual result |
|---|---|---|---|
| SimpleCalculator | 84, 12 | Sum 96.00, Difference 72.00, Product 1008.00, Quotient 7.00 | Correct |
| SimpleCalculator | 7.5, 2 (decimal number) | Sum 9.50, Difference 5.50, Product 15.00, Quotient 3.75 | Correct |
| SimpleCalculator | -15, 4 (negative number) | Sum -11.00, Difference -19.00, Product -60.00, Quotient -3.75 | Correct |
| SimpleCalculator | 0, 9 (zero as the first number) | Sum 9.00, Difference -9.00, Product 0.00, Quotient 0.00 | Correct |
| SimpleCalculator | 25, 0 (zero divisor) | No quotient; "Division is undefined for a zero divisor." | Correct |
| AverageCalculator | Mary Joy Gazu: 68, 74, 81 | Total 223.00, Average 74.33 | Correct |
| AverageCalculator | 0, 50, 100 (boundary values) | Total 150.00, Average 50.00 | Correct |
| AverageCalculator | 62.5, 70, 58.75 (decimal scores) | Total 191.25, Average 63.75 | Correct |
| AverageCalculator | 68, 105, 81 (score above 100) | Error message; no result calculated | Correct |
| AverageCalculator | -5, 74, 81 (score below 0) | Error message; no result calculated | Correct |
| ItemCost | USB Flash Drive: 3 × 6500 | Total cost 19500.00 | Correct |
| ItemCost | Exercise Book: 10 × 250.50 | Total cost 2505.00 | Correct |
| ItemCost | Free Sticker: 4 × 0 (boundary price) | Total cost 0.00 | Correct |
| ItemCost | Quantity 0 | Error message; no result calculated | Correct |
| ItemCost | Unit price -50 | Error message; no result calculated | Correct |

### Notes

- When a program asks for a number, type digits only, with no letters, commas or ₦ sign. If you type anything else, Java stops with an `InputMismatchException`.
- In `ItemCost`, the quantity must be a whole number, such as `3` and not `3.5`.
