package projbrutus.course;

import java.util.ArrayList;
import java.util.Scanner;

import projbrutus.course.examination.task.CourseTask;
import projbrutus.person.Person;
import projbrutus.person.Teacher;
import projbrutus.testing.Test;

public class CourseList {

	private Scanner in = new Scanner(System.in);
	private ArrayList<CourseRoom> courseList = new ArrayList<CourseRoom>();

	public CourseList() {

	}

	// Hämtar personens CourseRooms i allCourseRooms.
	public void populateCourseList(Person p, CourseCatalogue cc) {
		String liuID = p.getLiudID();
		for (int i = 0; i < cc.allCourseRooms.size(); i++) {
			if (liuID.equals(cc.allCourseRooms.get(i).getliuID())) {
				courseList.add(cc.allCourseRooms.get(i));
			} else {
			}
		}
	}
	
	public void printCourseList(Person p){
		for (int i = 0; i < getCourseList().size(); i++) {
			System.out.println("* " + getCourseList().get(i).toString());
		}
	}
	
	public CourseRoom chooseCourseTeacher(int choice, Person p, ArrayList<CourseRoom> allCourseRooms){
		CourseRoom cr = null;
			System.out.println("Choice (0-3): ");
			System.out.println("** Teacher chose course 0 **");
			switch (choice) {
			case 0:
				cr = allCourseRooms.get(0);
				new Test(p, allCourseRooms.get(0));
				System.out.println(allCourseRooms.get(0).toString());
				return cr;
			case 1:
				cr = allCourseRooms.get(1);
				new Test(p, allCourseRooms.get(1));
				System.out.println(allCourseRooms.get(1).toString());
				
				return cr;
			case 2:
				cr = allCourseRooms.get(2);
				new Test(p, allCourseRooms.get(2));
				System.out.println(allCourseRooms.get(2).toString());
		
				return cr;
			case 3:
				cr = allCourseRooms.get(3);
				new Test(p, allCourseRooms.get(3));
				System.out.println(allCourseRooms.get(3).toString());
				return cr;
			}
			return cr;
			
		}

	
	public CourseRoom chooseCourseStudent(String cId){
		CourseRoom cr = null;
		System.out.println("Choice('725GXX'): ");
		System.out.println("** Student chose course: " + cId + " **");
		for (int i = 0; i < getCourseList().size(); i++) {
			if (cId.equals(getCourseList().get(i).getcId())) {
				cr = getCourseList().get(i);
				return cr;

			} else {

			}
		}
		return cr;	
	}
		
		
	

	
	public ArrayList<CourseRoom> getCourseList(){
		return courseList;
	}


}
