package client;

import java.util.ArrayList;
import java.util.List;

public class User {
	
	private String firstName , lastName , iban , bic , userName , password;
	private double amount;
	
	public static List<User> user = new ArrayList<>();

	public User(int id, String firstName, String lastName, String iban, String bic , double amount) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.iban = iban;
		this.bic = bic;
		this.amount = amount;
	}

	public User(String userName, String iban , String bic , String password , double amount) {
		this.userName = userName;
		this.password = password ; 
		this.userName = userName;
		this.amount = amount;
	}

	public double getAmount() {
		return amount;
	}

	public String getUserName() {
		return userName;
	}

	public String getPassword() {
		return password;
	}

	public String getIban() {
		return iban;
	}

	public String getBic() {
		return bic;
	}

	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" 
				+ lastName + ", iban=" + iban + ", bic=" + bic
				+ ", amount=" + amount + "]";
	}
	
	
//	private String firstName,
//				   lastName,
//				   iBan,
//				   bic,
//				   password,
//				   userName;
//	private double balance;
//	
//	public User (String firstName, String lastName, String iBan, String bic , double balance) {
//		this.firstName = firstName;
//		this.lastName = lastName;
//		this.iBan = iBan;
//		this.bic = bic;
//		this.setBalance(balance);
//	}
//
//	public String getFirstName() {
//		return firstName;
//	}
//
//	public void setFirstName(String firstName) {
//		this.firstName = firstName;
//	}
//
//	public String getLastName() {
//		return lastName;
//	}
//
//	public void setLastName(String lastName) {
//		this.lastName = lastName;
//	}
//
//	public String getiBan() {
//		return iBan;
//	}
//
//	public void setiBan(String iBan) {
//		this.iBan = iBan;
//	}
//
//	public String getBic() {
//		return bic;
//	}
//
//	public void setBic(String bic) {
//		this.bic = bic;
//	}
//
//	public String getPassword() {
//		return password;
//	}
//
//	public void setPassword(String password) {
//		this.password = password;
//	}
//
//	public User(String firstName, String lastName, String iBan, String bic, String password, String userName) {
//		this.firstName = firstName;
//		this.lastName = lastName;
//		this.iBan = iBan;
//		this.bic = bic;
//		this.password = password;
//		this.userName = userName;
//	}
//
//	public String getUserName() {
//		return userName;
//	}
//
//	public void setUserName(String userName) {
//		this.userName = userName;
//	}
//
//	public double getBalance() {
//		return balance;
//	}
//
//	public void setBalance(double balance) {
//		this.balance = balance;
//	}
	
}
