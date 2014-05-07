package projbrutus;

import java.util.ArrayList;
import java.util.Scanner;

import projbrutus.course.CourseList;
import projbrutus.course.CourseManager;
import projbrutus.course.CourseRoom;
import projbrutus.course.examination.task.CourseTask;
import projbrutus.person.Person;

public class Overblick {
	Scanner in = new Scanner(System.in);
	CourseList cl = new CourseList();
	CourseManager cm = new CourseManager();
	Person p;

	public Overblick(Person p) {
		this.p = p;
		createOverblick();
		chooseCourse();
	}

	private void createOverblick() {
		System.out.println("\n---- Overview -----");
		loadPersonalCourses(p);

	}

	private void loadPersonalCourses(Person p) {
		cl.populateCourseList(p); // Lägger till personens kurser i courseList
		for (int i = 0; i < cl.getCourseList().size(); i++) {
			System.out.println("* " + cl.getCourseList().get(i).toString());
		}

	}

	private void chooseCourse() {
		String chosenCourse;
		CourseRoom cr;
		System.out.print("Choice: ");
		chosenCourse = in.nextLine();
		for (int i = 0; i < cl.getCourseList().size(); i++) {
			if (chosenCourse.equals(cl.getCourseList().get(i).getcId())) {
				cr = cm.fetchCourseRoom(cl.getCourseList().get(i));
				chooseTask(cr);
				
			} else {

			}
		}
	}
	
	private void chooseTask(CourseRoom cr){
		System.out.print("Choose task: ");
		int chosenTask = in.nextInt();
		ArrayList<CourseTask> tasks = cr.getEa().getCTL().getTasks();
		
		switch(chosenTask){
		case 0: System.out.println(tasks.get(0).toString());
				manageTask(tasks.get(0));
			break;
		case 1: System.out.println(tasks.get(1).toString());
				manageTask(tasks.get(0));
			break;
		case 2: System.out.println(tasks.get(2).toString());
				manageTask(tasks.get(0));
			break;
		case 3: System.out.println(tasks.get(3).toString());
				manageTask(tasks.get(0));
			break;
		case 4: System.out.println(tasks.get(4).toString());
				manageTask(tasks.get(0));
			break;
		}
	}

	private void manageTask(CourseTask ct){
		System.out.println("------");
		System.out.println("0. Download material");
		System.out.println("1. Upload material");
		
		int chosenTask = in.nextInt();
		switch(chosenTask){
		case 0: System.out.println("Downloading material......DONE!");
		break;
		case 1: System.out.println("Uploading material......Await your grade!");
		break;
		}
		
	}
}
