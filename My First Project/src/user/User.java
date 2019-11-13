package user;

public class User {
	
	private String firstName,
				   lastName,
				   iBan,
				   bic,
				   password;

	public User(String firstName, String lastName, String iBan, String bic, String password) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.iBan = iBan;
		this.bic = bic;
		this.password = password;
	}
	
}
