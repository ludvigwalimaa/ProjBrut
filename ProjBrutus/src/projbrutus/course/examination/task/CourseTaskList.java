package projbrutus.course.examination.task;

import java.util.ArrayList;
import projbrutus.course.CourseStructure;

public class CourseTaskList {
	
	private CourseStructure cs = new CourseStructure();
	private ArrayList<CourseTask> courseTaskList = new ArrayList<CourseTask>();
	
	private String cId, liuID;
	
	public CourseTaskList(String cId){
		this.cId = cId;
		for(int i=0; i < cs.getDefaultCourseTaskListSize(); i++){
			courseTaskList.add(new CourseTask(this.cId, "A default description"));
		}
	}

	public String getLiuID() {
		return liuID;
	}

	public void setLiuID(String liuID) {
		this.liuID = liuID;
	}
	
	public String toString(){
		return cId + " - " + liuID;
	}
	
	public ArrayList<CourseTask> getTasks(){
		return courseTaskList;
	}
	
}
