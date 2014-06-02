package projbrutus.course.group;

import java.util.ArrayList;

import projbrutus.course.CourseStructure;
import projbrutus.course.examination.ExaminationArea;

public class GroupList {

	private ArrayList<Group> DBgroupList = new ArrayList<Group>();
	

	private String cId;
	private int GLsize;
	
	public GroupList(String cId, CourseStructure cs){
		this.cId = cId;
		this.GLsize = cs.getDefaultGLSize();
	}
	
	public void populateDBgroupList() {
		for(int i = 0; i< GLsize ;i++){
			Group g = new Group(this.cId, i); //
			DBgroupList.add(g);
		}
		
	}

	public ArrayList<Group> getDBgroupList() {
		return DBgroupList;
	}

	public void setDBgroupList(ArrayList<Group> dBgroupList) {
		DBgroupList = dBgroupList;
	}
	
	
	
}
