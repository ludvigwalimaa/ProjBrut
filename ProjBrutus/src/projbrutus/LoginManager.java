package projbrutus;

import java.io.IOException;

import projbrutus.course.CourseCatalogue;
import projbrutus.course.CourseRoom;
import projbrutus.course.examination.ExaminationArea;
import projbrutus.course.examination.ExaminationList;
import projbrutus.course.examination.task.CourseTaskList;
import projbrutus.course.group.GroupList;
import projbrutus.course.participant.ParticipantList;
import projbrutus.person.PersonCatalogue;

public class LoginManager{
	
	
	public void loginCheck(String liuID, String password) {
		
		PersonCatalogue PC = new PersonCatalogue();
		if(!PC.comparePersons(liuID, password)){
			System.out.println("--- Login failed ---");
		}else{
			startUp(liuID);
			//new Overblick(PC.getPerson(liuID));
		}
		
//			boolean secure = false;
//			
//			if (ID.equals("admin") && pass.equals("admin")) {
//				
//				secure = true;
//				
//			}
//			
//			return secure;
//		}
		
	}
	

	
	private void startUp(String liuID){
		System.out.println(liuID);
		ExaminationList exaList = new ExaminationList("725G51"); //Skapar en databas över exalistor
		exaList.populateDBexaList(); //Skapar alla ExaAreas i "DB" för en Kurskod
		ExaminationArea ea = exaList.DBexaList.get(0); //Skapar ett exaArea för ludwa930.
		ea.setLiuID("ludwa930");
		
		CourseTaskList ctl = ea.getCTL();
		
		
		GroupList groupList = new GroupList();
		ParticipantList participantList = new ParticipantList();
		
		CourseCatalogue cc = new CourseCatalogue();
		CourseRoom a = new CourseRoom("725G51", "Databaser", "ludwa930", ea);
		cc.allCourseRooms.add(a);
		
		System.out.println("Kursrummet:");
		System.out.println(a.toString());
		
		System.out.println("ExaminationsLista:");
		System.out.println("ExaminationsArea: " + a.getEa().toString());
		
		System.out.println("CourseTaskList: ");
		System.out.println(a.getEa().getCTL().toString());
		System.out.println("Tasks:");
		System.out.println(a.getEa().getCTL().getTasks().toString());
	}
	

}
