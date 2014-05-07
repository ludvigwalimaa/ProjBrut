package projbrutus.course.participant;

import java.util.ArrayList;

import projbrutus.person.Person;

public class ParticipantCatalogue {


	//ska anropa table best�ende av liuid och kursid, matchar inskickad kursid mot table
	//och returnerar arraylista med alla liuid som tillh�r dettta kursid

	public ArrayList<String> getParticipant(String cId){
		ArrayList<String> pList = new ArrayList<String>();


		if(cId.equals("725G51")) {
			pList.add("gabol892");
			pList.add("ludwa930");
			pList.add("anka101");
			pList.add("admin");
		} else if (cId.equals("725G54")) {
			pList.add("gabol892");
			pList.add("admin");
		} else if (cId.equals("725G56")) {
			pList.add("gabol892");
			pList.add("admin");
		} else if (cId.equals("725G44")) {
			pList.add("gabol892");
			pList.add("admin");
		} else if (cId.equals("725G41")){		
			pList.add("filbr616");
			pList.add("admin");
		} else if (cId.equals("725G64")) {
			pList.add("filbr616");
			pList.add("admin");
		} else if (cId.equals("725G26")) {
			pList.add("filbr616");
			pList.add("admin");
		} else if (cId.equals("725G74")) {
			pList.add("filbr616");
			pList.add("anka101");
			pList.add("admin");
		} else if (cId.equals("725G34")) {
			pList.add("ludwa930");
			pList.add("admin");
		}else if (cId.equals("725G24")) {
			pList.add("anka101");
			pList.add("admin");
		} else if (cId.equals("725G66")) {
			pList.add("anka101");
			pList.add("admin");
		} else if (cId.equals("725G74")) {
			pList.add("anka101");
			pList.add("filbr616");
			pList.add("admin");
		} else {
			pList.add("no participats");
		}




		return pList;
	}







}
