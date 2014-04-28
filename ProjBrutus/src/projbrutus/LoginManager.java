package projbrutus;

public class LoginManager extends Main {
	
	public boolean loginCheck(String ID, String pass) {
			boolean secure = false;
			
			if (ID.equals("admin") && pass.equals("admin")) {
				
				secure = true;
				
			}
			
			return secure;
		}
		
	}
