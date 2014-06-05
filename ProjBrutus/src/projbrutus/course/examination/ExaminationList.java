package projbrutus.course.examination;

import java.util.ArrayList;

import projbrutus.course.CourseStructure;


public class ExaminationList {
	
	private ArrayList<ExaminationArea> DBexaList = new ArrayList<ExaminationArea>();
	
	private String cId;
	private int exaAreaSize;

	private CourseStructure cs;
	
	public ExaminationList(String cId, CourseStructure cs){
		this.cId = cId;
		this.cs = cs;
		this.exaAreaSize = cs.getDefaultExaAreaSize();

	}
	public ExaminationList(){

	}
	
	public ExaminationArea getExaArea(int i){
		return DBexaList.get(i);
	}
	
	
	//Skapar 30st ExaArea för kursrummet.
	public void populateDBexaList(){
		for(int i = 0; i< exaAreaSize ;i++){
			ExaminationArea ea = new ExaminationArea(this.cId, cs);
			DBexaList.add(ea);
		}
	}
	
	public ArrayList<ExaminationArea> getDBexaList(){
		return DBexaList;
	}

	

	
}
