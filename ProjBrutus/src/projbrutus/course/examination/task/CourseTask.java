package projbrutus.course.examination.task;

import projbrutus.course.group.Group;

public class CourseTask {
	
	private String cId;
	private String description;

	public CourseTask(String cId, String description) {
		this.setcId(cId);
		this.setDescription(description);
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
		return cId + " - " + description + "\n";
	}

	
}
