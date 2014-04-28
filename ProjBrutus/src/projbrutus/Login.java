package projbrutus;

import java.util.Scanner;

public class Login {
	
	Scanner in = new Scanner(System.in);
	LoginManager login = new LoginManager();
	String userID;
	String pass;
	
	public Login() {
		
		System.out.println("Skriv in anv�ndarnamn: ");
		userID = in.nextLine();
		
		System.out.println("Skriv in l�sen: ");
		pass = in.nextLine();
		
		if (login.loginCheck(userID, pass)) {
			System.out.println("---Login success---");
		} else {
			System.out.println("---Login failed---");
		}
		
	}

}
