package projbrutus.Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBconn {

	private Connection con;
	private PreparedStatement stat;
	private ResultSet result;

	public DBconn() {
		startConnection();
	}

	public void startConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String host = "jdbc:mysql://mysql.iei.liu.se/dod1307_Projekt";
			String admin = "dod1307";
			String pw = "hej123";
			this.con = DriverManager.getConnection(host, admin, pw);
			// System.out.println("Har kontakt med databasen!");
		} catch (Exception ex) {
			ex.printStackTrace();
			System.out.println("Fel! Kan inte kontakta databasen..");

		}
	}
	
	
}
