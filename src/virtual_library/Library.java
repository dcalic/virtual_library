package virtual_library;

import java.util.ArrayList;
import java.util.List;

public class Library {
	
	private List<User> users = new ArrayList<>();
	private List<Book> books = new ArrayList<>();
	
	public Library() {}
	
	public void borrowBook(String userId,String isbn) {
		for(User user : users){
			if(user.getUserId().equals(userId)) {
				for(Book book : books) {
					if(book.getIsbn().equals(isbn)) {
						user.borrowBook(book);
						System.out.println("Dear user: " + userId + " you have successfully borrowed the book titled: \"" + book.getTitle() + "\" We appreciate your patronage.");
						return;
					}					
				}
				System.out.println("That book is not currently part of our collection.");
				return;
			}			
		}
		System.out.println("Access denied: You are not a registered user. Please register to use our library services.");
		return;
	}
	
	public void addBook(Book book) {
		books.add(book);
	}

	public void registerUser(User user) {
	    users.add(user);
	}

	public Book findBookByIsbn(String isbn) {
		for(Book book : books) {
			if(book.getIsbn().equals(isbn)) {
				return book;
			}
		}
		return null;
	}
	
	public User findUserByUserID(String userId) {
		for(User user : users) {
			if(user.getUserId().equals(userId)) {
				return user;
			}
		}
		return null;
	}

}
