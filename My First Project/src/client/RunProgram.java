package client;

import windows_gui.Login;

public class RunProgram {
	
	public static void main(String[] args) {
		
		Bank b1 = new Bank( "CODEXXX" );
		
		b1.addUser("Max","Mustermann","DE50000000",1500);
		b1.addUser("Ben", "Sulaiman", "DE70000000",3000);
		
		new Login().frame.setVisible(true);
		
		
		
	}

}
