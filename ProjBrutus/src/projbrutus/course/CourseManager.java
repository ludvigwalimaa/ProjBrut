package projbrutus.course;

import java.util.ArrayList;
import java.util.Scanner;

import projbrutus.FileManager;
import projbrutus.course.examination.task.CourseTask;
import projbrutus.course.examination.task.CourseTaskList;
import projbrutus.person.Person;
import projbrutus.person.Teacher;


public class CourseManager {
	private Scanner in = new Scanner(System.in);
	private CourseCatalogue cc;
	private CourseList cl = new CourseList();
	private FileManager fm = new FileManager();
	private Person p;
	private ArrayList<CourseRoom> allCourseRooms;
	private CourseRoom tmpCR;
	private CourseTask tmpCT;
	private CourseTaskList tmpCTL;

	
	public CourseManager(){
		
	}
	public CourseManager(Person p, CourseCatalogue cc){
		this.p = p;
		this.cc = cc;
		getAllCourseRooms();
		checkPerson(p);
	}
	
	private void getAllCourseRooms(){
		this.allCourseRooms = cc.getAllCourseRooms();
	}
		
	private void checkPerson(Person p) {
		if (p.getClass() == Teacher.class) {
			System.out.println("\n---- Teacher Overview -----");
			loadTeacherCourses(p);
		} else {
			System.out.println("\n---- Student Overview -----");
			loadStudentCourses(p);
		}
	}
	
	private void loadTeacherCourses(Person p) {
		cc.printCourseRooms();
		chooseCourseTeacher(0); //Hårdkodat val av kursrum (courseroom)
		
		boolean loopGrading = true;
		while (loopGrading) {
//		tmpCR.setGradeSys(); Den här metoden tillhör INL3
		tmpCR.setAllVGGrades(); //Sätter alla grades till VG för test-syfte.
		tmpCR.showTasks();
		chooseTaskTeacher(0); //Hårdkodat val av kursmoment (courseTask)


		tmpCR.showTasks();
		if(tmpCR.gradesLeft()){
		System.out.println("\nPress 0 to grade another task, 1 to finish");
		System.out.print("Choice: ");
		
		int moreGrade = in.nextInt();
		switch (moreGrade) {
		case 0:
			break;
		case 1:
			loopGrading = false;
			break;
		}}else{
			loopGrading = false;

			System.out.println("Grading Done!");
//			Används i INL3
//			calcGrade();
			
		}
		
		}
	}
	
	private void calcGrade(){ //Används i INL3
		tmpCR.calcGrade(tmpCR.getliuID());
	}
	
	
	private void loadStudentCourses(Person p) {
		cl = new CourseList();
		cl.populateCourseList(p, cc); // Lägger till personens kurser i courseList
		cl.printCourseList(p); //Skriver ut kurslistan
		chooseCourseStudent("725G51"); //Hårdkodat en kurskod
		tmpCR.printCourseRoom();
		chooseTaskStudent(0); //Hårdkodat val av kursmoment (courseTask)
		tmpCR.printCourseRoom();
		
	}
	

	


	private void chooseCourseTeacher(int choice) {
		tmpCR = cl.chooseCourseTeacher(choice ,p, allCourseRooms);
		
	}
	
	private void chooseCourseStudent(String cId){
		tmpCR = cl.chooseCourseStudent(cId); 
	}
	
	private void chooseTaskTeacher(int choice) {
		tmpCT = tmpCR.chooseTaskTeacher(choice);
		tmpCT.manageTaskTeacher();
		
	}
	
	private void chooseTaskStudent(int choice){
		tmpCT = tmpCR.chooseTaskStudent(choice);
		tmpCT.manageTaskStudent(fm);
	}


}
