package projbrutus.Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import projbrutus.course.examination.task.CourseTask;
import projbrutus.course.examination.task.CourseTaskList;
import projbrutus.person.Person;
import projbrutus.person.Teacher;

public class DBconn {

	private Connection con;
	private PreparedStatement stat;
	private ResultSet result;

	public DBconn() {
		
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
	
	public ArrayList<Person> fetch(){
		ArrayList<Person> FetchedPersons = new ArrayList<Person>();
		String liuID ="";
		String name ="";
		String personNummer = "";
		String password = "";
		int admin = 0;
		
        try {
            stat = con.prepareStatement("SELECT * FROM personcatalogue;");
            result = stat.executeQuery();
            System.out.println("** Populating PCatalogue from database ** ");
            while (result.next()) {
            	liuID = result.getString("liuID");
            	name = result.getString("name");
            	personNummer = result.getString("personNummer");
            	password = result.getString("password");
                admin = result.getInt("admin");
                if(admin == 0)
                {
                	FetchedPersons.add(new Person(liuID, name, personNummer, password));
                	System.out.println("Added student: " + liuID);
                	
                }else{
                	FetchedPersons.add(new Teacher(liuID, name, personNummer, password));
                	System.out.println("Added teacher: " + liuID);
                }
            }
            return FetchedPersons;
        } catch (Exception e) {
            e.printStackTrace();
        }
		return FetchedPersons;

		
	}
	
	 public String getCourseTask(String liuId) {

		 String course = "";
		 String courseTask = "";
		 String grade = "";

	        try {
	            stat = con.prepareStatement("select * from Betyg where LiuID = '" + liuId + "' order by CourseTask ASC");
	            result = stat.executeQuery();
	            
	            
	            

	            //  select Anv�ndare.Anv�ndarl�sen from Anv�ndare where Anv�ndarinlogg = '" + name + "'
	            while (result.next()) {
	                course = result.getString("Course");
	                courseTask = result.getString("CourseTask");
	                grade = result.getString("Grade");
	                System.out.println("h�mtat fr�n databasen " + course + " " + courseTask + " " + grade);
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        
	        
	        return liuId;
	    }

	public void postGrade(CourseTaskList ctl, String liuID) {
		for(int i=0; i< ctl.getTasks().size(); i++){
			CourseTask ct = ctl.getTasks().get(i);
			String cId = ct.getcId();
			int task = i;
			String grade = ct.getGrade();
			String query = "UPDATE Betyg SET Grade='" + grade + "' WHERE LiuID='" + liuID + "' AND Course='" + cId + "' AND CourseTask ='" + task + "'"; 
			System.out.println(query);
			try {
				stat = con.prepareStatement(query);
				stat.executeUpdate();	
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}	
	}
	
	public ResultSet getTasks(){
		return result;
		
	}
	 

}
