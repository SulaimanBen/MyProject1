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
	
//	private String bankName , bic;
//	private int id;
//	public static User[] user = {new User("Ben", "Sulaiman", "DE12515140", "CODEXXXXX" , 50000),
//						new User("Max", "Mustermann", "DE14788963", "CODEXXXXX", 1000000)	};
//	
//	public String getBankName() {
//		return bankName;
//	}
//
//	public void setBankName(String bankName) {
//		this.bankName = bankName;
//	}
//
//	public int getId() {
//		return id;
//	}
//
//	public void setId(int id) {
//		this.id = id;
//	}
//
//	public Bank(String bankName, int id,User[] user) {
//		this.bankName = bankName;
//		this.id = id;
//		Bank.user = user;
//	}
	

}
