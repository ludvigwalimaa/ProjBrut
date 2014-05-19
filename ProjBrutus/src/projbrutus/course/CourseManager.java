package projbrutus.course;

import java.util.ArrayList;
import java.util.Scanner;

import projbrutus.course.examination.task.CourseTask;
import projbrutus.course.examination.task.CourseTaskList;
import projbrutus.person.Person;
import projbrutus.person.Teacher;


public class CourseManager {
	private Scanner in = new Scanner(System.in);
	
	private CourseCatalogue cc;
	private CourseList cl = new CourseList();
	private Person p;
	private ArrayList<CourseRoom> allCourseRooms;
	private CourseRoom tmpCR;
	private CourseTask tmpCT;
	private CourseTaskList tmpCTL;

	
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
		
		boolean loopGrading = true;
		while (loopGrading) {
		tmpCR.setGradeSys();
		tmpCR.showTasks();
		tmpCT = new CourseTask();
		tmpCT = tmpCT.chooseTask(p, tmpCR);	
		manageTask(tmpCT, p);

		tmpCR.showTasks();
		if(tmpCR.gradesLeft()){
		System.out.println("\nPress 0 to grade another task, 1 to finish");
		System.out.print("Choice: ");
		
		int moreGrade = in.nextInt();
		switch (moreGrade) {
		case 0:
			break;
		case 1:
			loopGrading = false;
			break;
		}}else{
			loopGrading = false;
			System.out.println("Grading Done!");
			tmpCR.calcGrade();
		}
		
		}
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
		System.out.println("GradeSys : " + tmpCTL.getGradeSys());
		ct.manageTask(p, tmpCTL.getGradeSys());
		
	}

	private void chooseCourse() {
		tmpCR = cl.chooseCourse(p, allCourseRooms);
		tmpCTL = tmpCR.getEa().getCTL();
	}
	


}
