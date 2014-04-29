package projbrutus;

import projbrutus.person.PersonCatalogue;

public class LoginManager{
	
	
	public void loginCheck(String liuID, String password) {
		
		PersonCatalogue PC = new PersonCatalogue();
		if(!PC.comparePersons(liuID, password)){
			System.out.println("--- Login failed ---");
		}else{
			System.out.println("--- Login success ---");
			new Overblick(PC.getPerson(liuID));
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
		
	}}
