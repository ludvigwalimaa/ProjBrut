package projbrutus.course.participant;

import java.util.ArrayList;
import projbrutus.person.PersonCatalogue;

import projbrutus.course.CourseRoom;
import projbrutus.person.Person;

public class ParticipantList {
	PersonCatalogue pc = new PersonCatalogue();

	public ArrayList<Person> getParticipantList(CourseRoom c) {
		
		//denna deltagarlista blir nu densamma som personkatalogen. I verkligheten
		//skulle denna metod anropa table bestående av liudID samt kursID och returnera
		//alla personID för inskickad kursID
		ArrayList<Person> pList = new ArrayList<Person>();
		
		pList.addAll(pc.getPCatalogue());
		
		//metod som via en sql sats hämtar alla deltargare för en kurs och retunerar denna lista
		
		return pList;
		
	}
	
}
