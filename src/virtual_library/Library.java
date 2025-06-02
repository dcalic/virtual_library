package virtual_library;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a library managing books and users.
 */
public class Library {

	private final List<User> users = new ArrayList<>();
	private final List<Book> books = new ArrayList<>();

	/**
	 * Allows a user to borrow a book by their userId and book's ISBN.
	 *
	 * @param userId the user ID
	 * @param isbn the ISBN of the book to borrow
	 */
	public void borrowBook(String userId, String isbn) {
		User user = findUserByUserID(userId);
		if (user == null) {
			System.out.println("Access denied: You are not a registered user. Please register to use our library services.");
			return;
		}

		Book book = findBookByIsbn(isbn);
		if (book == null) {
			System.out.println("That book is not currently part of our collection.");
			return;
		}

		user.borrowBook(book);
	}

	/**
	 * Adds a book to the library collection if not already present.
	 *
	 * @param book the book to add
	 */
	public void addBook(Book book) {
		if (book == null) {
			System.out.println("Cannot add null book.");
			return;
		}
		if (findBookByIsbn(book.getIsbn()) != null) {
			System.out.println("Book with ISBN " + book.getIsbn() + " already exists in the library.");
			return;
		}
		books.add(book);
	}

	/**
	 * Registers a new user if the userId is unique.
	 *
	 * @param user the user to register
	 */
	public void registerUser(User user) {
		if (user == null) {
			System.out.println("Cannot register null user.");
			return;
		}
		if (findUserByUserID(user.getUserId()) != null) {
			System.out.println("User with ID " + user.getUserId() + " is already registered.");
			return;
		}
		users.add(user);
	}

	/**
	 * Finds a book by its ISBN.
	 *
	 * @param isbn the ISBN to search for
	 * @return the found Book or null if not found
	 */
	public Book findBookByIsbn(String isbn) {
		for (Book book : books) {
			if (book.getIsbn().equals(isbn)) {
				return book;
			}
		}
		return null;
	}

	/**
	 * Finds a user by their userId.
	 *
	 * @param userId the user ID to search for
	 * @return the found User or null if not found
	 */
	public User findUserByUserID(String userId) {
		for (User user : users) {
			if (user.getUserId().equals(userId)) {
				return user;
			}
		}
		return null;
	}

	/**
	 * Returns a copy of all registered users.
	 *
	 * @return list of users
	 */
	public List<User> getAllUsers() {
		return new ArrayList<>(users);
	}

	/**
	 * Returns a copy of all books in the library.
	 *
	 * @return list of books
	 */
	public List<Book> getAllBooks() {
		return new ArrayList<>(books);
	}
}
