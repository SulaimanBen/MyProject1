package client;

import java.util.ArrayList;
import java.util.List;

public class Bank {
	
	private String bic;
	private static List<User> userList = new ArrayList<>();
	
	public Bank( String bic) {
		this.bic = bic;
	}

	public void addUser(String firstName, String lastName, String iban , double amount) {
		userList.add(new User(firstName , lastName , iban , bic , amount));
	}

	public static List<User> getList() {
		
		return userList;
	}
	
	 void printUser() {
		System.out.println(userList);
	}

}
