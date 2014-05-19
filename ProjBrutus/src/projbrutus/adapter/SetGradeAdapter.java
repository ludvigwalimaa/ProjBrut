package projbrutus.adapter;

import projbrutus.course.examination.task.CourseTaskList;
import projbrutus.person.Person;


public interface SetGradeAdapter {
	
	
//	void countGrade(CourseTaskList ctl);
//	
//	void calcGrade();
//	
//	int getGrade();
	
	void postGrade(CourseTaskList ctl, String liuID);
}


