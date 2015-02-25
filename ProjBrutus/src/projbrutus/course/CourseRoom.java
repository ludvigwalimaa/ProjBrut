package projbrutus.course;

import java.util.ArrayList;
import java.util.Scanner;

import projbrutus.adapter.Adapter;
import projbrutus.adapter.GradeFactory;
import projbrutus.adapter.NumberAdapter;
import projbrutus.adapter.VGAdapter;
import projbrutus.course.examination.ExaminationArea;
import projbrutus.course.examination.task.CourseTask;
import projbrutus.course.examination.task.CourseTaskList;
import projbrutus.observer.Observer;
import projbrutus.observer.Subject;

public class CourseRoom implements Observer {
	private Scanner in = new Scanner(System.in);
	private String cId;
	private String cName;
	private String name;
	private Subject topic;
	private ExaminationArea ea;
	private ArrayList<String> participantList;
	private String liuID;
	private Adapter gradeAdapter;
	private String courseGrade;
	
	
	public CourseRoom(String cId, String cName, String liuID, ExaminationArea ea, String nm){
		this.cId = cId;
		this.cName = cName;
		this.setEa(ea);
		this.liuID = liuID;
		this.name=nm;
		
	}
	
	public CourseRoom(){
		
	}
	
	@Override
    public void update() {
        String msg = (String) topic.getUpdate(this);
        if(msg == null){
        }else{
        	System.out.println(cId + " - " + name + ": Tog emot meddelande om att alla tasks är rättade");
        	System.out.println("Antal tasks i listan: " + ea.getCTL().getTasks().size());
        	int VG = 0;
        	int G = 0;
        	for(int i = 0; i<ea.getCTL().getTasks().size(); i++){
        		System.out.println("Task " + i + ". - Betyg : " + ea.getCTL().getTasks().get(i).getGrade().toString());
        		if(ea.getCTL().getTasks().get(i).getGrade().equals("G")){
        			G++;
        			//anropa metod f�r ber�kning av betyg f�r att sedan s�tta coursegrade, vilket
        			//i sin tur skickas till adapter
        		}else if(ea.getCTL().getTasks().get(i).getGrade().equals("VG")){
        			VG++;
        		}
        		else{
        			System.out.println("Saknas betyg f�r ber�kning");
        		}
        	}
        	calcGrade(G,VG);
        	
        }
        
        
        
    }
 
    @Override
    public void setSubject(Subject sub) {
        this.topic=sub;
    }

	public String toString(){
		String s = cId + " - " + cName + "\t| " + liuID + "\n";
		return s;
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
		System.out.println("** Brutus printing courseroom **\n");
		System.out.println("CourseRoom:" + toString());
		System.out.println("ExaminationsArea: " + getEa().toString());
		System.out.println("CourseTaskList: " + getEa().getCTL().toString());
		System.out.println("Tasks:");
		for(int i = 0; i < getEa().getCTL().getTasks().size(); i++){
			System.out.println("Task " + i + ". " + getEa().getCTL().getTasks().get(i).toString());
		}

	}
	
	public ArrayList<CourseTask> showTasks(){
//		System.out.println("CourseTaskList: ");
//		System.out.println(getEa().getCTL().toString());

		System.out.println("Tasks:");
		for(int i = 0; i < getEa().getCTL().getTasks().size(); i++){
			System.out.println("Task " + i + ". " + getEa().getCTL().getTasks().get(i).toString());
		}
		return getEa().getCTL().getTasks();
	}
	
	

	public boolean gradesLeft() {
		ArrayList<CourseTask> ctl = ea.getCTL().getTasks();
		for(int i= 0; i < ctl.size(); i++){
			if(ctl.get(i).getGrade().equals("Handed in")){
				return true;
			}
		}
		return false;
	}
	
	/* Den här metoden ska egentligen inte finnas
	 * den är till för att man som Teacher ska slippa rätta 5 moment under testkörning.
	 */
	public void setAllVGGrades(){
		System.out.println("** Setting VG-grades for all tasks **\n");
		ArrayList<CourseTask> ctl = ea.getCTL().getTasks();
		for(int i= 0; i < ctl.size(); i++){
			System.out.println("\n" + "Gonna set grade for task: " + i + " next");
			ctl.get(i).setGradeTeacher(3);
			
		}
	}
	
	/* Den här metoden ska egentligen inte finnas
	 * den är till för att man ska slippa rätta 5 moment under testkörning.
	 */
	public void setAllNumberGrades(){
		System.out.println("*** Setting Number-grades for all tasks ***");
		ArrayList<CourseTask> ctl = ea.getCTL().getTasks();
		for(int i= 0; i < ctl.size(); i++){
			ctl.get(i).setGrade("3");
		}
	}

	public void calcGrade(int G, int VG) {
		if(VG >=G){
    		System.out.println("Number of VG: " + VG);
    		System.out.println("Number of G: " + G);
    		this.courseGrade = "VG";
    		System.out.println("Course grade: " + courseGrade);
    		System.out.println("* Sending to  adapter *");
    		gradeAdapter.postGrade(courseGrade);
    	}else if(G>VG){
    		System.out.println("Antal VG: " + VG);
    		System.out.println("Antal G: " + G);
    		this.courseGrade = "G";
    		System.out.println("Slutbetyg: " + courseGrade);
    		
    	}
//		CourseTaskList ctl = ea.getCTL();
//		if(ctl.getGradeSys() == 1){
//			VGSetGradeAdapter vsg = new VGSetGradeAdapter();
//			System.out.println("Sending to adapter..");
//			System.out.println(vsg.postGrade());
//			
//
//		}else{
//			NumberSetGradeAdapter nsg = new NumberSetGradeAdapter();
//			System.out.println("Sending to adapter..");
//			System.out.println(nsg.postGrade());
//		}
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
		if(this.gradeAdapter == null){
			System.out.println("** First time grading CR.. must choose a gradesystem **");
			System.out.println("Grade with a VG-system or a Number-system?");
			System.out.println("1. VG-system");
			System.out.println("2. Number-system");
			
			int choice = 1; //Hårdkodar choice till VG-system
			System.out.println("Choice(1-2): ");
			System.out.println("** Teacher chose VG-system ** ");
			//Skicka vidare till GradeAdapter(factory).
			GradeFactory gradeFactory = new GradeFactory();
			gradeAdapter = gradeFactory.chooseAdapter(choice);
			System.out.println(gradeAdapter.getClass() + " vald!");
			
		}else{
			//Teachern har redan valt ett GradeSystem. 
		}
	}

	public CourseTask chooseTaskStudent(int choice) {
		ArrayList<CourseTask> tmpCTL = getEa().getCTL().getTasks();
		int numberOfTasks = tmpCTL.size() - 1;
		System.out.println("Choice (0-" + numberOfTasks + "): ");
		System.out.println("** Student chose task " + choice +" **");
		if ((choice <= tmpCTL.size()) && (choice > -1 )) {
			return tmpCTL.get(choice);
		} else {
			System.out.println("choice does not exist..");
		}
		return null;
	}
	
	public CourseTask chooseTaskTeacher(int choice){
		ArrayList<CourseTask> tmpCTL = getEa().getCTL().getTasks();
		int numberOfTasks = tmpCTL.size() - 1;
		
		System.out.println("Choice (0-" + numberOfTasks + "): ");
		
			if ((choice <= tmpCTL.size()) && (choice > -1 )) {
				System.out.println("** Teacher chose task 0 **");
				System.out.println("Task. " + choice);
				
				return tmpCTL.get(choice);
			} else {
				System.out.println("choice does not exist..");
			}
		return null;
	}
	

	

}


	


