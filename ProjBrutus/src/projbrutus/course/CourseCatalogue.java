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
	
	
	
	public static ArrayList<CourseRoom> allCourseRooms = new ArrayList<CourseRoom>(); // HÃ¤r Ã¤r en databas fÃ¶r personers kursrum
	
	public CourseCatalogue(){
		
	}
	
	public ArrayList<CourseRoom> getAllCourseRooms(){
		return allCourseRooms;
		
	}
	
	public void createRoom(String cID, String cName){
		CourseStructure cs = new CourseStructure();
		CourseRoom cr;
		ExaminationList exaList;
		ExaminationArea ea;
		ParticipantCatalogue ppc = new ParticipantCatalogue(cID);
		PersonCatalogue pc = new PersonCatalogue();
		Person p;
		Group g;
		
		exaList = new ExaminationList(cID, cs.getDefaultExaminationAreaSize(), cs.getDefaultCourseTaskListSize());
		exaList.populateDBexaList();
		
		GroupList groupList; //Skapar en databas över Grupper för en kurskod
		groupList = new GroupList(cID, cs.getDefaultGroupListSize());
		groupList.populateDBgroupList();  //Skapar 30 grupper
		
		for(int i = 0; i < ppc.getParticipants().size(); i++){
			String liuID = ppc.getParticipants().get(i).toString(); // Hämtar liuID
			p = pc.getPerson(liuID);
			
			g = groupList.getDBgroupList().get(i); //Hämtar "i" gruppen i ArrayListan och sätter den till G
			g.addGroupMember(p);
			ea = exaList.getDBexaList().get(i);
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
