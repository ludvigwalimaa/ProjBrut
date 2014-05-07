package projbrutus;

import java.util.Scanner;

public class Login {
	
	Scanner in = new Scanner(System.in);
	LoginManager login = new LoginManager();
	String liuID;
	String password;
	
	public Login() {
		System.out.println("----Login Project Brutus-----");
		System.out.print("Usename(liuID): ");
		liuID = in.nextLine();
		
		System.out.print("Password: ");
		password = in.nextLine();
		
		login.loginCheck(liuID, password);
		
	}

}
