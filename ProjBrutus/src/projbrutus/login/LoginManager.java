package projbrutus.login;

import java.io.IOException;

import projbrutus.course.CourseCatalogue;
import projbrutus.course.CourseRoom;
import projbrutus.course.examination.ExaminationArea;
import projbrutus.course.examination.ExaminationList;
import projbrutus.course.examination.task.CourseTaskList;
import projbrutus.course.group.Group;
import projbrutus.course.group.GroupList;
import projbrutus.person.Person;
import projbrutus.person.PersonCatalogue;

public class LoginManager{
	
	
	public void loginCheck(String liuID, String password) {
		
		PersonCatalogue PC = new PersonCatalogue();
		if(!PC.comparePersons(liuID, password)){
			System.out.println("--- Login failed ---");
		}else{
			CourseCatalogue cc = new CourseCatalogue();
			startUp(cc);
			new Overblick(PC.getPerson(liuID), cc);
			
			
		}
	}
	

	
	private void startUp(CourseCatalogue cc){
		cc.createRoom("725G51", "Databaser"); // gabol892, ludwa930, anka101
		cc.createRoom("725G34", "Historia"); //ludwa930

		
					
		

	}
	

	

}
