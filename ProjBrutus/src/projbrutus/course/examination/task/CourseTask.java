package projbrutus.course.examination.task;

import projbrutus.course.group.Group;

public class CourseTask {
	
	private String cId;
	private String eId;
	private String task;
	private Group group;
	private String grade;
	private String description;

	public CourseTask(String cId, String eId) {
		this.setTask(task);
		this.setGroup(group);
		this.setGrade(grade);
		this.setDescription(description);
		this.setcId(cId);
		this.seteId(eId);
	}

	public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task;
	}

	public Group getGroup() {
		return group;
	}

	public void setGroup(Group group) {
		this.group = group;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
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

	public String geteId() {
		return eId;
	}

	public void seteId(String eId) {
		this.eId = eId;
	}
	
}
