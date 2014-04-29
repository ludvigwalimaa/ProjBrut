package projbrutus.course;

public class CourseCatalogue {
	
	public boolean getCourse(String cId) {
		boolean courseExists = false;
		
		//metod som kollar om inskickat kursID finns i databasen(MapCourseDesc?), 
		//om ja retuneras true och klassen kursnhanterare kan gå vidare i koden
		
		if(cId.equals("725G51") 
		|| cId.equals("725G54")
		|| cId.equals("725G56")
		|| cId.equals("725G44")
		|| cId.equals("725G41")
		|| cId.equals("725G64")
		|| cId.equals("725G26")
		|| cId.equals("725G74")
		|| cId.equals("725G34")
		|| cId.equals("725G24")
		|| cId.equals("725G66")
		|| cId.equals("725G74")) {
			courseExists = false;
		} else {
			
		}
		
		return courseExists;
	}

}
