package projbrutus.course.examination.task;

import projbrutus.course.group.Group;

public class CourseTask {
	
	private String cId;
	private String description;
	private String grade;

	public CourseTask(String cId, String description, String grade) {
		this.setcId(cId);
		this.setDescription(description);
		this.setGrade(grade);
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getcId() {
		return cId;
	}

	public void setcId(String cId) {
		this.cId = cId;
	}
	
	public String toString(){
		return description + " - " + cId + " " + grade;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	
}
