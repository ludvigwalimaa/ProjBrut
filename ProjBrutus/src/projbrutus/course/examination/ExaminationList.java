package projbrutus.course.examination;

import java.util.ArrayList;

import projbrutus.course.CourseStructure;
import projbrutus.course.examination.task.CourseTaskList;
import projbrutus.course.group.Group;


public class ExaminationList {
	
	public static ArrayList<ExaminationArea> DBexaList = new ArrayList<ExaminationArea>();
	
	
	//private ArrayList<ExaminationArea> exaList = new ArrayList<ExaminationArea>();
	private String cId;
	private String liuID;
	private CourseStructure cs;
	
	public ExaminationList(String cId){
		this.cId = cId;
		
		
	}
	public void populateDBexaList(){
		cs = new CourseStructure();
		for(int i = 0; i< cs.getDefaultExaminationAreaSize() ;i++){
			ExaminationArea ea = new ExaminationArea(this.cId);
			DBexaList.add(new ExaminationArea(this.cId));
			//Skapar 30st ExaArea för kursrummet.
		}
	}
	
	public String getDBexaList(){
		return DBexaList.toString();
	}
	
//	public ArrayList<ExaminationArea> getList(){
//		System.out.println("CourseTaskList:");
//		System.out.println(this.exaList.get(0).getCTL().toString());
//		return exaList;
//	}

	
}
