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
	private Group g;
	private ArrayList<String> participantList;
	private String liuID;
	
	public CourseRoom(String cId, String cName, String liuID, ExaminationArea ea, Group g){
		this.cId = cId;
		this.cName = cName;
		this.setEa(ea);
		this.g = g;
//		this.participantList = participantList;
		this.liuID = liuID;
		
	}
	
	public CourseRoom(){
		
	}

	public String toString(){
		String s = cId + " - " + cName + " - " + liuID + ea.toString() + " " + g.toString() +  "\n";
		return s;
	}
	public String getGroup(){
		return g.toString();
	}
	
	public String getliuID(){
		return liuID;
	}
	
	public String getcId() {
		return cId;
	}

	public String getcName() {
		return cName;
	}

	public ArrayList<String> getParticipantList() {
		return participantList;
	}

	public ExaminationArea getEa() {
		return ea;
	}

	public void setEa(ExaminationArea ea) {
		this.ea = ea;
	}




	
	

}


	


