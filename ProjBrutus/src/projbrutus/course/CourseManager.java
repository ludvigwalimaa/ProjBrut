package projbrutus.course;

import java.util.ArrayList;
import java.util.Scanner;

import projbrutus.course.examination.ExaminationArea;
import projbrutus.course.examination.task.CourseTask;
import projbrutus.course.group.Group;
import projbrutus.person.Person;


public class CourseManager {
	
	Scanner in = new Scanner(System.in);
	CourseCatalogue cc = new CourseCatalogue();
	
	public CourseManager(){
		
	}
	
	public ArrayList<CourseRoom> allCourseRooms(){
		ArrayList<CourseRoom> acr = cc.getAllCourseRooms();
		return acr;
	}
	
	public String toString(){
		String s = "";
		for(int i=0; i<cc.getAllCourseRooms().size(); i++){
			s = s + i + ". " + cc.getAllCourseRooms().get(i).toString();
		}
		return s;
	}
	
	
	public CourseRoom fetchCourseRoom(CourseRoom cr) {
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
		return cr;
		
		
	}
	
	public ArrayList<CourseTask> showTasks(CourseRoom cr){
		System.out.println("CourseTaskList: ");
		System.out.println(cr.getEa().getCTL().toString());
		System.out.println("Tasks:");
		for(int i = 0; i < cr.getEa().getCTL().getTasks().size(); i++){
			System.out.println("Task " + i + ". " + cr.getEa().getCTL().getTasks().get(i).toString());
		}
		return cr.getEa().getCTL().getTasks();
	}
	
}
