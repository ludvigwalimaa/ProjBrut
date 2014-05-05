package projbrutus.course.group;

import java.util.ArrayList;

import projbrutus.person.Person;

public class Group {

	private ArrayList<Person> group = new ArrayList<Person>();
	private String cId;
	
	public Group(ArrayList<Person> pList, String cId) {
		this.group = pList;
	}
	
	public ArrayList<Person> getGroup() {
		return group;
	}

	public String getcId() {
		return cId;
	}

	public void setcId(String cId) {
		this.cId = cId;
	}


}
