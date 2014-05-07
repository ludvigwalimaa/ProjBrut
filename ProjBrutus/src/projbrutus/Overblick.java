package projbrutus;

import java.util.Scanner;

import projbrutus.course.CourseList;
import projbrutus.course.CourseManager;
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
		System.out.print("Choice: ");
		chosenCourse = in.nextLine();
		for (int i = 0; i < cl.getCourseList().size(); i++) {
			if (chosenCourse.equals(cl.getCourseList().get(i).getcId())) {
				cm.fetchCourseRoom(cl.getCourseList().get(i));
			} else {

			}
		}
	}

}
