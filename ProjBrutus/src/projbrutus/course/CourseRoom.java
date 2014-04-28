package projbrutus.course;

import java.util.ArrayList;

import projbrutus.course.examination.ExaminationArea;
import projbrutus.course.group.Group;
import projbrutus.person.Person;

public class CourseRoom {
	
	private String cId;
	private String cName;
	private ArrayList<ExaminationArea> exaList;
	private ArrayList<Group> groupList;
	private ArrayList<Person> participantList;
	private CourseStructure cStructure;
	
	public void createCourseRoom(String cId, String cName,ArrayList<ExaminationArea> exaList, 
			ArrayList<Group> groupList, ArrayList<Person> participantList, CourseStructure cStructure) {
		
	}

	public String getcId() {
		return cId;
	}

	public void setcId(String cId) {
		this.cId = cId;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public ArrayList<ExaminationArea> getExaList() {
		return exaList;
	}

	public void setExaList(ArrayList<ExaminationArea> exaList) {
		this.exaList = exaList;
	}

	public ArrayList<Group> getGroupList() {
		return groupList;
	}

	public void setGroupList(ArrayList<Group> groupList) {
		this.groupList = groupList;
	}

	public ArrayList<Person> getParticipantList() {
		return participantList;
	}

	public void setParticipantList(ArrayList<Person> participantList) {
		this.participantList = participantList;
	}

	public CourseStructure getcStructure() {
		return cStructure;
	}

	public void setcStructure(CourseStructure cStructure) {
		this.cStructure = cStructure;
	}

	

}
