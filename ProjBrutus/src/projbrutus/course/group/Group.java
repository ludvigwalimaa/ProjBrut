package projbrutus.course.group;

import java.util.ArrayList;

import projbrutus.person.Person;

public class Group {

	private ArrayList<Person> group = new ArrayList<Person>();
	private String cId;
	private String gId;
	
	public Group(String cId, String gId) {
		this.setgroup(group);
		this.setcId(cId);
		this.setgId(gId);
	}
	
	public ArrayList<Person> getGroup() {
		return group;
	}
	
	public void setgroup(ArrayList<Person> group) {
		this.group = group;
	}

	public String getcId() {
		return cId;
	}

	public void setcId(String cId) {
		this.cId = cId;
	}

	public String getgId() {
		return gId;
	}

	public void setgId(String gId) {
		this.gId = gId;
	}


}
