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
	private ExaminationArea ea;
	private ArrayList<Group> groupList;
	private ArrayList<String> participantList;
	private String liuID;
	
	public CourseRoom(String cId, String cName, String liuID, ExaminationArea ea){
		this.cId = cId;
		this.cName = cName;
		this.setEa(ea);
//		this.groupList = groupList;
//		this.participantList = participantList;
		this.liuID = liuID;
		
	}
	
	public CourseRoom(){
		
	}

	public String toString(){
		String s = cId + " - " + cName + "\n";
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

	public ExaminationArea getEa() {
		return ea;
	}

	public void setEa(ExaminationArea ea) {
		this.ea = ea;
	}
	
	

}


	


