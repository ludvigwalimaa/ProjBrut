package projbrutus.person;

import java.util.ArrayList;

public class PersonCatalogue {

	ArrayList<Person> PCatalogue;

	public PersonCatalogue() {
		PCatalogue = new ArrayList<Person>();
		fetchPersons();

	}

	private void fetchPersons() {
		// Databas koppling till persondatabas.
		PCatalogue.add(new Person("per000", "PerSon", "0123456789", "hej123"));
	}

	// Nån funktion för att kolla listan mot det man loggar in med.
	public boolean comparePersons(String liuID, String password) {
		for (int i = 0; i < PCatalogue.size(); i++) {
			if (liuID.equals(PCatalogue.get(i).getLiudID())) {
			}
			if (password.equals(PCatalogue.get(i).getPassword())) {
				return true;
			}
		}
		return false;
	}

}
