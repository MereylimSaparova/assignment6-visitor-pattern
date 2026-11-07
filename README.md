# Assignment 6 — Visitor Design Pattern

## Project Description

This project demonstrates the Visitor Design Pattern using a simple Library Management System developed in Java.

The system contains books and magazines. The Visitor Pattern allows us to perform different operations on these objects without changing their classes.

## Technologies Used

- Java
- IntelliJ IDEA
- Visitor Design Pattern

## Project Structure

The project contains seven Java files:

- `LibraryItem.java` — Element interface.
- `Book.java` — Concrete Element representing a book.
- `Magazine.java` — Concrete Element representing a magazine.
- `LibraryVisitor.java` — Visitor interface.
- `PriceCalculatorVisitor.java` — Calculates the total price of library items.
- `InformationVisitor.java` — Displays information about library items.
- `Main.java` — Creates objects and demonstrates the Visitor Pattern.

## How It Works

1. The program creates books and magazines.
2. Each element implements the `accept()` method.
3. The `InformationVisitor` displays the title and price of each item.
4. The `PriceCalculatorVisitor` calculates the total price.
5. The `accept()` and `visit()` methods demonstrate double dispatch.

## Clean Code Principles

The project demonstrates several Clean Code principles:

1. **Meaningful Names:** Classes and methods have descriptive names.
2. **Single Responsibility Principle:** Each visitor performs one operation.
3. **Encapsulation:** Fields are private, and data is accessed through getter methods.
4. **Expresses Intent:** The code clearly communicates its purpose.
5. **Minimal Classes and Methods:** Each class has a specific role.

The project also uses input validation and avoids `instanceof` checks.

## Sample Output

```text
=== Library Items ===
Book: Clean Code, Price: 5000.0 KZT
Book: Design Patterns, Price: 6500.0 KZT
Magazine: Science Weekly, Price: 2000.0 KZT
Magazine: Tech World, Price: 1500.0 KZT
=====================
Total Price: 15000.0 KZT
Total Price Test: PASS
```

## How to Run

1. Open the project in IntelliJ IDEA.
2. Configure a Java JDK (Java 17 is recommended).
3. Open `Main.java`.
4. Run the `main()` method.
5. Check the output in the console.

## Conclusion

The Visitor Pattern makes it possible to add new operations without modifying existing element classes. This project demonstrates how two visitors can work with books and magazines using double dispatch.