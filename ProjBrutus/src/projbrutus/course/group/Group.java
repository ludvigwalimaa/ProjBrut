package projbrutus.course.group;

import java.util.ArrayList;

import projbrutus.person.Person;

public class Group {

	private ArrayList<Person> group = new ArrayList<Person>();
	private String cId;
	private int gID;
	
	public Group(String cId, int gID){
		this.cId = cId;
		this.gID = gID;
	}
	

	
	public String toString(){
		return "GroupID: " + gID + " \nMembers: " + group.toString();
	}
	
	public void addGroupMember(Person p){
		group.add(p);
	}
	
	public ArrayList<Person> getGroup() {
		return group;
	}
	
	public int getgID() {
		return gID;
	}

	public String getcId() {
		return cId;
	}

	public void setcId(String cId) {
		this.cId = cId;
	}



}
