package projbrutus.course.examination;

import projbrutus.course.examination.task.CourseTaskList;

public class ExaminationArea {
	
	private String cId;
	private CourseTaskList ctl;
	
	public ExaminationArea(String cId){
		this.cId = cId;
		ctl = new CourseTaskList();
	}
	
	public CourseTaskList getCTL(){
		return ctl;
	}

	
}