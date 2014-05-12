package projbrutus.login;

import java.util.Scanner;

import projbrutus.course.CourseCatalogue;
import projbrutus.course.CourseList;
import projbrutus.course.CourseManager;
import projbrutus.person.Person;
import projbrutus.person.Teacher;

public class Overblick {
	Scanner in = new Scanner(System.in);
	CourseManager cm;
	Person p;

	public Overblick(Person p, CourseCatalogue cc) {
		this.p = p;
		new CourseManager(p, cc);
	}
}
