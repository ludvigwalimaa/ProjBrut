package projbrutus.course;

import java.util.ArrayList;

import projbrutus.course.examination.ExaminationArea;
import projbrutus.course.examination.ExaminationList;
import projbrutus.course.participant.ParticipantCatalogue;
import projbrutus.person.Person;
import projbrutus.person.PersonCatalogue;

public class CourseCatalogue {
	
	
	
	public ArrayList<CourseRoom> allCourseRooms = new ArrayList<CourseRoom>(); // HÃ¤r Ã¤r en databas fÃ¶r personers kursrum
	
	public CourseCatalogue(){
		
	}
	
	public ArrayList<CourseRoom> getAllCourseRooms(){
		return allCourseRooms;
		
	}
	
	public void createRoom(String cID, String cName, PersonCatalogue pc){
		CourseStructure cs = new CourseStructure();
		CourseRoom cr;
		ExaminationList eaL;
		ExaminationArea ea;
		ParticipantCatalogue ppc = new ParticipantCatalogue(cID);
		int ppcSize = ppc.getPPCSize();

		
		eaL = new ExaminationList(cID, cs);
		eaL.populateDBexaList();
		
		for(int i = 0; i < ppcSize; i++){
			ea = eaL.getExaArea(i);
			String liuID = ppc.getliuID(i); // Hämtar liuID
			ea.setliuID(liuID);
			cr = new CourseRoom(cID, cName, liuID, ea);
			allCourseRooms.add(cr);
		}
	}
	

	public void printCourseRooms(){
		String s = "";
		for(int i=0; i<getAllCourseRooms().size(); i++){
			s = s + i + ". " + getAllCourseRooms().get(i).toString();
		}
		
		System.out.println(s);
	}
	


}
