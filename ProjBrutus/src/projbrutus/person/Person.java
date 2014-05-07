package projbrutus.person;

public class Person {

	private String liuID;
	private String name;
	private String personNummer;
	private String password;

	public Person(String liuID, String name, String personNummer, String password) {
		setLiuID(liuID);
		setName(name);
		setPersonNummer(personNummer);
		setPassword(password);
		
	}
	
	public String toString(){
		return name + " - " + liuID;
	}

	public String getLiudID() {
		return liuID;
	}

	public void setLiuID(String liudID) {
		this.liuID = liudID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPersonNummer() {
		return personNummer;
	}

	public void setPersonNummer(String personNummer) {
		this.personNummer = personNummer;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
