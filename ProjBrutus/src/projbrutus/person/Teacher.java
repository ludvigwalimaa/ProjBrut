package projbrutus.person;

public class Teacher extends Person {
	
	private int admin;
	
	public Teacher(String liuID, String name, String personNummer, String password) {
		super(liuID, name, personNummer, password);
		this.admin = 1;
		// TODO Auto-generated constructor stub
	}

	
	
}
