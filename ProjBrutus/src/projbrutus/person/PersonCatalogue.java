package projbrutus.person;

import java.util.ArrayList;

public class PersonCatalogue {

	private ArrayList<Person> PCatalogue;

	public PersonCatalogue() {
		PCatalogue = new ArrayList<Person>();
		fetchPersons();

	}

	private void fetchPersons() {
		// Databas koppling till persondatabas.
		PCatalogue.add(new Person("gabol892", "Gabriel", "0123456789", "hej123"));
		PCatalogue.add(new Person("filbr616", "Filip", "0123456789", "hej123"));
		PCatalogue.add(new Person("ludwa930", "Ludvig", "0123456789", "hej123"));
		PCatalogue.add(new Person("anka101", "Andreas", "0123456789", "hej123"));
	}

	// Nån funktion för att kolla listan mot det man loggar in med.
	public boolean comparePersons(String liuID, String password) {
		for (int i = 0; i < PCatalogue.size(); i++) {
			if (liuID.equals(PCatalogue.get(i).getLiudID())) {

			if (password.equals(PCatalogue.get(i).getPassword())) {
				return true;
			}}
		}
		return false;
	}
	
	public ArrayList<Person> getPCatalogue() {
		return PCatalogue;
	}
	
	public Person getPerson(String liuID){
		for(int i=0; i< PCatalogue.size(); i++){
			if(liuID.equals(PCatalogue.get(i))) return PCatalogue.get(i);
		}
		return new Person("Voi00", "VoidPerson", "0123456789", "voidperson");
	}

}
