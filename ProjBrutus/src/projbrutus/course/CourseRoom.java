package projbrutus.course;

import java.util.ArrayList;
import java.util.Scanner;

import projbrutus.course.examination.ExaminationArea;
import projbrutus.course.examination.ExaminationList;
import projbrutus.course.examination.task.CourseTask;
import projbrutus.course.group.Group;
import projbrutus.course.group.GroupList;
import projbrutus.person.Person;
import projbrutus.person.Teacher;

public class CourseRoom {
	private Scanner in = new Scanner(System.in);
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
		String s = cId + " - " + cName + "\t| " + liuID + "\n";
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
	
	public void printCourseRoom() {
		System.out.println("CourseRoom:" + toString());

		System.out.println("ExaminationsLista:");
		System.out.println("ExaminationsArea: " + getEa().toString());
		
		System.out.println("GroupList:");
		System.out.println(getGroup());
		
		System.out.println("CourseTaskList: ");
		System.out.println(getEa().getCTL().toString());
		System.out.println("Tasks:");
		for(int i = 0; i < getEa().getCTL().getTasks().size(); i++){
			System.out.println("Task " + i + ". " + getEa().getCTL().getTasks().get(i).toString());
		}

	}
	
	public ArrayList<CourseTask> showTasks(){
		System.out.println("CourseTaskList: ");
		System.out.println(getEa().getCTL().toString());
		System.out.println("Tasks:");
		for(int i = 0; i < getEa().getCTL().getTasks().size(); i++){
			System.out.println("Task " + i + ". " + getEa().getCTL().getTasks().get(i).toString());
		}
		return getEa().getCTL().getTasks();
	}
	

	

}


	


