package main;
import virtual_library.Book;
import virtual_library.Library;
import virtual_library.StaffUser;
import virtual_library.StudentUser;
import virtual_library.User;

public class LibraryApp {
    public static void main(String[] args) {
        // Create library
        Library library = new Library();

        // Add some books
        library.addBook(new Book("Harry Potter and the Sorcerer's Stone", "J.K. Rowling", "9780747532699", true));
        library.addBook(new Book("The Hobbit", "J.R.R. Tolkien", "9780345339683", true));
        library.addBook(new Book("1984", "George Orwell", "9780451524935", true));

        // Register users
        User student = new StudentUser("Alice", "U001");
        User staff = new StaffUser("Bob", "U002");

        library.registerUser(student);
        library.registerUser(staff);

        // Test borrowing books
        library.borrowBook("U001", "9780747532699"); // Alice borrows Harry Potter
        library.borrowBook("U001", "9780345339683"); // Alice borrows The Hobbit
        library.borrowBook("U001", "9780451524935"); // Alice borrows 1984 - should reach limit after 3 books
        library.borrowBook("U001", "9780747532699"); // Alice tries to borrow Harry Potter again - not available

        library.borrowBook("U002", "9780451524935"); // Bob borrows 1984 (should fail, already borrowed)

        // Print borrowed books per user
        System.out.println("\n--- Borrowed Books ---");
        printBorrowedBooks(student);
        printBorrowedBooks(staff);

        // Alice returns a book
        System.out.println("\nAlice returns The Hobbit");
        student.returnBook(library.findBookByIsbn("9780345339683"));
        library.findBookByIsbn("9780345339683").setAvailable(true);

        // Bob tries borrowing The Hobbit now
        library.borrowBook("U002", "9780345339683");

        // Final borrowed books
        System.out.println("\n--- Updated Borrowed Books ---");
        printBorrowedBooks(student);
        printBorrowedBooks(staff);
    }

    private static void printBorrowedBooks(User user) {
        System.out.println(user.getName() + " has borrowed:");
        if (user.getBorrowedBooks().isEmpty()) {
            System.out.println("  No books borrowed.");
        } else {
            for (Book b : user.getBorrowedBooks()) {
                System.out.println("  - " + b.getTitle());
            }
        }
    }
}
