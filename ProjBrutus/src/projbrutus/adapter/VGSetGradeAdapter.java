package projbrutus.adapter;

import projbrutus.Database.DBconn;
import projbrutus.course.examination.task.CourseTaskList;
import projbrutus.person.Person;



public class VGSetGradeAdapter implements SetGradeAdapter {
	
	public VGSetGradeAdapter(){
		//countGrade(ctl);  /* Här skulle man eventuellt kunna räkna ut ett betyg */
	}
	
//	private void countGrade(CourseTaskList ctl){
//		//System.out.println("Räknar ut grade...");
//	}
//	
//	public void calcGrade(CourseTaskList ctl, String liuID)
//	  {
////		DBconn dbcon = new DBconn();
////		dbcon.startConnection();
////		dbcon.postGrade(ctl, liuID);
//	  }


	public String postGrade() {
		String s = "..Recieved by VGSetGradeAdapter!";
		return s;
	
		
	}






//	public void countGrade(CourseTaskList ctl) {	
//		for(int i= 0; i < ctl.getTasks().size(); i++){
//			if(ctl.getTasks().get(i).getGrade().equals("G")){
//				G++;
//			}else if(ctl.getTasks().get(i).getGrade().equals("VG")){
//				VG++;
//			}else{
//				other++;
//			}
//		}
//		calcGrade();
//	}
//	
//	
//	public void calcGrade() {
//		if(VG >= 3 && G <=2 ){
//			System.out.println("Slutbetyg : VG");
//		}else{
//			System.out.println("Annat betyg");
//		}
//		
//	}
//	
//	public int getGrade() {
//		return 0;
//	}

}
