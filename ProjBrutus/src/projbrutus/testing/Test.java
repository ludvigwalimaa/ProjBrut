package projbrutus.testing;

import projbrutus.course.CourseRoom;
import projbrutus.person.Person;
import projbrutus.person.Teacher;

public class Test {
	
	//Test av Teacher Ivan.
	
	private Person p;
	private CourseRoom cr;
	
	public Test(Person p , CourseRoom cr){
		this.p = p;
		this.cr = cr;
		personTest(this.p);
	}
	
	private void roomTest(CourseRoom cr){
		
	}
	
	private void personTest(Person p){
		System.out.println("----Initializing persontest... -----");
		if(p.getClass() == Teacher.class){
			System.out.println("Person is a 'teacher'-class");
			
			if(p.getLiudID().equals("ivan")){
				System.out.println("Teacher(person) liuID is 'ivan'");
				System.out.println("** Test success! - Class and liuID correkt.**");
				
				
			}else{
				System.out.println("Test fail! - Teachers name is not ivan");
			}
			
		}else{
			System.out.println("Test fail! - Person is not a teacher");
		}
		System.out.println("---------------------");
		
	}

}
