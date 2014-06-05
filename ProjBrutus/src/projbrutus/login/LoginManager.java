package projbrutus.login;

import projbrutus.course.CourseCatalogue;
import projbrutus.person.Person;
import projbrutus.person.PersonCatalogue;

public class LoginManager{
	
	private PersonCatalogue PC = new PersonCatalogue();
	
	public void loginCheck(String liuID, String password) {
		authenticate(liuID, password, PC);
	}
	
	private void authenticate(String liuID, String password, PersonCatalogue PC){
		if(PC.authenticate(liuID, password) == null){
			System.out.println("--- Login failed ---");
		}else{
			Person p = PC.authenticate(liuID, password);
			CourseCatalogue cc = new CourseCatalogue();
			createRoom(cc, PC);
			new Overview(p, cc);
			
			
		}
	}

	
	private void createRoom(CourseCatalogue cc, PersonCatalogue PC){
		cc.createRoom("725G51", "Databaser", PC); // gabol892, ludwa930, anka101
		cc.createRoom("725G34", "Historia", PC); //ludwa930

		
					
		

	}
	

	

}
