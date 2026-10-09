# 👋 Welcome to My Object-Oriented Programming (OOP) Repository!

Hello and welcome! This repository hosts my Java assignments focused on mastering **Object-Oriented Programming (OOP)**. Inside, you will find practical implementations covering fundamental concepts such as Encapsulation, Inheritance, Abstraction, and Polymorphism.

---

## 🗂️ Repository Contents

* **`Array and ArrayList/`** – Banking system simulation focusing on basic OOP concepts and encapsulation.
* **`Inheritance and Polymorphism/`** – Geometry calculator demonstrating inheritance, abstraction, and polymorphism.


---

## 🔍 Module Overview

### 1. 💳 Banking System (`Array and ArrayList`)
This module simulates a fundamental banking environment to illustrate encapsulation and static properties.

* **`Bank.java`**: Manages account balances securely using private fields. Provides public getter and setter methods (`getBalance()`, `deposit()`, `withdraw()`). Tracks global metrics across instances via `bankName` and `totalAccounts`.
* **`BankDemo.java`**: Serves as the application driver featuring an interactive command-line menu for user interactions.

---

### 2. 📐 Geometry Shape Engine (`Inheritance and Polymorphism`)
This module highlights class hierarchies and method dynamic dispatching through geometric calculations.

* **`Bentuk.java`**: The base class establishing foundational attributes like `warna` (color).
* **`BujurSangkar.java`**: Extends `Bentuk` to represent a square and calculates its total area ($sisi \times sisi$).
* **`Lingkaran.java`**: Subclass representing a circle, implementing dynamic area computation using $PHI \times r^2$.
* **`Silinder.java`**: Extends `Lingkaran` to model a cylinder and computes its volume using the parent base area ($\text{Base Area} \times h$).
* **`Main.java`**: The main execution script allowing interactive input for shape parameters and output generation.

---

## 🚀 How to Use & Execute

Follow these instructions to clone, compile, and run the programs on your local machine.

### Prerequisites
* **Java Development Kit (JDK 11 or newer)** installed on your machine.
* Terminal, Command Prompt, or VS Code integrated terminal.

### Steps to Run

1. **Clone the Repository**
   ```bash
   git clone https://github.com/Zyilma/Tugas-PBO.git
   cd Tugas-PBO
   ```

2. **Running Module 1 (Bank System)**
   ```bash
   cd "Array and ArrayList"
   javac Bank.java BankDemo.java
   java BankDemo
   ```

3. **Running Module 2 (Geometry Engine)**
   ```bash
   cd "../Inheritance and Polymorphism"
   javac *.java
   java Main
   ```

---
*Created as part of the Object-Oriented Programming Course.*
