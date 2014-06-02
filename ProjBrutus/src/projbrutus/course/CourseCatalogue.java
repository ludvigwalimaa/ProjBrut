package projbrutus.course;

import java.util.ArrayList;

import projbrutus.course.examination.ExaminationArea;
import projbrutus.course.examination.ExaminationList;
import projbrutus.course.examination.task.CourseTaskList;
import projbrutus.course.group.Group;
import projbrutus.course.group.GroupList;
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
		Person p;
		Group g;
		
		eaL = new ExaminationList(cID, cs);
		eaL.populateDBexaList();
		
		//Skapar en databas över Grupper för en kurskod

		GroupList groupList = new GroupList(cID, cs);
		groupList.populateDBgroupList();  //Skapar 30 grupper
		
		for(int i = 0; i < ppc.getParticipants().size(); i++){
			String liuID = ppc.getParticipants().get(i).toString(); // Hämtar liuID
			p = pc.getPerson(liuID);
			
			g = groupList.getDBgroupList().get(i); //Hämtar "i" gruppen i ArrayListan och sätter den till G
			g.addGroupMember(p);
			ea = eaL.getDBexaList().get(i);
			ea.setGroupID(g.getgID());
			
			cr = new CourseRoom(cID, cName, liuID, ea, g);
			addRoom(cr);
		}
	}
	
	private void addRoom(CourseRoom cr){
		allCourseRooms.add(cr);
	}

	public void printCourseRooms(){
		String s = "";
		for(int i=0; i<getAllCourseRooms().size(); i++){
			s = s + i + ". " + getAllCourseRooms().get(i).toString();
		}
		
		System.out.println(s);
	}
	


}
