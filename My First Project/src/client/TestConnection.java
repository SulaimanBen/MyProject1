package client;

public class TestConnection {
	
	public static void main(String[] args) {
		
		User[] user = {new User("Max", "Ant", "DE12515140", "CODEXXXXX"),
						new User("Tom", "Seq", "DE14788963", "CODEXXXXX")};
		
		Bank b1 = new Bank("Bank1", 1 , user);
		
		
		
	}

}
