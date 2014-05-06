package projbrutus.course.examination;

import java.util.ArrayList;

public class ExaminationList {
	
	private ArrayList<ExaminationArea> exaList = new ArrayList();
	private String cId;
	
	public ExaminationList(String cId){
		this.cId = cId;
		exaList.add(new ExaminationArea(cId));
	}
	
	public ArrayList<ExaminationArea> getList(){
		return exaList;
	}

	
}
