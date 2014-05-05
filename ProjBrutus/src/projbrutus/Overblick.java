package projbrutus;

import java.util.Scanner;
import projbrutus.course.CourseList;

import projbrutus.person.Person;

public class Overblick {
	Scanner in = new Scanner(System.in);
	CourseList cl = new CourseList();
	Person p;
	int amountCourses;
	
	public Overblick(Person p){
		this.p = p;
		createOverblick();
	}
	
	private void createOverblick(){
		System.out.println("\n---- Overview -----");
		loadCourses(p);
		chooseCourse();
	}
	
	private void loadCourses(Person p){
		cl.populateCourseList(p); // Lägger till personens kurser i Courselistr (hårdkodat)
		amountCourses = 0;
		for(int i = 0; i<cl.getList().size(); i++){
			System.out.println("* " + cl.getList().get(i).toString());
		}
		
	}
	
	private void chooseCourse(){
		String chosenCourse;
		System.out.print("Choice: ");
		chosenCourse = in.nextLine();
		for(int i = 0; i<cl.getList().size(); i++){
			if(chosenCourse.equals(cl.getList().get(i).toString())){
				System.out.println("Du valde kursen " + chosenCourse);
			}
			else{
				
			}
		}
	}

}
		
	

