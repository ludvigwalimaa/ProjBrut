package projbrutus.course;

import java.util.ArrayList;

import projbrutus.person.Person;

public class CourseList {
	
	ArrayList<String> courseList = new ArrayList<String>();
	
	public ArrayList<String> getCourseList (Person p) {
		
		//Metod som hämtar lista över alla kurser för inskickad person
		//löses med samma table som används för hämtning av deltagare i en kurs
		
		if(p.getLiudID().equals("gabol892")) {
		courseList.add("725G51");
		courseList.add("725G54");
		courseList.add("725G56");
		courseList.add("725G44");
		} else if(p.getLiudID().equals("filbr616")) {
		courseList.add("725G41");
		courseList.add("725G64");
		courseList.add("725G26");
		courseList.add("725G74");
		} else if (p.getLiudID().equals("ludwa930")){
		courseList.add("725G51");
		courseList.add("725G34");
		courseList.add("725G26");
		courseList.add("725G64");
		} else if(p.getLiudID().equals("anka101")) {
		courseList.add("725G51");
		courseList.add("725G24");
		courseList.add("725G66");
		courseList.add("725G74");
		} else {
			courseList.add("null");
		}
		
		
		return courseList;
	}
	
}
