package client;

public class User {
	
	private String firstName,
				   lastName,
				   iBan,
				   bic,
				   password,
				   userName;
	
	public User (String firstName, String lastName, String iBan, String bic) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.iBan = iBan;
		this.bic = bic;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getiBan() {
		return iBan;
	}

	public void setiBan(String iBan) {
		this.iBan = iBan;
	}

	public String getBic() {
		return bic;
	}

	public void setBic(String bic) {
		this.bic = bic;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public User(String firstName, String lastName, String iBan, String bic, String password, String userName) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.iBan = iBan;
		this.bic = bic;
		this.password = password;
		this.userName = userName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
}
