package projbrutus.course;

import java.util.ArrayList;

import projbrutus.course.examination.ExaminationArea;
import projbrutus.course.examination.ExaminationList;
import projbrutus.course.examination.task.CourseTaskList;
import projbrutus.course.group.Group;
import projbrutus.course.group.GroupList;
import projbrutus.course.participant.ParticipantList;
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
		//CourseCatalogue cc = new CourseCatalogue();
		CourseStructure cs = new CourseStructure();
		
		CourseRoom cr;
		ExaminationList exaList = new ExaminationList();
		ExaminationArea ea;
		ParticipantList participantList = new ParticipantList();
		PersonCatalogue pc = new PersonCatalogue();
		Person p;
		Group g;
		
		GroupList groupList; //Skapar en databas över Grupper för en kurskod
		groupList = new GroupList(cID, cs.getDefaultGroupListSize());
		groupList.populateDBgroupList();  //Skapar 30 grupper
		
		exaList = new ExaminationList(cID, cs.getDefaultExaminationAreaSize(), cs.getDefaultCourseTaskListSize());
		exaList.populateDBexaList();
		
		for(int i = 0; i < participantList.getParticipantList(cID).size(); i++){
			String liuID = participantList.getParticipantList(cID).get(i).toString(); // Hämtar liuID
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
