# ☕ Java Programming Business Application Projects

A collection of three introductory Java console applications developed to demonstrate core programming fundamentals, business-rule implementation, file processing, input validation, and conditional logic. <br>

This repository showcases beginner-friendly Java programs that solve practical business-style problems through command-line interaction and structured program flow. <br>

## Project Overview

This repository contains three standalone Java applications:
1. **Delivery Algorithm**  
   Calculates parcel delivery cost based on parcel weight, pickup postal code, delivery postal code, and whether the locations fall within CBD zones.

2. **Income Tax Calculator**  
   Reads employee income data from a text file and computes payable income tax based on progressive tax brackets.

3. **Salary Multiplier Calculator**  
   Reads employee salary and performance data from a text file, accepts company performance input, and computes employee bonus values using performance-based multipliers.

### Key Skills Demonstrated

- Java syntax and program structure
- Conditional statements and decision-making
- Looping and repeated user interaction
- Input validation
- File reading using `Scanner`
- Business-rule implementation
- Console-based output formatting
- Working with multiple standalone Java programs in one repository

### Repository Structure

```text
Java-Programming-Business-Application-Projects/
│
├── README.md
├── .gitignore
│
├── src/
│   ├── DeliveryAlgorithm.java
│   ├── IncomeTaxCalculator.java
│   └── SalaryMultiplierCalculator.java
│
├── data/
│   ├── IncomeTax.txt
│   └── SalaryMultiplierData.txt
│
├── docs/
│   ├── ICS Assignment.pdf
│   ├── ICS Main Assignment.pdf
│   └── ICS Assignment Rubric.pdf
│
└── images/
    ├── q1-delivery-algorithm/
    │   ├── Delivery Algorithm Code.png
    │   ├── First Data Set.png
    │   ├── Second Data Set.png
    │   └── Third Data Set [Unsuccesful].png
    │
    ├── q2-income-tax-calculator/
    │   ├── Income Tax Data Set 1.png
    │   ├── Income Tax Data Set 2.png
    │   ├── Income Tax Data Set 3.png
    │   ├── IncomeTaxCalculator - Test Case 1.png
    │   ├── IncomeTaxCalculator - Test Case 2.png
    │   ├── IncomeTaxCalculator - Test Case 3.png
    │   └── IncomeTaxCalculator -Code.png
    │
    └── q3-salary-multiplier-calculator/
        ├── SalaryMultiplierCalculator - Output.png
        ├── SalaryMultiplierCalculator - Output 1.png
        ├── SalaryMultiplierCalculator - Output 2.png
        ├── SalaryMultiplierCalculator - Output 3.png
        ├── SalaryMultiplierCalculator Code 1.png
        ├── SalaryMultiplierCalculator Code 2.png
        └── SalaryMultiplierData Data Set.png
```

## Applications

### 1. Delivery Algorithm
This program:
- accepts parcel weight
- validates postal code input
- identifies whether pickup and delivery locations are within CBD ranges
- computes delivery cost based on location combinations

**Concepts used:**
- `Scanner`
- `while` loops
- nested validation
- `if-else` logic
- boolean flags

---

### 2. Income Tax Calculator
This program:
- reads employee records from `IncomeTax.txt`
- processes income values
- applies progressive tax calculations across different brackets
- outputs the calculated tax payable for each employee

**Concepts used:**
- file input with `Scanner`
- numeric processing
- conditional tax bracket logic
- formatted output

---

### 3. Salary Multiplier Calculator
This program:
- reads employee salary and rating data from `SalaryMultiplierData.txt`
- requests company performance input from the user
- applies employee and company multipliers
- calculates employee bonus values

**Concepts used:**
- file input
- user input
- multiplier logic
- integer and double calculations
- formatted result printing

## Notes

Some of the original Java files were written with absolute local file paths for text-file input.  
For portability, these should be updated to relative paths when running the project on another machine.

For example, instead of using a machine-specific path, the programs can be adjusted to read from files inside the local `data/` folder.

## How to Run

1. Clone this repository.
2. Open the project in your preferred Java IDE or code editor.
3. Make sure Java is installed.
4. Compile and run any of the files inside the `src/` folder.

Example:

```bash
javac src/DeliveryAlgorithm.java
java -cp src DeliveryAlgorithm
```

For file-based programs, ensure the input text files are available and that file paths in the code are updated if necessary.

## Screenshots and Supporting Material

The `images/` folder contains:
- code screenshots
- test case screenshots
- dataset screenshots
- output screenshots

The `docs/` folder contains:
- assignment brief
- main assignment document
- rubric

## Purpose of This Repository

This repository was created as part of an introductory Java programming assignment and has been reorganized into a cleaner GitHub portfolio format to better showcase programming fundamentals and early software development work.

## Future Improvements

- Refactor all file paths to relative paths
- Separate repeated logic into reusable methods
- Improve variable naming consistency
- Add stronger exception handling
- Convert the three standalone programs into a menu-driven application
- Add unit testing for calculation logic



## 🖋️ Author

**Styverson Ng**

Bachelor of Information Technology <br>
Artificial Intelligence & Autonomous Systems <br>
Cyber Security & Cyber Forensics <br>

Murdoch University <br>


