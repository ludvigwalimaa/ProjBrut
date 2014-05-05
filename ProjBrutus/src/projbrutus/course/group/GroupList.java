package projbrutus.course.group;

import java.util.ArrayList;
import projbrutus.course.CourseStructure;

public class GroupList {

	ArrayList<Group> groupList = new ArrayList<Group>();
	CourseStructure cs = new CourseStructure();
	
	public ArrayList<Group> getGroupList(String cId) {
		
		//sql anrop till table över gruppID samt kursID för att
		//hämta alla grupper som tillhör en kurs
	
		return groupList;
	}
	
	public ArrayList<Group> createGroupList(String cId) {
		
		//metod som skapar lista över grupper för en kurs
		
		for (int i = 0; i < cs.getDefaultGroupListSize(); i++) {
		Group g = new Group(cId, Integer.toString(i));
		groupList.add(g);
		}
		return groupList;
	}
	
}
