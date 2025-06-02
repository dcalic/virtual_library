# 📚 Virtual Library System

A simple Java-based Object-Oriented Programming (OOP) project that simulates a virtual library. The system allows users (students and staff) to borrow and return books, while enforcing borrowing limits per user type. Designed for clarity, testability, and to demonstrate solid OOP principles.

---

## 🧩 Key Concepts Demonstrated

- **Encapsulation**: All classes manage their own state through private fields and public getters/setters.
- **Abstraction**: Abstract `User` class defines a contract for all user types.
- **Inheritance & Polymorphism**: `StudentUser` and `StaffUser` extend `User` and override behavior like borrowing limits.
- **Collections**: The system uses `ArrayList` to manage users and books.
- **Basic separation of concerns**: `Library` class manages borrowing logic, not the UI.
- **Modularity and clarity**: Classes are cleanly divided by responsibility.

---

## 🚀 How to Run

### 1. Clone the repository

```bash
git clone git remote add origin https://github.com/dcalic/virtual_library
cd virtual-library-system

2. Compile and Run the Project

If you're using the command line:

javac *.java
java LibraryApp

Or, you can open the project in any Java IDE (IntelliJ IDEA, Eclipse, NetBeans) and run LibraryApp.java as the main class.

📂 Project Structure

/virtual-library
│
├── Book.java            // Model for Book
├── User.java            // Abstract class for users
├── StudentUser.java     // Student user class
├── StaffUser.java       // Staff user class
├── Library.java         // Core library logic (borrowing, storing books/users)
├── LibraryApp.java      // Main class for running the demo
└── README.md            // This file

✅ Features Implemented

    Add and register users (StudentUser, StaffUser)

    Add books to the library

    Borrow and return books

    Enforce borrowing limits per user type

    Console output showing status of borrowings

📌 Future Enhancements (TODO)

The following features are not yet implemented but planned for future versions:

    🔐 Exception handling with custom exceptions (e.g., BookNotAvailableException)

    🎯 Search functionality (by title, author, ISBN)

    📊 Persistent storage (e.g., file saving, database support via JDBC)

    👥 Reservation system for books

    🧪 JUnit testing

    👩‍💼 Role-based access control (admin, student, staff)

    💬 Notifications (e.g., book availability, due reminders)

    🧵 Multi-threading for concurrent borrowing

    🎨 GUI with JavaFX or Swing

    🧱 Design Patterns (Strategy, Observer)

    ⚙️ Logging with Log4j or Java util logging

    🧼 Refactor with SOLID principles

    🌐 Web version (servlets, Spring Boot, REST API)

    📈 Book statistics (most borrowed, overdue, etc.)

💡 Why This Project?

This is a clean, focused project built to demonstrate my understanding of:

    Java language fundamentals

    Object-Oriented Design principles

    Real-world system modeling

    Clean code and extensibility

👩‍💻 Author

Dijana Calic
FullStack Java Developer | Software Engineer
