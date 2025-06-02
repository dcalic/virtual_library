package virtual_library;

public class StudentUser extends User {
		
	 public StudentUser(String name, String userId) {
		 super(name, userId);
	 }
	
	@Override
	public String toString() {
		return "StudentUser [borrowedBooks=" + borrowedBooks + "]";
	}

	@Override
	public int getMaxBooksAllowed() {
		return 3;
	}
    
    
}

