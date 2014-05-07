package projbrutus.course;

import java.util.ArrayList;

import projbrutus.person.Person;

public class CourseList {

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
	
	public ArrayList<CourseRoom> getCourseList(){
		return courseList;
	}
}
