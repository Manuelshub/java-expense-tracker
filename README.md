# Java Expence Tracker

Welcome to the **Java Expence Tracker**, a simple yet powerful command line
application, that helps you track your daily expenses, analyze your spending
habits and make well informed financial decisions. All built using core Java
concepts and libraries.

## Project Description

This application allows user to:

- Add and categorize expenses (e.g Food, Transport, Utilities).
- View history based on date or category.
- Generate monthly and category-based spending reports.
- Save and load data to/from files for persistent storage.
- Gain insights into spending trends over time.

It is built as a final project to strengthen/reinforce core java concepts,
including:

- Programming style and best practices.
- Object Oriented Programming.
- Working with external packages (e.g JSON Libraries).
- Data Structures (e.g ArrayList, HashMap, LinkedList).
- Working with strings, dates and calendar.
- File I/O and data streams.

## Technologies Used

| Component              | Tool/library            |
|------------------------|-------------------------|
| Programming Language   | Java 21+                |
| Date & Time            | `java.time`             |
| File I/O               | Standard Java I/O       |

## Project Structure

```bash
expense-tracker/
├── src/
│ └── main/
│ ├── model/ # Domain models (Expense, Category)
│ ├── service/ # Business logic (ExpenseManager)
│ ├── data/ # File handling (saving/loading data)
│ ├── ui/ # User interface (CLI or GUI)
│ └── Main.java # Application entry point
├── resources/ # (Optional) Example data files
├── lib/ # External libraries if not using Maven
└── README.md # Project overview (this file)
```

## How to Run

1. Navigate to the `src` directory:
```bash
cd expense-tracker/src
```
2. Compile the code
```bash
javac main/Main.java
```
3. Run the application
```bash
java main.Main
```

## Author

Emmanuel Ifediora
Java Programmer and Student @ IU International University of Applied Sciences

## License

This project is for educational and non-commercial purposes only. Feel free to
fork and improve!
