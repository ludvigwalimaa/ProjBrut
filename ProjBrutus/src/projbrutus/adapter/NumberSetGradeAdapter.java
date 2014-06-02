package projbrutus.adapter;

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
