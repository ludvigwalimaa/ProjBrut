package projbrutus.course;

import java.util.ArrayList;

import projbrutus.course.examination.ExaminationArea;
import projbrutus.course.examination.ExaminationAreaList;
import projbrutus.course.participant.ParticipantCatalogue;
import projbrutus.observer.Observer;
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
		ExaminationAreaList eaL;
		ExaminationArea ea;
		ParticipantCatalogue ppc = new ParticipantCatalogue(cID);
		int ppcSize = ppc.getPPCSize();

		
		eaL = new ExaminationAreaList(cID, cs);
		eaL.populateDBexaList();
		Observer obj1;
		for(int i = 0; i < ppcSize; i++){
			ea = eaL.getExaArea(i);
			String liuID = ppc.getliuID(i); // Hämtar liuID
			ea.setliuID(liuID);
			obj1 = new CourseRoom(cID, cName, liuID, ea, cName);
			for(int j = 0; j<ea.getCTL().getTasks().size(); j++){
				ea.getCTL().getTasks().get(j).register(obj1);
				//System.out.println("Task: " + j + " : " + cName + " - " + liuID);
				obj1.setSubject(ea.getCTL().getTasks().get(j));
				
				//obj1.update();
				//testGrade(ea);
				//de tva funktionerna ovan ar enbart for test om koppling finns
			
			}
			allCourseRooms.add((CourseRoom) obj1);
		}
		
	}
	
	public void testGrade(ExaminationArea ea){
		
		ea.getCTL().getTasks().get(0).postMessage("test");
	}

	public void printCourseRooms(){
		String s = "";
		for(int i=0; i<getAllCourseRooms().size(); i++){
			s = s + i + ". " + getAllCourseRooms().get(i).toString();
		}
		
		System.out.println(s);
	}
	


}
