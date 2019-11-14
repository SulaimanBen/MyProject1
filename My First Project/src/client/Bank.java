package client;

public class Bank {
	
	private String bankName;
	private int id;
	private User[] user = {new User("Max", "", "DE12515140", "CODEXXXXX"),
						new User("Tom", "", "DE14788963", "CODEXXXXX")	};
	
	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public User[] getUser() {
		return user;
	}

	public void setUser(User[] user) {
		this.user = user;
	}

	public Bank(String bankName, int id,User[] user) {
		this.bankName = bankName;
		this.id = id;
		this.user = user;
	}
	

}
