package projbrutus.course;

import java.util.ArrayList;

import projbrutus.course.examination.ExaminationArea;
import projbrutus.course.examination.ExaminationList;
import projbrutus.course.participant.ParticipantCatalogue;
import projbrutus.observer.Observer;
import projbrutus.person.Person;
import projbrutus.person.PersonCatalogue;

public class CourseCatalogue {
	
	
	
	public ArrayList<CourseRoom> allCourseRooms = new ArrayList<CourseRoom>(); // HÃƒÂ¤r ÃƒÂ¤r en databas fÃƒÂ¶r personers kursrum
	
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
		Observer obj1;
		for(int i = 0; i < ppcSize; i++){
			ea = eaL.getExaArea(i);
			String liuID = ppc.getliuID(i); // HÃ¤mtar liuID
			ea.setliuID(liuID);
			obj1 = new CourseRoom(cID, cName, liuID, ea, cName);
			for(int j = 0; j<ea.getCTL().getTasks().size(); j++){
				ea.getCTL().getTasks().get(j).register(obj1);
				System.out.println("Task: " + j + " : " + cName + " - " + liuID);
				obj1.setSubject(ea.getCTL().getTasks().get(j));
				
				obj1.update();
				//testGrade(ea);
				//de två över är enbart för test om koppling finns
			
			}
			allCourseRooms.add((CourseRoom) obj1);
		}
		
	}
	
	public void testGrade(ExaminationArea ea){
		
		ea.getCTL().getTasks().get(0).postMessage("Hejbre");
	}

	public void printCourseRooms(){
		String s = "";
		for(int i=0; i<getAllCourseRooms().size(); i++){
			s = s + i + ". " + getAllCourseRooms().get(i).toString();
		}
		
		System.out.println(s);
	}
	


}
