package projbrutus;

import java.util.Scanner;

public class Login {
	
	Scanner in = new Scanner(System.in);
	LoginManager login = new LoginManager();
	String userID;
	String pass;
	
	public Login() {
		
		System.out.println("Skriv in användarnamn: ");
		userID = in.nextLine();
		
		System.out.println("Skriv in lösen: ");
		pass = in.nextLine();
		
		if (login.loginCheck(userID, pass)) {
			System.out.println("---Login success---");
		} else {
			System.out.println("---Login failed---");
		}
		
	}

}
