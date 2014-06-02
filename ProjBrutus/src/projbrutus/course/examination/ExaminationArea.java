package projbrutus.course.examination;

import projbrutus.course.CourseStructure;
import projbrutus.course.examination.task.CourseTaskList;

public class ExaminationArea {
	
	private String cId;
	private CourseTaskList ctl;
	private String liuID;

		
	public ExaminationArea(String cId, CourseStructure cs){
		this.cId = cId;
		this.ctl = new CourseTaskList(cId, cs);
	}
	
	public CourseTaskList getCTL(){
		return ctl;
	}

	public String getLiuID() {
		return liuID;
	}

	public void setliuID(String liuID) {
		this.liuID = liuID;
		ctl.setliuID(liuID);
	}
	
	public String toString(){
		return cId + " - " + liuID + "\n";
	}

	
}