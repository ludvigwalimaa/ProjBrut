package projbrutus.course.examination;

import projbrutus.course.examination.task.CourseTaskList;

public class ExaminationArea {
	
	private String cId;
	private CourseTaskList ctl;
	private int gID;

		
	public ExaminationArea(String cId, int courseTaskSize){
		this.cId = cId;
		this.ctl = new CourseTaskList(cId, courseTaskSize);
	}
	
	public CourseTaskList getCTL(){
		return ctl;
	}

	public int getLiuID() {
		return gID;
	}

	public void setGroupID(int gID) {
		this.gID = gID;
		ctl.setGroupID(gID);
	}
	
	public String toString(){
		return cId + " - " + gID + "\n";
	}

	
}