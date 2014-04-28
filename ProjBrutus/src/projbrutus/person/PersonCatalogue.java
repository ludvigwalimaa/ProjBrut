package projbrutus.person;

import java.util.ArrayList;

public class PersonCatalogue {

	ArrayList<Person> PCatalogue;
	
	public PersonCatalogue(){
		PCatalogue = new ArrayList<Person>();
		System.out.println("Skapar ny arraylist");
		fetchPersons();
		
	}
	
	private void fetchPersons(){
		//Databas koppling till persondatabas.
		PCatalogue.add(new Person("per000", "PerSon", "0123456789", "hej123"));
		System.out.println("added person..");
	}
	
	//Nån funktion för att kolla listan mot det man loggar in med.
	private boolean comparePersons(Person p){
		for(int i=0; i< PCatalogue.size(); i++){
			if(p.getLiudID().equals(PCatalogue.get(i).getLiudID())){
				System.out.println("Rätt LiuID");
				return false;
			}
				if(p.getPassword().equals(PCatalogue.get(i).getPassword())){
					System.out.println("Rätt LÖSENORD också!");
					return true;
				}
			}
		return false;
	}
	
}
