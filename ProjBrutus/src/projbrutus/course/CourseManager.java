package projbrutus.course;

import java.util.ArrayList;
import java.util.Scanner;

import projbrutus.FileManager;
import projbrutus.course.examination.task.CourseTask;
import projbrutus.course.examination.task.CourseTaskList;
import projbrutus.person.Person;
import projbrutus.person.Teacher;


public class CourseManager {

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
		getAllCourseRooms();
		chooseCourseTeacher(0); //Hårdkodat val av kursrum (courseroom)
		setGradeSys(); //Den här metoden tillhör INL3
		tmpCR.printCourseRoom();
		boolean loopGrading = true;
		while (loopGrading) {
		chooseTaskTeacher(0); //Hårdkodat val av kursmoment (courseTask)
		
		if(tmpCR.gradesLeft()){
		System.out.println("\nPress 0 to grade another task, 1 to finish");
		System.out.println("Choice: ");
		
		int moreGrade = 0; //Hårdkodat val av om man har grades kvar
		System.out.println("** Teacher chose to grade another task **");
		switch (moreGrade) {
		case 0:
			tmpCR.showTasks();
			tmpCR.setAllVGGrades(); //Sätter alla grades till VG för test-syfte.
			break;
		case 1:
			loopGrading = false;
			break;
		}}else{
			loopGrading = false;

			System.out.println("Grading Done!");
//			Används i INL3
			System.out.println("\n** Printing Tasks **");
			tmpCR.showTasks();
			calcGrade();
			
			
			
		}
	}
	}	

	private void setGradeSys(){
		tmpCR.setGradeSys();
	}
	
	private void calcGrade(){ //Används i INL3
		tmpCR.calcGrade(tmpCR.getliuID());
	}
	
	
	private void loadStudentCourses(Person p) {
		cl.populateCourseList(p, cc); // Lägger till personens kurser i courseList
		cl.printCourseList(p); //Skriver ut kurslistan
		chooseCourseStudent("725G51"); //Hårdkodat en kurskod
		tmpCR.printCourseRoom();
		chooseTaskStudent(0); //Hårdkodat val av kursmoment (courseTask)
		System.out.println("\n** Skriver ut kursrummet igen för att se statusförändring **");
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
		tmpCT.setGradeTeacher(3); //Hårdkodat - Sätter grade till VG
		
	}
	
	private void chooseTaskStudent(int choice){
		tmpCT = tmpCR.chooseTaskStudent(choice);
		tmpCT.handIn(fm, "C:/Document/file.pdf");
	}


}
