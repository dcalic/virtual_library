package virtual_library;

public class StaffUser extends User {
    	
	public StaffUser(String name, String userId) {
		super(name, userId);
	}

	@Override
	public int getMaxBooksAllowed() {
		return 5;
	}
    
}

