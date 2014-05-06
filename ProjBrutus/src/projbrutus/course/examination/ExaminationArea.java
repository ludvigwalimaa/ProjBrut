package projbrutus.course.examination;

import projbrutus.course.examination.task.CourseTaskList;

public class ExaminationArea {
	
	private String cId;
	private CourseTaskList ctl;
	private String liuID;
		
	public ExaminationArea(String cId){
		this.cId = cId;
		this.ctl = new CourseTaskList(cId);
	}
	
	public CourseTaskList getCTL(){
		return ctl;
	}

	public String getLiuID() {
		return liuID;
	}

	public void setLiuID(String liuID) {
		this.liuID = liuID;
		ctl.setLiuID(liuID);
	}
	
	public String toString(){
		return cId + " - " + liuID + "\n";
	}

	
}