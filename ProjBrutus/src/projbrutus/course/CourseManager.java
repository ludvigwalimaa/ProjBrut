package projbrutus.course;

import java.util.ArrayList;
import java.util.Scanner;

import projbrutus.FileManager;
import projbrutus.course.examination.task.CourseTask;
import projbrutus.person.Person;
import projbrutus.person.Teacher;
import projbrutus.testing.Test;


public class CourseManager {
	
	private Scanner in = new Scanner(System.in);
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
		tmpCT = tmpCR.chooseTask();

	}
	
	private void loadPersonalCourses(Person p) {
		cl.populateCourseList(p); // Lägger till personens kurser i courseList
		cl.printCourseList(p); //Skriver ut kurslistan
		chooseCourse();
		tmpCR.printCourseRoom();
		tmpCT = tmpCR.chooseTask();
		tmpCT.manageTask(p);
	}

	private void chooseCourse() {
		tmpCR = cl.chooseCourse(p, allCourseRooms);
	}
	
//	private void chooseTeacherTask(ArrayList<CourseTask> ct) {
//		System.out.print("Choice (0-4): ");
//		int choice = in.nextInt();
//		switch (choice) {
//		case 0: manageTask(ct.get(0));
//		break;
//		case 1: manageTask(ct.get(1));
//		break;
//		case 2: manageTask(ct.get(2));
//		break;
//		case 3: manageTask(ct.get(3));
//		break;
//		case 4: manageTask(ct.get(4));
//		break;
//		}
//	}

	private ArrayList<CourseTask> showTasks(CourseRoom cr){
		System.out.println("CourseTaskList: ");
		System.out.println(cr.getEa().getCTL().toString());
		System.out.println("Tasks:");
		for(int i = 0; i < cr.getEa().getCTL().getTasks().size(); i++){
			System.out.println("Task " + i + ". " + cr.getEa().getCTL().getTasks().get(i).toString());
		}
		return cr.getEa().getCTL().getTasks();
	}
	
}
