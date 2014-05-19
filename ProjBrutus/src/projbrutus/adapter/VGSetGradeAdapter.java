package projbrutus.adapter;

import projbrutus.Database.DBconn;
import projbrutus.course.examination.task.CourseTaskList;



public class VGSetGradeAdapter implements SetGradeAdapter {
	
	public VGSetGradeAdapter(CourseTaskList ctl){
		//countGrade(ctl);  /* Här skulle man eventuellt kunna räkna ut ett betyg */
		postGrade(ctl);
		
	}
	
	private void countGrade(CourseTaskList ctl){
		//System.out.println("Räknar ut grade...");
	}
	
	public void postGrade(CourseTaskList ctl)
	  {
		DBconn dbcon = new DBconn();
		dbcon.postGrade(ctl);
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
