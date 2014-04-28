package projbrutus;

import projbrutus.person.PersonCatalogue;

public class LoginManager{
	
	public boolean loginCheck(String liuID, String password) {
		
		PersonCatalogue PC = new PersonCatalogue();
		if(!PC.comparePersons(liuID, password)){
			return false;
		}else{
			return true;
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
