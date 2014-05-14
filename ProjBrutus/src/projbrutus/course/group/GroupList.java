package projbrutus.course.group;

import java.util.ArrayList;

import projbrutus.course.CourseStructure;
import projbrutus.course.examination.ExaminationArea;

public class GroupList {

	private ArrayList<Group> DBgroupList = new ArrayList<Group>();
	

	private String cId;
	private int GLsize;
	
	public GroupList(String cId, int GLsize){
		this.cId = cId;
		this.GLsize = GLsize;
	}
	
	public void populateDBgroupList() {
		for(int i = 0; i< GLsize ;i++){
			getDBgroupList().add(new Group(this.cId, i));
			System.out.println(i);
		}
		
	}

	public ArrayList<Group> getDBgroupList() {
		return DBgroupList;
	}

	public void setDBgroupList(ArrayList<Group> dBgroupList) {
		DBgroupList = dBgroupList;
	}
	
	
	
}
