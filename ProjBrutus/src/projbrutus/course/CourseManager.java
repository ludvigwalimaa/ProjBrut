package projbrutus.course;

import java.util.ArrayList;
import java.util.Scanner;

import projbrutus.FileManager;
import projbrutus.course.examination.task.CourseTask;
import projbrutus.course.examination.task.CourseTaskList;
import projbrutus.person.Person;
import projbrutus.person.Teacher;
import projbrutus.testing.Test;


public class CourseManager {
	
	private CourseCatalogue cc;
	private CourseList cl = new CourseList();
	private Person p;
	private ArrayList<CourseRoom> allCourseRooms;
	private CourseRoom tmpCR;
	private CourseTask tmpCT;


	
	public CourseManager(){
		
	}
	public CourseManager(Person p, CourseCatalogue cc){
		this.p = p;
		this.cc = cc;
		this.allCourseRooms = cc.getAllCourseRooms();
		checkPerson(p);
	}
		
	private void checkPerson(Person p) {
		if (p.getClass() == Teacher.class) {
			System.out.println("\n---- Teacher Overview -----");
			loadTeacherCourses(p);
		} else {
			System.out.println("\n---- Student Overview -----");
			loadPersonalCourses(p);
		}
	}
	
	private void loadTeacherCourses(Person p) {
		cc.printCourseRooms();
		chooseCourse();
		tmpCR.showTasks();
		tmpCT = tmpCT.chooseTask(p, tmpCR);	
		tmpCT.manageTask(p);
		tmpCR.showTasks();
	}
	
	private void loadPersonalCourses(Person p) {
		cl.populateCourseList(p); // Lägger till personens kurser i courseList
		cl.printCourseList(p); //Skriver ut kurslistan
		chooseCourse();
		tmpCR.printCourseRoom();
		tmpCT = new CourseTask();
		tmpCT = tmpCT.chooseTask(p, tmpCR);
		tmpCT.manageTask(p);
		
	}

	private void chooseCourse() {
		tmpCR = cl.chooseCourse(p, allCourseRooms);
	}
	


}
