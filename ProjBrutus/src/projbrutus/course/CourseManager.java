package projbrutus.course;

import java.util.ArrayList;
import java.util.Scanner;

import projbrutus.FileManager;
import projbrutus.course.examination.task.CourseTask;
import projbrutus.person.Person;
import projbrutus.person.Teacher;
import projbrutus.testing.Test;


public class CourseManager {
	
	private Scanner in = new Scanner(System.in);
	private CourseCatalogue cc;
	private CourseList cl = new CourseList();
	private Person p;
	private ArrayList<CourseRoom> allCourseRooms;
	private CourseRoom tmpCR;
	
	public CourseManager(){
		
	}
	public CourseManager(Person p, CourseCatalogue cc){
		this.p = p;
		this.cc = cc;
		this.allCourseRooms = cc.getAllCourseRooms();
		checkPerson(p);
	}
		
	private void checkPerson(Person p) {
		if (p.getClass() == Teacher.class) {
			System.out.println("\n---- Teacher Overview -----");
			loadTeacherCourses(p);
		} else {
			System.out.println("\n---- Student Overview -----");
			loadPersonalCourses(p);
		}

	}
	
	public void loadTeacherCourses(Person p) {
		cc.printCourseRooms();
		chooseTeacherCourse();

	}
	
	public void loadPersonalCourses(Person p) {
		cl.populateCourseList(p); // Lägger till personens kurser i courseList
		cl.printCourseList(p); //Skriver ut kurslistan
		chooseCourse();
		chooseTask(tmpCR);
	}
	
	private void chooseTask(CourseRoom cr) {
		System.out.print("Choose task (0-4): ");
		int chosenTask = in.nextInt();
		ArrayList<CourseTask> tasks = cr.getEa().getCTL().getTasks();
		
		if ((chosenTask <= tasks.size()) && (chosenTask > -1 )) {
			
			System.out.println(tasks.get(chosenTask).toString());
			manageTask(tasks.get(chosenTask));
		} else {
			System.out.println("choice does not exist..");
		}
	}
	

	
	
	
	public void chooseCourse() {
		tmpCR = cl.chooseCourse(p);
		tmpCR.printCourseRoom();
	}
	
	private void chooseTeacherCourse() {
		System.out.print("Choice (0-3): ");
		ArrayList<CourseTask> ct;
		int choice = in.nextInt();
		switch (choice) {
		case 0:
			allCourseRooms.get(0);
			new Test(p, allCourseRooms.get(0));
			System.out.println(allCourseRooms.get(0).toString());
			ct = this.showTasks(allCourseRooms.get(0));
			chooseTeacherTask(ct);
			break;
		case 1:
			allCourseRooms.get(1);
			new Test(p, allCourseRooms.get(1));
			System.out.println(allCourseRooms.get(1).toString());
			ct = this.showTasks(allCourseRooms.get(1));
			chooseTeacherTask(ct);
			break;
		case 2:
			allCourseRooms.get(3);
			new Test(p, allCourseRooms.get(2));
			System.out.println(allCourseRooms.get(2).toString());
			ct = this.showTasks(allCourseRooms.get(2));
			chooseTeacherTask(ct);
			break;
		case 3:
			allCourseRooms.get(3);
			new Test(p, allCourseRooms.get(3));
			System.out.println(allCourseRooms.get(3).toString());
			ct = this.showTasks(allCourseRooms.get(3));
			chooseTeacherTask(ct);
			break;
		}
	}
	
	private void chooseTeacherTask(ArrayList<CourseTask> ct) {
		System.out.print("Choice (0-4): ");
		int choice = in.nextInt();
		switch (choice) {
		case 0: manageTask(ct.get(0));
		break;
		case 1: manageTask(ct.get(1));
		break;
		case 2: manageTask(ct.get(2));
		break;
		case 3: manageTask(ct.get(3));
		break;
		case 4: manageTask(ct.get(4));
		break;
		}
	}


	private void manageTask(CourseTask ct) {
		
		
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
				ct.setGrade("U");
				break;
			case 1:
				System.out.println("Grade set to K!");
				ct.setGrade("K");
				break;
			case 2:
				System.out.println("Grade set to G!");
				ct.setGrade("G");
				break;
			case 3:
				System.out.println("Grade set to VG!");
				ct.setGrade("VG");
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
	
	
	public ArrayList<CourseTask> showTasks(CourseRoom cr){
		System.out.println("CourseTaskList: ");
		System.out.println(cr.getEa().getCTL().toString());
		System.out.println("Tasks:");
		for(int i = 0; i < cr.getEa().getCTL().getTasks().size(); i++){
			System.out.println("Task " + i + ". " + cr.getEa().getCTL().getTasks().get(i).toString());
		}
		return cr.getEa().getCTL().getTasks();
	}
	
}
