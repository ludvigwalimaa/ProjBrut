package projbrutus.course;

import java.util.ArrayList;

import projbrutus.course.examination.ExaminationList;
import projbrutus.course.group.GroupList;
import projbrutus.course.participant.ParticipantList;

public class CourseCatalogue {
	
	
	
	private ArrayList<CourseRoom> allCourseRooms = new ArrayList<CourseRoom>(); // Här är en databas för personers kursrum
	
	public CourseCatalogue(){
		
	}

	public void populateCourseRooms(){
		
		ExaminationList exaList = new ExaminationList();
		GroupList groupList = new GroupList();
		ParticipantList participantList = new ParticipantList();
		CourseRoom k = new CourseRoom("725G51", "Databaser", exaList.getList(), groupList.getGroupList("725G51"), participantList.getParticipantList("725G51"));
		allCourseRooms.add(k);
	}
	
	public ArrayList<CourseRoom> getAllCourseRooms(){
		return allCourseRooms;
		
	}
	
	
	
	public boolean getCourse(String cId) {
		boolean courseExists = false;
		
		//metod som kollar om inskickat kursID finns i databasen(MapCourseDesc?), 
		//om ja retuneras true och klassen kursnhanterare kan g� vidare i koden
		
		if(cId.equals("725G51") 
		|| cId.equals("725G54")
		|| cId.equals("725G56")
		|| cId.equals("725G44")
		|| cId.equals("725G41")
		|| cId.equals("725G64")
		|| cId.equals("725G26")
		|| cId.equals("725G74")
		|| cId.equals("725G34")
		|| cId.equals("725G24")
		|| cId.equals("725G66")
		|| cId.equals("725G74")) {
			courseExists = false;
		} else {
			
		}
		return courseExists;
	}

}
