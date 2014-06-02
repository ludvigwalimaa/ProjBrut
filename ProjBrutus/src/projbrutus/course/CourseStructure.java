package projbrutus.course;

public class CourseStructure {
	
	private int defaultGroupListSize = 30;
	private int defaultExaminationAreaSize = 30;
	private int defaultCourseTaskListSize = 5;
	
	public CourseStructure() {
		
	}

	public int getDefaultGLSize() {
		return defaultGroupListSize;
	}

	public void setDefaultGroupListSize(int defaultGroupListSize) {
		this.defaultGroupListSize = defaultGroupListSize;
	}


	public int getDefaultCTLSize() {
		return defaultCourseTaskListSize;
	}

	public void setDefaultCourseTaskListSize(int defaultCourseTaskListSize) {
		this.defaultCourseTaskListSize = defaultCourseTaskListSize;
	}

	public int getDefaultExaAreaSize() {
		return defaultExaminationAreaSize;
	}

	public void setDefaultExaminationAreaSize(int defaultExaminationAreaSize) {
		this.defaultExaminationAreaSize = defaultExaminationAreaSize;
	}

}
