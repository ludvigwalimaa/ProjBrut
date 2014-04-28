package projbrutus;

import java.util.Scanner;

public class Login {
	
	Scanner in = new Scanner(System.in);
	LoginManager login = new LoginManager();
	String userID;
	String pass;
	
	public Login() {
		
		System.out.print("Skriv in anvandarnamn: ");
		userID = in.nextLine();
		
		System.out.print("Skriv in losen: ");
		pass = in.nextLine();
		
		if (login.loginCheck(userID, pass)) {
			System.out.println("---Login success---");
		} else {
			System.out.println("---Login failed---");
		}
		
	}

}
