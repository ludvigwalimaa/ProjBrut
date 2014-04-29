package projbrutus;

import projbrutus.person.Person;

public class Overblick {
	Person p;
	
	public Overblick(Person p){
		this.p = p;
		createOverblick();
	}
	
	private void createOverblick(){
		System.out.println("---- Overview -----");
		System.out.println("1. My courses ");
		System.out.println("2. Settings ");
		
	}

}