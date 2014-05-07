package projbrutus.course.examination;

import java.util.ArrayList;

import projbrutus.course.CourseStructure;
import projbrutus.course.examination.task.CourseTaskList;
import projbrutus.course.group.Group;


public class ExaminationList {
	
	private ArrayList<ExaminationArea> DBexaList = new ArrayList<ExaminationArea>();
	
	
	//private ArrayList<ExaminationArea> exaList = new ArrayList<ExaminationArea>();
	private String cId;
	private String liuID;
	private CourseStructure cs;
	
	public ExaminationList(String cId){
		this.cId = cId;
	}
	public ExaminationList(){

	}
	
	//Skapar 30st ExaArea för kursrummet.
	public void populateDBexaList(){
		cs = new CourseStructure();
		for(int i = 0; i< cs.getDefaultExaminationAreaSize() ;i++){
			ExaminationArea ea = new ExaminationArea(this.cId);
			getDBexaList().add(new ExaminationArea(this.cId));
			
		}
	}
	
	public ArrayList<ExaminationArea> getDBexaList(){
		return DBexaList;
	}

	

	
}
