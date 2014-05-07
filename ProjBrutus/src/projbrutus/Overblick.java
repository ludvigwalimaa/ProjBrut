package projbrutus;

import java.util.Scanner;

import projbrutus.course.CourseList;
import projbrutus.course.CourseManager;
import projbrutus.person.Person;
import projbrutus.person.Teacher;

public class Overblick {
	Scanner in = new Scanner(System.in);
	CourseList cl = new CourseList();
	CourseManager cm;
	Person p;

	public Overblick(Person p) {
		this.p = p;
		cm =  new CourseManager(p);
		createOverblick();
		if (p.getClass() == Teacher.class) {

		} else {
			cm.chooseCourse();
		}

	}

	private void createOverblick() {

		if (p.getClass() == Teacher.class) {
			System.out.println("\n---- Teacher Overview -----");
			cm.loadTeacherCourses(p);
		} else {
			System.out.println("\n---- Student Overview -----");
			cm.loadPersonalCourses(p);
		}

	}
}
