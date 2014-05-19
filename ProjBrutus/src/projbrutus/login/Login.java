package projbrutus.login;

import java.util.Scanner;

import projbrutus.Database.DBconn;

public class Login {
	
	private Scanner in = new Scanner(System.in);
	private LoginManager login = new LoginManager();
	private String liuID;
	private String password;
	
	public Login() {
		DBconn dbcon = new DBconn();
		dbcon.closeConnection();
		System.out.println("----Login Project Brutus-----");
		System.out.print("Usename(liuID): ");
		liuID = in.nextLine();
		
		System.out.print("Password: ");
		password = in.nextLine();
		
		loginCheck(liuID, password);
		
		
	}
	
	private void loginCheck(String liuID, String password){
		login.loginCheck(liuID, password);
	}

}
