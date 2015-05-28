package projbrutus.person;

import java.util.ArrayList;
import java.util.Iterator;

import projbrutus.DBPersonAdapter;

public class PersonCatalogue {

	private ArrayList<Person> PCatalogue;
	private Iterator iter;
	private Person p;
	private DBPersonAdapter dbpa = new DBPersonAdapter();

	
	public PersonCatalogue() {
		PCatalogue = new ArrayList<Person>();
		PCatalogue = (ArrayList<Person>) dbpa.fetchPersons();	
		iter = PCatalogue.iterator();
		System.out.println("** Hämtat lista...**");
		System.out.println("- LiuID --- Namn --- PersonNummer");
		while(iter.hasNext()){
			p = (Person)iter.next();
			
			System.out.println(p.toString());
		}
		System.out.println();
	}

	
	public Person authenticate(String liuID, String password) {
		for (int i = 0; i < PCatalogue.size(); i++) {
			if (liuID.equals(PCatalogue.get(i).getLiudID())) {

			if (password.equals(PCatalogue.get(i).getPassword())) {
				return PCatalogue.get(i);
			}}
		}
		return null;
	}
	
	public ArrayList<Person> getPCatalogue() {
		return PCatalogue;
	}
	
	public Person getPerson(String liuID){
		for(int i=0; i< PCatalogue.size(); i++){
			if(liuID.equals(PCatalogue.get(i).getLiudID())) {
				return PCatalogue.get(i);
			}	
		}
		return new Person("Voi00", "VoidPerson", "0123456789", "voidperson");
	}

}
