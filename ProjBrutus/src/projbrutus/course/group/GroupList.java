package projbrutus.course.group;

import java.util.ArrayList;
import projbrutus.course.CourseStructure;

public class GroupList {

	ArrayList<Group> groupList = new ArrayList<Group>();
	CourseStructure cs = new CourseStructure();
	
	public ArrayList<Group> getGroupList(String cId) {
		
		//sql anrop till table �ver gruppID samt kursID f�r att
		//h�mta alla grupper som tillh�r en kurs
	
		return groupList;
	}
	
	public ArrayList<Group> createGroupList(String cId) {
		
		//metod som skapar lista �ver grupper f�r en kurs
		
		for (int i = 0; i < cs.getDefaultGroupListSize(); i++) {
		Group g = null;
		groupList.add(g);
		}
		return groupList;
	}
	
}
