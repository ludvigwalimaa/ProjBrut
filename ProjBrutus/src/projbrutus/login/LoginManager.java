package projbrutus.login;

import projbrutus.course.CourseCatalogue;
import projbrutus.person.PersonCatalogue;

public class LoginManager{
	
	private PersonCatalogue PC = new PersonCatalogue();
	
	public void loginCheck(String liuID, String password) {
		comparePersons(liuID, password, PC);
	}
	
	private void comparePersons(String liuID, String password, PersonCatalogue PC){
		if(!PC.comparePersons(liuID, password)){
			System.out.println("--- Login failed ---");
		}else{
			CourseCatalogue cc = new CourseCatalogue();
			createRoom(cc, PC);
			new Overblick(PC.getPerson(liuID), cc);
			
			
		}
	}

	
	private void createRoom(CourseCatalogue cc, PersonCatalogue PC){
		cc.createRoom("725G51", "Databaser", PC); // gabol892, ludwa930, anka101
		cc.createRoom("725G34", "Historia", PC); //ludwa930

		
					
		

	}
	

	

}
