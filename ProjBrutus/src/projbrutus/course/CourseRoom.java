package projbrutus.course;

import java.util.ArrayList;
import java.util.Scanner;

import projbrutus.course.examination.ExaminationArea;
import projbrutus.course.examination.ExaminationList;
import projbrutus.course.examination.task.CourseTask;
import projbrutus.course.examination.task.CourseTaskList;
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
	
	

	public boolean gradesLeft() {
		ArrayList<CourseTask> ctl = ea.getCTL().getTasks();
		for(int i= 0; i < ctl.size(); i++){
			if(ctl.get(i).getGrade().equals("awaiting review")){
				return true;
			}
		}
		return false;
	}
	
	public void setAllVGGrades(){
		ArrayList<CourseTask> ctl = ea.getCTL().getTasks();
		for(int i= 0; i < ctl.size(); i++){
			ctl.get(i).setGrade("G");
		}
	}
	
	public void setAllNumberGrades(){
		ArrayList<CourseTask> ctl = ea.getCTL().getTasks();
		for(int i= 0; i < ctl.size(); i++){
			ctl.get(i).setGrade("3");
		}
	}

	public void calcGrade() {
		CourseTaskList ctl = ea.getCTL();
		if(ctl.getGradeSys() == 1){
			System.out.println("Här ska det skickas till 'VGGrades.class' och räknas ut ");
		}else{
			System.out.println("Här ska det skickas till 'NumberGrades.class' och räknas ut ");
		}
		
	}
	
	public void setGradeSys(){
		CourseTaskList ctl = ea.getCTL();
		if(ctl.getGradeSys() == 0){
			System.out.println("Is this a VG-system or a Number-system?");
			System.out.println("1. VG-system");
			System.out.println("2. Number-system");
			int choice = 0;
			System.out.print("Choice: ");
			choice = in.nextInt();
			switch(choice){
			case 1: ctl.setGradeSys(1);
					setAllVGGrades();
				break;
			case 2: ctl.setGradeSys(2);
					setAllNumberGrades();
				break;
			}
		}
	}
	

	

}


	


