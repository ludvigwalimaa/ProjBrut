package projbrutus;

import java.util.ArrayList;
import java.util.Scanner;

import projbrutus.course.CourseList;
import projbrutus.course.CourseManager;
import projbrutus.course.CourseRoom;
import projbrutus.course.examination.task.CourseTask;
import projbrutus.person.Person;
import projbrutus.person.Teacher;
import projbrutus.testing.Test;

public class Overblick {
	Scanner in = new Scanner(System.in);
	CourseList cl = new CourseList();
	CourseManager cm = new CourseManager();
	Person p;

	public Overblick(Person p) {
		this.p = p;
		
		createOverblick();
		if (p.getClass() == Teacher.class) {

		} else {
			chooseCourse();
		}

	}

	private void createOverblick() {

		if (p.getClass() == Teacher.class) {
			System.out.println("\n---- Teacher Overview -----");
			loadTeacherCourses(p);
			loadTeacherCourses(p);
		} else {
			System.out.println("\n---- Student Overview -----");
			loadPersonalCourses(p);
		}

	}

	private void loadTeacherCourses(Person p) {
		System.out.println(cm.toString());
		chooseTeacherCourse();

	}

	private void chooseTeacherCourse() {
		System.out.print("Choice (0-3): ");
		ArrayList<CourseTask> ct;
		int choice = in.nextInt();
		switch (choice) {
		case 0:
			cm.allCourseRooms().get(0);
			Test t = new Test(p, cm.allCourseRooms().get(0));
			System.out.println(cm.allCourseRooms().get(0).toString());
			ct = cm.showTasks(cm.allCourseRooms().get(0));
			chooseTeacherTask(ct);
			break;
		case 1:
			cm.allCourseRooms().get(1);
			System.out.println(cm.allCourseRooms().get(1).toString());
			ct = cm.showTasks(cm.allCourseRooms().get(1));
			chooseTeacherTask(ct);
			break;
		case 2:
			cm.allCourseRooms().get(3);
			System.out.println(cm.allCourseRooms().get(2).toString());
			ct = cm.showTasks(cm.allCourseRooms().get(2));
			chooseTeacherTask(ct);
			break;
		case 3:
			cm.allCourseRooms().get(3);
			System.out.println(cm.allCourseRooms().get(3).toString());
			ct = cm.showTasks(cm.allCourseRooms().get(3));
			chooseTeacherTask(ct);
			break;
		}
	}

	private void chooseTeacherTask(ArrayList<CourseTask> ct) {
		System.out.print("Choice (0-4): ");
		int choice = in.nextInt();
		switch (choice) {
		case 0: manageTask(ct.get(0));
		break;
		case 1: manageTask(ct.get(1));
		break;
		case 2: manageTask(ct.get(2));
		break;
		case 3: manageTask(ct.get(3));
		break;
		case 4: manageTask(ct.get(4));
		break;
		}
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
		System.out.print("Choice('725GXX'): ");
		chosenCourse = in.nextLine();
		for (int i = 0; i < cl.getCourseList().size(); i++) {
			if (chosenCourse.equals(cl.getCourseList().get(i).getcId())) {
				cr = cm.fetchCourseRoom(cl.getCourseList().get(i));
				chooseTask(cr);

			} else {

			}
		}
	}

	private void chooseTask(CourseRoom cr) {

		System.out.print("Choose task (0-4): ");
		int chosenTask = in.nextInt();
		ArrayList<CourseTask> tasks = cr.getEa().getCTL().getTasks();
		
		if ((chosenTask <= tasks.size()) && (chosenTask > -1 )) {
			
			System.out.println(tasks.get(chosenTask).toString());
			manageTask(tasks.get(chosenTask));
		} else {
			System.out.println("choice does not exist..");
		}
/*
		switch (chosenTask) {
		case 0:
			System.out.println(tasks.get(0).toString());
			manageTask(tasks.get(0));
			break;
		case 1:
			System.out.println(tasks.get(1).toString());
			manageTask(tasks.get(0));
			break;
		case 2:
			System.out.println(tasks.get(2).toString());
			manageTask(tasks.get(0));
			break;
		case 3:
			System.out.println(tasks.get(3).toString());
			manageTask(tasks.get(0));
			break;
		case 4:
			System.out.println(tasks.get(4).toString());
			manageTask(tasks.get(0));
			break;
			}
			*/
		
	}

	private void manageTask(CourseTask ct) {
		if(p.getClass() == Teacher.class){
			System.out.println("-----");
			System.out.println("0. Set grade 'U' ");
			System.out.println("1. Set grade 'K' ");
			System.out.println("2. Set grade 'G' ");
			System.out.println("3. Set grade 'VG' ");
			
			System.out.print("Choice (0-3):");
			int chosenTask = in.nextInt();
			switch (chosenTask) {
			case 0:
				System.out.println("Grade set to U!");
				ct.setGrade("U");
				break;
			case 1:
				System.out.println("Grade set to K!");
				ct.setGrade("K");
				break;
			case 2:
				System.out.println("Grade set to G!");
				ct.setGrade("G");
				break;
			case 3:
				System.out.println("Grade set to VG!");
				ct.setGrade("VG");
				break;
			}
			
			
		}else{
			
		FileManager fm = new FileManager();
		
		System.out.println("------");
		System.out.println("0. Download material");
		System.out.println("1. Upload material");
		System.out.print("Choice: (0-1) ");
		int chosenTask = in.nextInt();
		switch (chosenTask) {
		case 0:
			fm.download();
			break;
		case 1:
			fm.upload();
			break;
		}
	}
	}

}
