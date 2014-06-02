package projbrutus.login;

import java.util.Scanner;

import projbrutus.course.CourseCatalogue;
import projbrutus.course.CourseManager;
import projbrutus.person.Person;

public class Overview {
	Scanner in = new Scanner(System.in);
	CourseManager cm;
	Person p;

	public Overview(Person p, CourseCatalogue cc) {
		this.p = p;
		new CourseManager(p, cc);
	}
}
