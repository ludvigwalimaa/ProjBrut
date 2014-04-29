package projbrutus.course.participant;

import java.util.ArrayList;
import projbrutus.person.PersonCatalogue;

import projbrutus.course.CourseRoom;
import projbrutus.person.Person;

public class ParticipantList {
	PersonCatalogue pc = new PersonCatalogue();

	public ArrayList<Person> getParticipantList(CourseRoom c) {
		
		//denna deltagarlista blir nu densamma som personkatalogen. I verkligheten
		//skulle denna metod anropa table best�ende av liudID samt kursID och returnera
		//alla personID f�r inskickad kursID
		ArrayList<Person> pList = new ArrayList<Person>();
		
		pList.addAll(pc.getPCatalogue());
		
		//metod som via en sql sats h�mtar alla deltargare f�r en kurs och retunerar denna lista
		
		return pList;
		
	}
	
}
