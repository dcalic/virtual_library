package virtual_library;

import java.util.ArrayList;
import java.util.List;

public abstract class User {
    protected String name;
    protected String userId;
    protected List<Book> borrowedBooks = new ArrayList<>();

    public abstract int getMaxBooksAllowed();
    
    public User(String name, String userId) {
        this.name = name;
        this.userId = userId;
    }
    
    public void borrowBook(Book book) {
    	if(borrowedBooks.size()>getMaxBooksAllowed()) {
    		System.out.println("You’ve reached your borrowing limit. Kindly return one or more books to continue borrowing.");
    	}else if (!book.isAvailable()) {
    		System.out.println("Unfortunately, this book is currently checked out. You may place a hold to receive it as soon as it becomes available.");
    	}
    	if(book != null && book.isAvailable() && borrowedBooks.size()<getMaxBooksAllowed()) {
     	   book.setAvailable(false);
     	   borrowedBooks.add(book);
        }
    }
    
    public void returnBook(Book book) {
    	if(!borrowedBooks.isEmpty() && borrowedBooks.contains(book)) {
    		book.setAvailable(true);
    		borrowedBooks.remove(book);
    	}
    }      

	public String getName() {
		return name;
	}

	public String getUserId() {
		return userId;
	}

	public List<Book> getBorrowedBooks() {
		return borrowedBooks;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", userId=" + userId + "]";
	}
    
    
}