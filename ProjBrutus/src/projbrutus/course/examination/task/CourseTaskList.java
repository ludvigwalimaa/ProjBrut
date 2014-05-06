package projbrutus.course.examination.task;

import java.util.ArrayList;
import projbrutus.course.CourseStructure;

public class CourseTaskList {
	
	CourseStructure cs = new CourseStructure();
	ArrayList<CourseTask> courseTaskList = new ArrayList<CourseTask>();
	
	public ArrayList<CourseTask> createCourseTaskList(String cId, String eId) {
		
		//metod som skapar lista �ver grupper f�r en kurs
		
		for (int i = 0; i < cs.getDefaultCourseTaskListSize(); i++) {
		CourseTask ct = new CourseTask(cId, eId);
		courseTaskList.add(ct);
		}
		return courseTaskList;
	}

}
