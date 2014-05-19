package projbrutus.adapter;

import projbrutus.course.examination.task.CourseTaskList;

public class NumberSetGradeAdapter implements SetGradeAdapter {

	public NumberSetGradeAdapter(CourseTaskList ctl){
		//countGrade(ctl)  /* Här skulle man eventuellt kunna räkna ut ett betyg */
		postGrade(ctl);
	}
	
	private void countGrade(CourseTaskList ctl){
		//System.out.println("Räknar ut grade...");
	}
	
	public String postGrade(CourseTaskList ctl) 
	 {
	//Här ska innehållet i CourseTaskList göras om till det format som krävs av det externa systemet.
		
	//Här etableras kontakt med det externa systemet //
		
	//Här skickas innehållet i CourseTaskList över till det externa systemet //
		
	//Simulera att det externa systemet har anropats och 
	//returnerat att det var något fel med de data som skickades. 
		String transactionOutcome = "Sending to NumberSetGrade....Invalid data";
	    return transactionOutcome;
	  }






}
