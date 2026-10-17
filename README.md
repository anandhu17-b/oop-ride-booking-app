# Ride Booking App (OOP-Based Java Application)

A console-based Java application built to demonstrate core Object-Oriented Programming (OOP) concepts such as Abstraction, Inheritance, Polymorphism, and Interfaces through a realistic ride-booking and payment workflow.

## Features

- **Vehicle Polymorphism:** Abstract `Vehicle` class extended by `Car` and `Auto` classes, each with customized ride-starting logs and fare calculation rules.
- **Payment Interface:** Flexible `PaymentMethod` interface implemented by `UpiPayment` and `CashPayment` classes.
- **Interactive Console Flow:** Built-in `Scanner` interface allowing users to select vehicle types, input travel distance, and choose payment methods.

## Tech Stack

- **Language:** Java
- **Core Concepts:** Abstraction, Method Overriding, Interfaces, Polymorphism, Switch-Case Flow Control.

## Project Structure

```text
RidingAppUsingOOps_01/
│
├── Vehicle.java       # Abstract parent class defining core attributes and abstract methods
├── Car.java           # Concrete subclass for Car rides and fare rules
├── Auto.java          # Concrete subclass for Auto rides and fare rules
├── PaymentMethod.java # Interface for payment execution
├── UpiPayment.java    # UPI payment implementation
├── CashPayment.java   # Cash payment implementation
└── Main.java          # Main driver class handling user interaction and logic flow
