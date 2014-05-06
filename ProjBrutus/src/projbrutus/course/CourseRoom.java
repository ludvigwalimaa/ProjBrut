package projbrutus.course;

import java.util.ArrayList;

import projbrutus.course.examination.ExaminationArea;
import projbrutus.course.examination.ExaminationList;
import projbrutus.course.group.Group;
import projbrutus.course.group.GroupList;
import projbrutus.course.participant.ParticipantList;
import projbrutus.person.Person;

public class CourseRoom {
	
	private String cId;
	private String cName;
	private ArrayList<ExaminationArea> exaList;
	private ArrayList<Group> groupList;
	private ArrayList<String> participantList;
	
	public CourseRoom(String cId, String cName,ArrayList<ExaminationArea> exaList, 
			ArrayList<Group> groupList, ArrayList<String> participantList){
		this.cId = cId;
		this.cName = cName;
		this.exaList = exaList;
		this.groupList = groupList;
		this.participantList = participantList;
		
	}
	
	public CourseRoom(){
		
	}

	public String toString(){
		String s = cId + " - " + cName + "\n" + exaList.toString() + "\n" + groupList.toString() + "\n" + participantList.toString();
		return s;
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

	public ArrayList<String> getParticipantList() {
		return participantList;
	}

	public void setParticipantList(ArrayList<String> participantList) {
		this.participantList = participantList;
	}
	
	

}


	


