package client;

public class Bank {
	
	private String bankName;
	private int id;
	public static User[] user = {new User("Max", "", "DE12515140", "CODEXXXXX" , 50000),
						new User("Tom", "", "DE14788963", "CODEXXXXX", 1000000)	};
	
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

	public Bank(String bankName, int id,User[] user) {
		this.bankName = bankName;
		this.id = id;
		Bank.user = user;
	}
	

}
