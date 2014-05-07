package projbrutus;

import java.io.IOException;

import projbrutus.course.CourseCatalogue;
import projbrutus.course.CourseRoom;
import projbrutus.course.examination.ExaminationArea;
import projbrutus.course.examination.ExaminationList;
import projbrutus.course.examination.task.CourseTaskList;
import projbrutus.course.group.Group;
import projbrutus.course.group.GroupList;
import projbrutus.course.participant.ParticipantList;
import projbrutus.person.Person;
import projbrutus.person.PersonCatalogue;

public class LoginManager{
	
	
	public void loginCheck(String liuID, String password) {
		
		PersonCatalogue PC = new PersonCatalogue();
		if(!PC.comparePersons(liuID, password)){
			System.out.println("--- Login failed ---");
		}else{
			startUp();
			new Overblick(PC.getPerson(liuID));
		}
	}
	

	
	private void startUp(){
//		ExaminationList exaList = new ExaminationList("725G51"); //Skapar en databas över exalistor för en kurskod
//		exaList.populateDBexaList(); //Skapar alla ExaAreas i "DB" för en Kurskod
//		
//		GroupList groupList = new GroupList("725G51"); //Skapar en databas över Grupper för en kurskod
//		groupList.populateDBgroupList(); //Skapar alla grupper för kursen 725G51 och lägger de i en "DB.
		
//		ExaminationArea ea = exaList.DBexaList.get(0); //Skapar ett personligt exaArea för ludwa930 i kursen 725G51
//		ea.setLiuID("ludwa930");

//		Group g = groupList.DBgroupList.get(0);
//		g.addGroupMember(new Person("ludwa930", "Ludvig", "0123456789", "hej123"));
//		g.addGroupMember(new Person("gabol892", "Gabriel", "0123456789", "hej123"));
//	
		createRoom("725G51", "Databaser"); // gabol892, ludwa930, anka101
		createRoom("725G34", "Historia"); //ludwa930

		
					
		

	}
	
	private void createRoom(String cID, String cName){
		CourseCatalogue cc = new CourseCatalogue();
		CourseRoom a;
		ExaminationList exaList = new ExaminationList();
		ExaminationArea ea;
		ParticipantList participantList = new ParticipantList();
		PersonCatalogue pc = new PersonCatalogue();
		Person p;
		Group g;
		
		GroupList groupList; //Skapar en databas över Grupper för en kurskod
		groupList = new GroupList(cID);
		groupList.populateDBgroupList();  //Skapar 30 grupper
		
		
		
		
		exaList = new ExaminationList(cID);
		exaList.populateDBexaList();
		
		for(int i = 0; i < participantList.getParticipantList(cID).size(); i++){
			String liuID = participantList.getParticipantList(cID).get(i).toString(); // Hämtar liuID
			p = pc.getPerson(liuID);
			
			g = groupList.getDBgroupList().get(i); //Hämtar "i" gruppen i ArrayListan och sätter den till G
			g.addGroupMember(p);
			ea = exaList.getDBexaList().get(i);
			ea.setGroupID(g.getgID());
			
			a = new CourseRoom(cID, cName, liuID, ea, g);
			cc.allCourseRooms.add(a);
		}
		
		
		
	}
	

}
