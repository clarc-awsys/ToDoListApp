# 📝 Java To-Do List Console Application

A simple Java console-based To-Do List application that allows users to
create tasks, view tasks, and mark tasks as completed.\
This project demonstrates basic Object-Oriented Programming (OOP)
concepts and date validation using Java.

------------------------------------------------------------------------

## 📌 Features

-   Add new tasks with description, deadline, and priority
-   View all tasks
-   Mark tasks as completed using task ID
-   Automatic task ID generation
-   Deadline validation using `LocalDate`

------------------------------------------------------------------------

## 🧠 Concepts Used

-   Java Classes and Objects
-   Encapsulation (Getters and Setters)
-   ArrayList
-   LocalDate and DateTimeFormatter
-   Exception Handling
-   Scanner for user input

------------------------------------------------------------------------

## 📂 Project Structure

    classes/
    ├── App.java
    ├── Task.java
    └── TaskManager.java

------------------------------------------------------------------------

## ▶️ How to Run

1.  Compile the project:

```{=html}
<!-- -->
```
    javac classes/*.java

2.  Run the application:

```{=html}
<!-- -->
```
    java classes.App

------------------------------------------------------------------------

## 📋 Usage

When the program starts, choose from the following options:

    1. Add a new task
    2. View all tasks
    3. Mark a task as completed
    4. Exit

### Add Task

-   Enter task description
-   Enter deadline in `YYYY-MM-DD` format
-   Enter priority (`Low`, `Medium`, `High`)

### Mark Task as Completed

-   Enter the task ID

------------------------------------------------------------------------

## ⚠️ Input Validation

-   Deadline must be in `YYYY-MM-DD` format
-   Invalid dates are handled gracefully

------------------------------------------------------------------------

## 📌 Sample Output

    Task ID: 1, Description: Finish assignment, Deadline: 2025-12-31, Completed: No, Priority: High

------------------------------------------------------------------------

## 🚀 Future Improvements

-   File saving/loading
-   Task deletion
-   Sorting tasks by priority or deadline
-   Better input validation

------------------------------------------------------------------------

## 👨‍💻 Author

Clarc Jae Magbujos
Youssef Cabañero
Kenneth Ligutom
