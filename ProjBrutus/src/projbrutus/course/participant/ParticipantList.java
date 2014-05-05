package projbrutus.course.participant;

import java.util.ArrayList;
import projbrutus.person.PersonCatalogue;
import projbrutus.course.participant.ParticipantCatalogue;

import projbrutus.course.CourseRoom;
import projbrutus.person.Person;


public class ParticipantList {
	ParticipantCatalogue pc = new ParticipantCatalogue();

	public ParticipantList(){
		
	}
	
	public ArrayList<String> getParticipantList(CourseRoom c) {

		ArrayList<String> pList = new ArrayList<String>();

		pList.addAll(pc.getParticipant(c.getcId()));

		//metod som via en sql sats h�mtar alla deltargare f�r en kurs och retunerar denna lista

		return pList;
	}

}
