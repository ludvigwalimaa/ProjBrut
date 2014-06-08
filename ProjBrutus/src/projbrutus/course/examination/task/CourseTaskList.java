package projbrutus.course.examination.task;

import java.util.ArrayList;

import projbrutus.course.CourseStructure;

public class CourseTaskList {
	

	private ArrayList<CourseTask> DBctList = new ArrayList<CourseTask>();
	
	private String cId;
	private String liuID;
	private int gradeSys; // 1 = VG , 2 = Number  0 = undecided
	private int ctSize;
	
	public CourseTaskList(String cId, CourseStructure cs){
		this.cId = cId;
		this.ctSize = cs.getDefaultCTLSize();
		for(int i=0; i < ctSize; i++){
			CourseTask ct = new CourseTask(this.cId, "A default description", "Handed in");
			DBctList.add(ct);
		}
	}

	public String getliuID() {
		return liuID;
	}

	public void setliuID(String liuID) {
		this.liuID = liuID;
	}
	
	public String toString(){
		return cId + " - " + liuID;
	}
	
	public ArrayList<CourseTask> getTasks(){
		return DBctList;
	}

	public int getGradeSys() {
		return gradeSys;
	}

	public void setGradeSys(int gradeSys) {
		this.gradeSys = gradeSys;
	}
	
	
	
}
