package projbrutus;

import java.util.Scanner;

public class Login {
	
	Scanner in = new Scanner(System.in);
	LoginManager login = new LoginManager();
	String liuID;
	String password;
	
	public Login() {
		System.out.println("----Login LisamDeluxe-----");
		System.out.print("Skriv in anvandarnamn: ");
		liuID = in.nextLine();
		
		System.out.print("Skriv in losen: ");
		password = in.nextLine();
		
		login.loginCheck(liuID, password);
		
	}

}
