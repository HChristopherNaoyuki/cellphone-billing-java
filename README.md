# Cellphone Billing System

A simple Java application for calculating and printing cell phone bills based on customer details, talk time, and rate per minute. This project demonstrates basic principles of object-oriented programming, such as inheritance, interfaces, and exception handling.

## Project Structure

The application consists of the following components:

- **`useCell.java`**: Main class to capture user input, initialize billing, and handle errors.
- **`Cell_Billing.java`**: Class that calculates the total bill and implements a method to print the bill.
- **`Cell.java`**: Abstract class to store customer information, talk time, and rate per minute. Implements the `iPrintable` interface.
- **`iPrintable.java`**: Interface defining the `print_bill()` method.

## Features

- **Dynamic User Input**: Collects customer name, talk time in minutes, and rate per minute.
- **Error Handling**: Catches invalid input errors and prompts the user to enter the correct data type.
- **OOP Principles**: Utilizes inheritance, interfaces, and encapsulation.

## Installation

1. Clone the repository:
    ```bash
    git clone https://github.com/HChristopherNaoyuki/cellphone-billing-java.git
    cd CellBillingSystem
    ```

2. Open the project in your preferred IDE.

3. Compile and run the program:
    ```bash
    javac Solution/*.java
    java Solution.useCell
    ```

## Usage

1. Enter the customer's name when prompted.
2. Provide the talk time in minutes.
3. Enter the rate per minute in the specified currency.
4. The application will calculate and display the total bill for the customer.

## Example Output

```
Enter the customer name: John Doe
Enter the talk time in minutes: 120
Enter the price per minute: 0.75

CUSTOMER: John Doe
TALK TIME: 120
PRICE PER MINUTE: 0.75
TOTAL BILL: R 90.0
```

---
