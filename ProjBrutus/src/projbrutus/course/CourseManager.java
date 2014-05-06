package projbrutus.course;

import java.util.ArrayList;
import java.util.Scanner;

import projbrutus.course.examination.ExaminationArea;
import projbrutus.course.group.Group;
import projbrutus.person.Person;


public class CourseManager {
	
	Scanner in = new Scanner(System.in);
	
	public CourseManager(){
		
	}
	
	
	public CourseRoom getCourseRoom(String cID) {
		CourseCatalogue cc = new CourseCatalogue();
		//cc.populateCourseRooms();
		for(int i = 0; i<cc.getAllCourseRooms().size(); i++){
			if(cID.equals(cc.getAllCourseRooms().get(i).getcId())){
				CourseRoom cr = cc.getAllCourseRooms().get(i);
				System.out.println(cr.toString());
				return cr;
			}else{
				
			}
		}
		return null;
	}
	
	public void createCourseRoom() {
		
		System.out.println("Mata in kursid");
		
		String cId = in.nextLine();
		
		System.out.println("Mata in kursnamn");
		String cName = in.nextLine();
		
		CourseRoom course = new CourseRoom();
		course.setcId(cId);
		course.setcName(cName);
		
	    //course.setExaList(createExaminationArea());
		
		//skapa grupplista? ArrayList<Group> groupList
		
		//skapa deltagarlista? ArrayList<Person> participantList
 
		
	}
	
	public ArrayList<ExaminationArea> createExaminationArea(){
		
		System.out.println("Skriv in lite latjogrejs");
		
		ArrayList<ExaminationArea> exaList = null;

		return exaList;
		
	}
	
}
