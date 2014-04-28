package projbrutus.course;

public class CourseStructure {
	
	private int defaultGroupListSize = 40;
	private int defaultExaminationListSize = 90;
	private int defaultCourseTaskListSize = 300;
	
	public CourseStructure(int defaultGroupListSize, int defaultExaminationListSize, int defaultCourseTaskListSize) {
		
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
