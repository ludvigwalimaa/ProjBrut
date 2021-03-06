package projbrutus.Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import projbrutus.person.Person;
import projbrutus.person.Teacher;

public class DBfascade {

	private Connection con;
	private PreparedStatement stat;
	private ResultSet result;
	private List FetchedPersons;
	
	public DBfascade() {
		
	}

	public void startConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			// String host = "jdbc:mysql://mysql.iei.liu.se/dod1307_725G51";
			String host = "jdbc:mysql://127.0.0.1/INL4";
			String admin = "root";
			String pw = "root";
			this.con = DriverManager.getConnection(host, admin, pw);
			System.out.println("Connected to database!");
		} catch (Exception ex) {
			ex.printStackTrace();
			System.out.println("Error! Can't connect to database...");

		}
	}
	
	public void closeConnection(){
		try {
			this.con.close();
			System.out.println("Connection closed!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public List returnPersons(){
		this.startConnection();
        try {
            stat = con.prepareStatement("SELECT * FROM personcatalogue;");
            result = stat.executeQuery();
            
            FetchedPersons = new ArrayList<Person>();
            String liuID ="";
    		String name ="";
    		String personNummer = "";
    		String password = "";
    		int admin = 0;
            
    		System.out.println("** Hämtar FRÅN DBfascade **");
    		while(result.next()){
    			liuID = result.getString("liuID");
            	name = result.getString("name");
            	personNummer = result.getString("personNummer");
            	password = result.getString("password");
                admin = result.getInt("admin");
                List p = new ArrayList();
                p.add(liuID);
                p.add(name);
                p.add(personNummer);
                p.add(password);
                p.add(admin);
                FetchedPersons.add(p);
    		} //END WHILE
    		this.closeConnection();
        }// END TRY
        catch (Exception e) {
            e.printStackTrace();
        }
		return FetchedPersons;
		
	}


	
}
