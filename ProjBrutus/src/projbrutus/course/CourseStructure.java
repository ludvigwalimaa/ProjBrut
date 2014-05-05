package projbrutus.course;

public class CourseStructure {
	
	private int defaultGroupListSize = 30;
	private int defaultExaminationListSize = 1;
	private int defaultCourseTaskListSize = 5;
	
	public CourseStructure() {
		
	}

	public int getDefaultGroupListSize() {
		return defaultGroupListSize;
	}

	public void setDefaultGroupListSize(int defaultGroupListSize) {
		this.defaultGroupListSize = defaultGroupListSize;
	}

	public int getDefaultExaminationListSize() {
		return defaultExaminationListSize;
	}

	public void setDefaultExaminationListSize(int defaultExaminationListSize) {
		this.defaultExaminationListSize = defaultExaminationListSize;
	}

	public int getDefaultCourseTaskListSize() {
		return defaultCourseTaskListSize;
	}

	public void setDefaultCourseTaskListSize(int defaultCourseTaskListSize) {
		this.defaultCourseTaskListSize = defaultCourseTaskListSize;
	}

}
