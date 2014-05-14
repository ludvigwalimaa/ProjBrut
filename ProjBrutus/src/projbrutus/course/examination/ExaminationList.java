package projbrutus.course.examination;

import java.util.ArrayList;

import projbrutus.course.CourseStructure;
import projbrutus.course.examination.task.CourseTaskList;
import projbrutus.course.group.Group;


public class ExaminationList {
	
	private ArrayList<ExaminationArea> DBexaList = new ArrayList<ExaminationArea>();
	
	private String cId;
	private String liuID;
	private CourseStructure cs;
	private int exaAreaSize;
	private int courseTaskSize;
	
	public ExaminationList(String cId, int exaAreaSize, int courseTaskSize){
		this.cId = cId;
		this.exaAreaSize = exaAreaSize;
		this.courseTaskSize = courseTaskSize;
	}
	public ExaminationList(){

	}
	
	//Skapar 30st ExaArea för kursrummet.
	public void populateDBexaList(){
		cs = new CourseStructure();
		for(int i = 0; i< exaAreaSize ;i++){
			getDBexaList().add(new ExaminationArea(this.cId, courseTaskSize));
		}
	}
	
	public ArrayList<ExaminationArea> getDBexaList(){
		return DBexaList;
	}

	

	
}
