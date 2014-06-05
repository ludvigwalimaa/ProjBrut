package projbrutus.course;

public class CourseStructure {
	
	private int defaultExaminationAreaSize = 30;
	private int defaultCourseTaskListSize = 5;
	
	public CourseStructure() {
		
	}

	public int getDefaultCTLSize() {
		return defaultCourseTaskListSize;
	}

	public void setDefaultCTLSize(int defaultCourseTaskListSize) {
		this.defaultCourseTaskListSize = defaultCourseTaskListSize;
	}

	public int getDefaultExaAreaSize() {
		return defaultExaminationAreaSize;
	}

	public void setDefaultExaAreaSize(int defaultExaminationAreaSize) {
		this.defaultExaminationAreaSize = defaultExaminationAreaSize;
	}

}
