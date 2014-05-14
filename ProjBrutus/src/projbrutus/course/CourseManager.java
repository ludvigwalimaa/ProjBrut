package projbrutus.course;

import java.util.ArrayList;
import projbrutus.course.examination.task.CourseTask;
import projbrutus.person.Person;
import projbrutus.person.Teacher;


public class CourseManager {
	
	private CourseCatalogue cc;
	private CourseList cl;
	private Person p;
	private ArrayList<CourseRoom> allCourseRooms;
	private CourseRoom tmpCR;
	private CourseTask tmpCT;

	//jag �r en kommentar
	
	public CourseManager(){
		
	}
	public CourseManager(Person p, CourseCatalogue cc){
		this.p = p;
		this.cc = cc;
		getAllCourseRooms();
		checkPerson(p);
	}
	
	private void getAllCourseRooms(){
		this.allCourseRooms = cc.getAllCourseRooms();
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
		tmpCT = new CourseTask();
		tmpCT = tmpCT.chooseTask(p, tmpCR);	
		manageTask(tmpCT, p);
		tmpCR.showTasks();
	}
	
	private void loadPersonalCourses(Person p) {
		cl = new CourseList();
		cl.populateCourseList(p, cc); // Lägger till personens kurser i courseList
		cl.printCourseList(p); //Skriver ut kurslistan
		chooseCourse();
		tmpCR.printCourseRoom();
		tmpCT = new CourseTask();
		tmpCT = tmpCT.chooseTask(p, tmpCR);
		manageTask(tmpCT, p);
		
	}
	
	private void manageTask(CourseTask ct, Person p){
		ct.manageTask(p);
		
	}

	private void chooseCourse() {
		tmpCR = cl.chooseCourse(p, allCourseRooms);
	}
	


}
