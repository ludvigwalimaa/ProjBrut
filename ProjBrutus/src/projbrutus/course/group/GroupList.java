package projbrutus.course.group;

import java.util.ArrayList;

import projbrutus.course.CourseStructure;
import projbrutus.course.examination.ExaminationArea;

public class GroupList {

	private ArrayList<Group> DBgroupList = new ArrayList<Group>();
	
	private CourseStructure cs = new CourseStructure();
	private String cId;
	
	public GroupList(String cId){

	}
	
	public void populateDBgroupList() {
		cs = new CourseStructure();
		for(int i = 0; i< cs.getDefaultGroupListSize() ;i++){
			getDBgroupList().add(new Group(this.cId, i));
			
		}
		
	}

	public ArrayList<Group> getDBgroupList() {
		return DBgroupList;
	}

	public void setDBgroupList(ArrayList<Group> dBgroupList) {
		DBgroupList = dBgroupList;
	}
	
	
	
}
