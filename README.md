# Expense Predictor

## Project Overview

A menu-driven Java application for tracking, storing, and analyzing daily expenses using Object-Oriented Programming and File Handling concepts.

---

## Author

**Pahal Babbar**
---

## Features
- Add Expenses
- View All Expenses
- Expense Analytics
- Highest Expense Detection
- Food Category Expense Tracking
- Predicted Next Expense Calculation
- Persistent File Storage
- Automatic Expense Loading
- Menu-Driven Console Interface

---

## Technologies Used
- Java
- OOPS Concepts
- ArrayList
- File Handling
- Exception Handling

---

## Project Structure

```text
ExpensePredictor
│
├── src
│   ├── Main.java
│   ├── Expense.java
│
├── expenses.txt
│
└── README.md
```
---

## Complete Workflow

### Step 1: Open Project Folder

Open the project in VS Code.

Project Structure:

```text
ExpensePredictor
│
├── src
│   ├── Main.java
│   ├── Expense.java
│
├── expenses.txt
│
└── README.md
```

---

## Running the Project

### Step 2: Compile Java Files

Open terminal in VS Code and run:

```bash
javac src/*.java
```

This compiles:
- Main.java
- Expense.java

---

### Step 3: Run the Application

```bash
java -cp src Main
```

---

### Step 4: Use the Menu

The application provides:

1. Add Expense  
2. View Expenses  
3. Show Analytics  
4. Exit  

---

### Step 5: Expense Storage

All expenses are stored in:

```text
expenses.txt
```

Data remains saved even after restarting the application.

---

## Uploading Project to GitHub

### Step 6: Initialize Git

```bash
git init
```

---

### Step 7: Add Project Files

```bash
git add .
```

---

### Step 8: Commit Files

```bash
git commit -m "Initial commit"
```

---

### Step 9: Rename Branch

```bash
git branch -M main
```

---

### Step 10: Connect GitHub Repository

```bash
git remote add origin https://github.com/pahal-0208/expense-predictor-java.git
```

---

### Step 11: Push Project to GitHub

```bash
git push -u origin main
```
---

## Functionalities

### 1. Add Expense

Users can:

- Enter expense category
- Enter expense amount
- Save expense permanently

---

### 2. View Expenses

Displays all stored expenses in formatted output.

#### Example

```text
Food - Rs. 500.00
Travel - Rs. 1200.00
```

---

### 3. Show Analytics

Provides:

- Total Expenses
- Food Expenses
- Highest Expense Category
- Highest Expense Amount
- Predicted Next Expense

---

### 4. File Handling

Expenses are stored in:

```text
expenses.txt
```

Data remains available even after restarting the application.

---

## Concepts Practiced

- Classes & Objects
- Constructors
- Loops & Conditions
- ArrayList
- FileReader & FileWriter
- BufferedReader
- Exception Handling
- Data Parsing
- Menu-Driven Programming


