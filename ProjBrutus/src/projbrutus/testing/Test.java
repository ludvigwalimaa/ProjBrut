package projbrutus.testing;
import projbrutus.course.CourseCatalogue;
import projbrutus.course.CourseRoom;
import projbrutus.person.Person;
import projbrutus.person.Teacher;

public class Test {
	
	//Test av Teacher Ivan.
	private CourseCatalogue cc;
	private Person p;
	private CourseRoom cr;
	
	public Test(Person p , CourseRoom cr){
		this.p = p;
		this.cr = cr;
		System.out.println("\n............. Initializing TEST .............");
		personTest(this.p);
		roomTest(this.cr);
		
	}
	
	private void roomTest(CourseRoom cr){
		System.out.println("*Starting roomTest..");
		if(cr.getcId().equals("725G51")){
			System.out.println("  -Chosen courseID('" +cr.getcId() + "') correct");
			if(cr.getliuID().equals("gabol892")){
				System.out.println("  -Chosen course LiuID('" +cr.getliuID() + "') correct");
				System.out.println("............. SUCCESS .............\n\n");
			}else{
				System.out.println("*** FAIL! Fel tillhörande liuID ***");
				System.out.println("............. TEST FAIL .............\n\n");
			}
		}else{
			System.out.println("*** FAIL! Fel kurskod! ****");
			System.out.println("............. TEST FAIL .............\n\n");
		}
		
	}
	
	private void personTest(Person p){
		System.out.println("*Starting personTest..");
		if(p.getClass() == Teacher.class){
			System.out.println("  -Person '" +p.getLiudID() + "' is a 'teacher'-class");
			
			if(p.getLiudID().equals("ivan")){
				System.out.println("  -Teacher(person) liuID is 'ivan'");
				
				
			}else{
				System.out.println("Test fail! - Teachers name is not ivan");
			}
			
		}else{
			System.out.println("Test fail! - Person is not a teacher");
		}
		
		
	}

}
