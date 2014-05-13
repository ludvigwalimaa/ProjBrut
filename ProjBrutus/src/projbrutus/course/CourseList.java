package projbrutus.course;

import java.util.ArrayList;
import java.util.Scanner;

import projbrutus.person.Person;

public class CourseList {

	private Scanner in = new Scanner(System.in);
	private ArrayList<CourseRoom> courseList = new ArrayList<CourseRoom>();

	public CourseList() {

	}

	// Hämtar personens CourseRooms i allCourseRooms.
	public void populateCourseList(Person p) {
		String liuID = p.getLiudID();
		CourseCatalogue cc = new CourseCatalogue();
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
	
	public CourseRoom chooseCourse(Person p){
		String chosenCourse;
		System.out.print("Choice('725GXX'): ");
		chosenCourse = in.nextLine();
		CourseRoom cr = null;
		for (int i = 0; i < getCourseList().size(); i++) {
			if (chosenCourse.equals(getCourseList().get(i).getcId())) {
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
