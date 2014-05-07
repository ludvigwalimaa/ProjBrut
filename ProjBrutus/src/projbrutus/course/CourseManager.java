package projbrutus.course;

import java.util.ArrayList;
import java.util.Scanner;

import projbrutus.course.examination.ExaminationArea;
import projbrutus.course.group.Group;
import projbrutus.person.Person;


public class CourseManager {
	
	Scanner in = new Scanner(System.in);
	
	public CourseManager(){
		
	}
	
	
	public void fetchCourseRoom(CourseRoom cr) {
		System.out.println("CourseRoom:" + cr.toString());

		System.out.println("ExaminationsLista:");
		System.out.println("ExaminationsArea: " + cr.getEa().toString());
		
		System.out.println("GroupList:");
		System.out.println(cr.getGroup());
		
		System.out.println("CourseTaskList: ");
		System.out.println(cr.getEa().getCTL().toString());
		System.out.println("Tasks:");
		for(int i = 0; i < cr.getEa().getCTL().getTasks().size(); i++){
			System.out.println("Task " + i + ". " + cr.getEa().getCTL().getTasks().get(i).toString());
		}
		
		
	}
	
}
