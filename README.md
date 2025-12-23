#📝 Java To-Do List Console Application

A simple Java console-based To-Do List application that allows users to create tasks, view tasks, and mark tasks as completed.
This project demonstrates object-oriented programming (OOP) concepts such as encapsulation, class interaction, and basic input validation.

📌 Features

Add new tasks with:

Description

Deadline (YYYY-MM-DD)

Priority (Low, Medium, High)

View all tasks

Mark tasks as completed using a unique task ID

Automatic task ID generation

Deadline validation using LocalDate

🧠 Concepts Used

Java Classes and Objects

Encapsulation (getters, setters)

ArrayList for task storage

LocalDate and DateTimeFormatter

Exception handling (DateTimeParseException)

Console input using Scanner

📂 Project Structure
classes/
│
├── App.java          # Main application (entry point)
├── Task.java         # Task model class
└── TaskManager.java  # Manages task operations

▶️ How to Run

Compile the project

javac classes/*.java


Run the application

java classes.App

📋 Usage Instructions

When the program runs, you will see the following menu:

1. Add a new task
2. View all tasks
3. Mark a task as completed
4. Exit

➕ Add a Task

Enter a description

Enter a deadline in YYYY-MM-DD format

Enter a priority (Low, Medium, High)

👀 View Tasks

Displays all tasks with ID, description, deadline, completion status, and priority

✅ Mark Task as Completed

Enter the task ID to mark it as completed

⚠️ Input Validation

Deadline must follow the format:
YYYY-MM-DD

If the date format is invalid, the deadline is set to null and a warning is shown.

📌 Example Output
Task ID: 1, Description: Finish Java project, Deadline: 2025-12-30, Completed: No, Priority: High

🚀 Possible Improvements

Save tasks to a file (persistence)

Add task deletion

Sort tasks by deadline or priority

Prevent duplicate task descriptions

Add input validation for priority values

👨‍💻 Author

Clarc Jae Magbujos
Java Practice Project – Console Application
