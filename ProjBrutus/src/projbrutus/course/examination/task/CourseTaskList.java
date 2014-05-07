package projbrutus.course.examination.task;

import java.util.ArrayList;
import projbrutus.course.CourseStructure;

public class CourseTaskList {
	
	private CourseStructure cs = new CourseStructure();
	private ArrayList<CourseTask> courseTaskList = new ArrayList<CourseTask>();
	
	private String cId, liuID;
	private int gID;
	
	public CourseTaskList(String cId){
		this.cId = cId;
		for(int i=0; i < cs.getDefaultCourseTaskListSize(); i++){
			courseTaskList.add(new CourseTask(this.cId, "A default description", "awaiting review"));
		}
	}

	public int getGroupID() {
		return gID;
	}

	public void setGroupID(int gID) {
		this.gID = gID;
	}
	
	public String toString(){
		return cId + " - " + gID;
	}
	
	public ArrayList<CourseTask> getTasks(){
		return courseTaskList;
	}
	
}
