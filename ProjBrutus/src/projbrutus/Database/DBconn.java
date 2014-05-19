package projbrutus.Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import projbrutus.course.examination.task.CourseTask;
import projbrutus.course.examination.task.CourseTaskList;
import projbrutus.person.Person;

public class DBconn {

	private Connection con;
	private PreparedStatement stat;
	private ResultSet result;

	public DBconn() {
		
	}

	public void startConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String host = "jdbc:mysql://mysql.iei.liu.se/dod1307_725G51";
			String admin = "dod1307";
			String pw = "hej123";
			this.con = DriverManager.getConnection(host, admin, pw);
			System.out.println("Connection open!");
		} catch (Exception ex) {
			ex.printStackTrace();
			System.out.println("Fel! Kan inte kontakta databasen..");

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
