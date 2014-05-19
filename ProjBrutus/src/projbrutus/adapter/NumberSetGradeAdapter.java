package projbrutus.adapter;

import projbrutus.Database.DBconn;
import projbrutus.course.examination.task.CourseTaskList;
import projbrutus.person.Person;

public class NumberSetGradeAdapter implements SetGradeAdapter {

	public NumberSetGradeAdapter(){
		//countGrade(ctl)  /* Här skulle man eventuellt kunna räkna ut ett betyg */
		
	}
	

	public String postGrade() {
		String s = "..Recieved by NumberSetGradeAdapter!";
		return s;	
	}

//	@Override
//	public void calcGrade(CourseTaskList ctl, String liuID) {
////		DBconn dbcon = new DBconn();
////		dbcon.startConnection();
////		dbcon.postGrade(ctl, liuID);
//		
//	}







}
