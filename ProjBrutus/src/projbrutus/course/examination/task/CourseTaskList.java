package projbrutus.course.examination.task;

import java.util.ArrayList;

import projbrutus.person.Person;

public class CourseTaskList {
	

	private ArrayList<CourseTask> courseTaskList = new ArrayList<CourseTask>();
	
	private String cId;
	private int gID;
	private int gradeSys; // 1 = VG , 2 = Number  0 = undecided
	
	public CourseTaskList(String cId, int courseTaskSize){
		this.cId = cId;
		for(int i=0; i < courseTaskSize; i++){
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

	public int getGradeSys() {
		return gradeSys;
	}

	public void setGradeSys(int gradeSys) {
		this.gradeSys = gradeSys;
	}
	
	
	
}
