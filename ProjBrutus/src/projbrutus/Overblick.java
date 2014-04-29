package projbrutus;

import java.util.Scanner;
import projbrutus.course.CourseList;

import projbrutus.person.Person;

public class Overblick {
	Scanner in = new Scanner(System.in);
	CourseList cl = new CourseList();
	Person p;
	
	public Overblick(Person p){
		this.p = p;
		System.out.println(p.getLiudID());
		createOverblick();
	}
	
	private void createOverblick(){
		System.out.println("---- Overview -----");
		System.out.println("1. My courses ");
		System.out.println("2. Settings ");
		
		String svar = in.nextLine();
		if (svar.equals("1")) {
			System.out.println(cl.getCourseList(p).toString());
		}
		
		
	}

}