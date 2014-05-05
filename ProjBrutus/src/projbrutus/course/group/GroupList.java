package projbrutus.course.group;

import java.util.ArrayList;
import projbrutus.course.CourseStructure;

public class GroupList {

	private ArrayList<Group> groupList = new ArrayList<Group>();
	private CourseStructure cs = new CourseStructure();
	
	public GroupList(){
		
	}
	
	public ArrayList<Group> getGroupList(String cId) {
		
		//sql anrop till table �ver gruppID samt kursID f�r att
		//h�mta alla grupper som tillh�r en kurs
		return groupList;
	}
	
	public ArrayList<Group> createGroupList(String cId) {
		
		//metod som skapar lista �ver grupper f�r en kurs
		
		for (int i = 0; i < cs.getDefaultGroupListSize(); i++) {
		Group g = new Group(cId, Integer.toString(i));
		groupList.add(g);
		}
		return groupList;
	}
	
}
