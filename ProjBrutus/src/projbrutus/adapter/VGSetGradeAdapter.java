package projbrutus.adapter;

import projbrutus.course.examination.task.CourseTaskList;



public class VGSetGradeAdapter implements SetGradeAdapter {
	
	public VGSetGradeAdapter(CourseTaskList ctl){
		postGrade(ctl);
		//countGrade(ctl);
	}
	
	

	
	public String postGrade(CourseTaskList ctl)
	  {
	//Här ska innehållet i CourseTaskList göras om till det format som krävs av det externa systemet.
		
	//Här etableras kontakt med det externa systemet //
		
	//Här skickas innehållet i CourseTaskList över till det externa systemet //
		
	//Simulera att det externa systemet har anropats och 
	//returnerat att det var något fel med de data som skickades. 
		String transactionOutcome = "Invalid data";
	    return transactionOutcome;
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
