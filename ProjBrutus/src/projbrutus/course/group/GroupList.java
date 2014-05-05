package projbrutus.course.group;

import java.util.ArrayList;
import projbrutus.course.CourseStructure;

public class GroupList {

	ArrayList<Group> groupList = new ArrayList<Group>();
	CourseStructure cs = new CourseStructure();
	
	public ArrayList<Group> getGroupList(String cId) {
		
		//sql anrop till table över gruppID samt kursID för att
		//hämta alla grupper som tillhör en kurs
		
		//måste göra grupplistor för varje kurs, gör ett anrop som skapar grupplistan med
		//tomma grupper tillsvidare
		groupList = createGroupList(cId);
	
		return groupList;
	}
	
	public ArrayList<Group> createGroupList(String cId) {
		
		//metod som skapar lista över grupper för en kurs
		//just nu gör denna defaultgruppsize antal grupper och lägger dem i en lista
		//just nu går det alltså inte att skapa en grupp enskilt.
		
		for (int i = 0; i < cs.getDefaultGroupListSize(); i++) {
		Group g = new Group(cId, Integer.toString(i));
		groupList.add(g);
		}
		return groupList;
	}
	
}
