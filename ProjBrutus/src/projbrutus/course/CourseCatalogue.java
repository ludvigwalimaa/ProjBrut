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
		CourseRoom a = new CourseRoom("725G51", "Databaser", exaList.getList(), groupList.getGroupList("725G51"), participantList.getParticipantList("725G51"));
		allCourseRooms.add(a);
		
		CourseRoom b = new CourseRoom("725G54", "Processer och IT", exaList.getList(), groupList.getGroupList("725G54"), participantList.getParticipantList("725G54"));
		allCourseRooms.add(b);
		
		CourseRoom c = new CourseRoom("725G56", "Kanonkurs", exaList.getList(), groupList.getGroupList("725G56"), participantList.getParticipantList("725G56"));
		allCourseRooms.add(c);
		
		CourseRoom d = new CourseRoom("725G44", "International Analys", exaList.getList(), groupList.getGroupList("725G44"), participantList.getParticipantList("725G44"));
		allCourseRooms.add(d);
		
		CourseRoom e = new CourseRoom("725G41", "Vem vet mest?", exaList.getList(), groupList.getGroupList("725G41"), participantList.getParticipantList("725G41"));
		allCourseRooms.add(e);
		
		CourseRoom f = new CourseRoom("725G64", "Filipkunskap", exaList.getList(), groupList.getGroupList("725G64"), participantList.getParticipantList("725G64"));
		allCourseRooms.add(f);
		
		CourseRoom g = new CourseRoom("725G26", "Datafest", exaList.getList(), groupList.getGroupList("725G26"), participantList.getParticipantList("725G26"));
		allCourseRooms.add(g);
		
		CourseRoom h = new CourseRoom("725G74", "All aboard the PCI express", exaList.getList(), groupList.getGroupList("725G74"), participantList.getParticipantList("725G74"));
		allCourseRooms.add(h);
		
		CourseRoom i = new CourseRoom("725G34", "Jordbruksvetenskap", exaList.getList(), groupList.getGroupList("725G34"), participantList.getParticipantList("725G34"));
		allCourseRooms.add(i);
		
		CourseRoom j = new CourseRoom("725G24", "Kanalanalys", exaList.getList(), groupList.getGroupList("725G24"), participantList.getParticipantList("725G24"));
		allCourseRooms.add(j);
		
		CourseRoom k = new CourseRoom("725G66", "Historia", exaList.getList(), groupList.getGroupList("725G66"), participantList.getParticipantList("725G66"));
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
		|| cId.equals("725G66"))
		{
			courseExists = false;
		} else {
			
		}
		return courseExists;
	}

}
