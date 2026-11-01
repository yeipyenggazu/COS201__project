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
└── week02/
    ├── HelloWorld.java
    ├── StudentProfile.java
    ├── PrintExample.java
    └── ErrorExample.java
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
