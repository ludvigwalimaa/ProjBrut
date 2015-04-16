package projbrutus.course;

import java.util.ArrayList;

import projbrutus.course.examination.ExaminationArea;
import projbrutus.course.examination.ExaminationAreaList;
import projbrutus.course.participant.ParticipantCatalogue;
import projbrutus.observer.Observer;
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
		ExaminationAreaList eaL;
		ExaminationArea ea;
		ParticipantCatalogue ppc = new ParticipantCatalogue(cID);
		int ppcSize = ppc.getPPCSize();

		
		eaL = new ExaminationAreaList(cID, cs);
		eaL.populateDBexaList();
		Observer cr;
		for(int i = 0; i < ppcSize; i++){
			ea = eaL.getExaArea(i);
			String liuID = ppc.getliuID(i); // Hämtar liuID
			ea.setliuID(liuID);
			cr = new CourseRoom(cID, cName, liuID, ea, cName);
			int taskSize = ea.getCTL().getTasks().size();
			for(int j = 0; j<taskSize; j++){
				
				//"ea.getCTL().getTasks().get(j)" = currentTask i IAD i startStudent samt startTeacher. 
				ea.getCTL().getTasks().get(j).register(cr);
				cr.setSubject(ea.getCTL().getTasks().get(j));
				
			
			}
			allCourseRooms.add((CourseRoom) cr);
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
