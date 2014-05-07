package projbrutus.course;

import java.util.ArrayList;
import java.util.Scanner;

import projbrutus.FileManager;
import projbrutus.course.examination.task.CourseTask;
import projbrutus.person.Person;
import projbrutus.person.Teacher;
import projbrutus.testing.Test;


public class CourseManager {
	
	Scanner in = new Scanner(System.in);
	CourseCatalogue cc = new CourseCatalogue();
	CourseList cl = new CourseList();
	Person p;
	
	public CourseManager(){
		
	}
	public CourseManager(Person p){
		this.p = p;
	}
	
	public void loadTeacherCourses(Person p) {
		System.out.println(this.toString());
		chooseTeacherCourse();

	}
	
	private void chooseTeacherCourse() {
		System.out.print("Choice (0-3): ");
		ArrayList<CourseTask> ct;
		int choice = in.nextInt();
		switch (choice) {
		case 0:
			this.allCourseRooms().get(0);
			new Test(p, this.allCourseRooms().get(0));
			System.out.println(this.allCourseRooms().get(0).toString());
			ct = this.showTasks(this.allCourseRooms().get(0));
			chooseTeacherTask(ct);
			break;
		case 1:
			this.allCourseRooms().get(1);
			new Test(p, this.allCourseRooms().get(1));
			System.out.println(this.allCourseRooms().get(1).toString());
			ct = this.showTasks(this.allCourseRooms().get(1));
			chooseTeacherTask(ct);
			break;
		case 2:
			this.allCourseRooms().get(3);
			new Test(p, this.allCourseRooms().get(2));
			System.out.println(this.allCourseRooms().get(2).toString());
			ct = this.showTasks(this.allCourseRooms().get(2));
			chooseTeacherTask(ct);
			break;
		case 3:
			this.allCourseRooms().get(3);
			new Test(p, this.allCourseRooms().get(3));
			System.out.println(this.allCourseRooms().get(3).toString());
			ct = this.showTasks(this.allCourseRooms().get(3));
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

	public void loadPersonalCourses(Person p) {
		cl.populateCourseList(p); // Lägger till personens kurser i courseList
		for (int i = 0; i < cl.getCourseList().size(); i++) {
			System.out.println("* " + cl.getCourseList().get(i).toString());
		}

	}

	public void chooseCourse() {
		String chosenCourse;
		CourseRoom cr;
		System.out.print("Choice('725GXX'): ");
		chosenCourse = in.nextLine();
		for (int i = 0; i < cl.getCourseList().size(); i++) {
			if (chosenCourse.equals(cl.getCourseList().get(i).getcId())) {
				cr = this.fetchCourseRoom(cl.getCourseList().get(i));
				chooseTask(cr);

			} else {

			}
		}
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
/*
		switch (chosenTask) {
		case 0:
			System.out.println(tasks.get(0).toString());
			manageTask(tasks.get(0));
			break;
		case 1:
			System.out.println(tasks.get(1).toString());
			manageTask(tasks.get(0));
			break;
		case 2:
			System.out.println(tasks.get(2).toString());
			manageTask(tasks.get(0));
			break;
		case 3:
			System.out.println(tasks.get(3).toString());
			manageTask(tasks.get(0));
			break;
		case 4:
			System.out.println(tasks.get(4).toString());
			manageTask(tasks.get(0));
			break;
			}
			*/
		
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
	
	public ArrayList<CourseRoom> allCourseRooms(){
		ArrayList<CourseRoom> acr = cc.getAllCourseRooms();
		return acr;
	}
	
	public String toString(){
		String s = "";
		for(int i=0; i<cc.getAllCourseRooms().size(); i++){
			s = s + i + ". " + cc.getAllCourseRooms().get(i).toString();
		}
		return s;
	}
	
	
	public CourseRoom fetchCourseRoom(CourseRoom cr) {
		System.out.println("CourseRoom:" + cr.toString());

		System.out.println("ExaminationsLista:");
		System.out.println("ExaminationsArea: " + cr.getEa().toString());
		
		System.out.println("GroupList:");
		System.out.println(cr.getGroup());
		
		System.out.println("CourseTaskList: ");
		System.out.println(cr.getEa().getCTL().toString());
		System.out.println("Tasks:");
		for(int i = 0; i < cr.getEa().getCTL().getTasks().size(); i++){
			System.out.println("Task " + i + ". " + cr.getEa().getCTL().getTasks().get(i).toString());
		}
		return cr;
		
		
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
