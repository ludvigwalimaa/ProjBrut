package projbrutus.course;

import java.util.ArrayList;
import java.util.Scanner;

import projbrutus.adapter.NumberSetGradeAdapter;
import projbrutus.adapter.VGSetGradeAdapter;
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
			ctl.get(i).setGrade("VG");
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
			VGSetGradeAdapter vsg = new VGSetGradeAdapter(ctl);
			System.out.println(vsg.postGrade(ctl));

		}else{
			NumberSetGradeAdapter nsg = new NumberSetGradeAdapter(ctl);
			System.out.println(nsg.postGrade(ctl));
		}
		
	}
	
	/* 
	 * Den här metoden fungerar som vår Factory.
	 * Metoden sker då CourseTaskListan inte har ett valt GradeSystem. 
	 * Valet kan Teacher-klassen göra 1 gång per CourseTaskList. (Alltså 1 gång per kursrum).
	 * Valet kommer därefter att vara statiskt. 
	 * Den här metoden tillåter läraren att rätta kurser med olika GradeSystem beroende på om eleven går FilFak eller TekFak. 
	 * GradeSystemet är alltså inte knutet till kurskoden utan kan väljas manuellt.
	 */
	public void setGradeSys(){
		CourseTaskList ctl = ea.getCTL();
		if(ctl.getGradeSys() == 0){
			System.out.println("Is this a VG-system or a Number-system?");
			System.out.println("1. VG-system");
			System.out.println("2. Number-system");
			int choice = 0;
			System.out.print("Choice(1-2): ");
			choice = in.nextInt();
			switch(choice){
			case 1: ctl.setGradeSys(1);
					setAllVGGrades();
				break;
			case 2: ctl.setGradeSys(2);
					setAllNumberGrades();
				break;
			}
		}else{
			//Teachern har redan valt ett GradeSystem. 
		}
	}
	

	

}


	


