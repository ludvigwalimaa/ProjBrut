package projbrutus.course.examination.task;

import java.util.ArrayList;
import java.util.Scanner;

import projbrutus.FileManager;
import projbrutus.course.CourseRoom;
import projbrutus.course.group.Group;
import projbrutus.person.Person;
import projbrutus.person.Teacher;

public class CourseTask {
	private Scanner in = new Scanner(System.in);
	private String cId;
	private String description;
	private String grade;

	public CourseTask(String cId, String description, String grade) {
		this.setcId(cId);
		this.setDescription(description);
		this.setGrade(grade);
	}
	
	public CourseTask(){
		
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getcId() {
		return cId;
	}

	public void setcId(String cId) {
		this.cId = cId;
	}
	
	public String toString(){
		return description + " - " + cId + " " + grade;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	public CourseTask chooseTask(Person p, CourseRoom cr) {
		
		ArrayList<CourseTask> tmpCTL = cr.getEa().getCTL().getTasks();
		if(p.getClass() == Teacher.class){
			System.out.print("Choice (0-4): ");
			int chosenTask = in.nextInt();
//			ArrayList<CourseTask> tasks =  tmpCTL;
			
			if ((chosenTask <= tmpCTL.size()) && (chosenTask > -1 )) {
				System.out.println("Task. " + chosenTask);
				return tmpCTL.get(chosenTask);
			} else {
				System.out.println("choice does not exist..");
			}
		}
		else{
			System.out.print("Choose task (0-4): ");
			int chosenTask = in.nextInt();
//			ArrayList<CourseTask> tasks =  tmpCTL;
			
			if ((chosenTask <= tmpCTL.size()) && (chosenTask > -1 )) {
				System.out.println("Task. " + chosenTask);
				return tmpCTL.get(chosenTask);
			} else {
				System.out.println("choice does not exist..");
			}
		}
		
		return null;
	}

	public void manageTask(Person p) {
		
		if(p.getClass() == Teacher.class){
			System.out.println("-----");
			System.out.println("0. Set grade 'U' ");
			System.out.println("1. Set grade 'K' ");
			System.out.println("2. Set grade 'G' ");
			System.out.println("3. Set grade 'VG' ");
			
			System.out.print("Choice (0-3):");
			int chosenTask = in.nextInt();
			switch (chosenTask) {
			case 0:
				System.out.println("Grade set to U!");
				setGrade("U");
				break;
			case 1:
				System.out.println("Grade set to K!");
				setGrade("K");
				break;
			case 2:
				System.out.println("Grade set to G!");
				setGrade("G");
				break;
			case 3:
				System.out.println("Grade set to VG!");
				setGrade("VG");
				break;
			}
			
			
		}else{
			
		FileManager fm = new FileManager();
		
		System.out.println("------");
		System.out.println("0. Download material");
		System.out.println("1. Upload material");
		System.out.print("Choice: (0-1) ");
		int chosenTask = in.nextInt();
		switch (chosenTask) {
		case 0:
			fm.download();
			break;
		case 1:
			fm.upload();
			break;
		}
	}
	}

	
}
