package projbrutus.course.examination.task;

import java.util.ArrayList;
import java.util.Scanner;

import projbrutus.FileManager;
import projbrutus.course.CourseRoom;

public class CourseTask {
	private Scanner in = new Scanner(System.in);
	private String cId;
	private String description;
	private String grade;
	private String filepath; //I den här variabeln kommer vi att spara sökvägen till den inlämnade filen. 

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
	
	public CourseTask chooseTaskTeacher(CourseRoom cr) {
		
		ArrayList<CourseTask> tmpCTL = cr.getEa().getCTL().getTasks();
		int numberOfTasks = tmpCTL.size() - 1;
		
			System.out.print("Choice (0-" + numberOfTasks + "): ");
			int chosenTask = in.nextInt();
			if ((chosenTask <= tmpCTL.size()) && (chosenTask > -1 )) {
				System.out.println("Task. " + chosenTask);
				return tmpCTL.get(chosenTask);
			} else {
				System.out.println("choice does not exist..");
			}
		return null;
	}

	public void handIn(FileManager fm){
		System.out.println("Choose file to hand in: ");
		filepath = "C:/Document/files.zip"; // H�rdkodat in en filepath
		System.out.println("** Student chose file: " + filepath + " **");
		fm.handIn(filepath); //Här ska det egentligen skickas in en vald fil i IAD heter den File.
		this.setGrade("Handed in");  //Status update i IAD. Ändrar Grade för att Teachern ska se att man lämnat in en uppgift.
	}

	public void downloadFile(FileManager fm){
		System.out.println("Download files? (y/n): ");
		filepath = "files/725G51/gabol892/files.zip"; // H�rdkodat in en filepath
		System.out.println("** Teacher chose 'y' to download the file: " + filepath + " **");
		fm.downloadFile(filepath);
	}


	
	public void setGradeTeacher(int choice){
		
//		Nedanstående som är kommenterat tillhör INL3
		
//		int gradesys = tmpCTL.getGradeSys();
//		if(p.getClass() == Teacher.class){
//			if(gradesys == 1)
//			setVGGrade();
//			else if(gradesys == 2){
//			setNumberGrade();
//			}else{
//				System.out.println("Error! No such grade system");
//			}
		
		System.out.println("-----");
		System.out.println("0. Set grade 'U' ");
		System.out.println("1. Set grade 'K' ");
		System.out.println("2. Set grade 'G' ");
		System.out.println("3. Set grade 'VG' ");
		
		System.out.println("Choice (0-3):");
		System.out.println("** Teacher chose to grade VG **");
		switch (choice) {
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
		
	}
	
	//Kommer användas i INL3
	private void setNumberGrade() {
		System.out.println("-----");
		System.out.println("1. Set grade '1' ");
		System.out.println("2. Set grade '2' ");
		System.out.println("3. Set grade '3' ");
		System.out.println("4. Set grade '4' ");
		System.out.println("5. Set grade '5' ");
		
		System.out.print("Choice (1-5):");
		int chosenTask = in.nextInt();
		switch (chosenTask) {
		case 1:
			System.out.println("Grade set to 1!");
			setGrade("1");
			break;
		case 2:
			System.out.println("Grade set to 2!");
			setGrade("2");
			break;
		case 3:
			System.out.println("Grade set to 3!");
			setGrade("3");
			break;
		case 4:
			System.out.println("Grade set to 4!");
			setGrade("4");
			break;
		case 5:
			System.out.println("Grade set to 5!");
			setGrade("5");
			break;
		}
		
	}

	//Kommer användas i INL3
	private void setVGGrade(){
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
		
	}

	public String getFilepath() {
		return filepath;
	}

	public void setFilepath(String filepath) {
		this.filepath = filepath;
	}

//	private void upload(FileManager fm){
//		fm.upload();
//	}
//	
//	private void download(FileManager fm){
//		fm.download();
//	}
}
