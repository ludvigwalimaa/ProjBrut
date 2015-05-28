package projbrutus;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

import projbrutus.Database.DBfascade;
import projbrutus.person.Person;
import projbrutus.person.Teacher;

public class DBPersonAdapter {

	private List personLista, personPost, personObjektLista;
	private DBfascade dbfascade;
	
	private String liuID ="";
	private String name ="";
	private String personNummer = "";
	private String password = "";
	private int admin = 0;
	
	public DBPersonAdapter(){
		dbfascade = new DBfascade();
	}
	
	
	public List fetchPersons(){
		personLista = dbfascade.returnPersons();
		
		personObjektLista = new ArrayList<Person>();
		
		Iterator<Person> iter =  personLista.iterator();
		
		while(iter.hasNext()){
			personPost = (List)iter.next();
			liuID = (String)personPost.get(0);
			name = (String)personPost.get(1);
			personNummer = (String)personPost.get(2);
			password = (String)personPost.get(3);
			admin = (Integer) personPost.get(4);

			if(admin == 0)
              {
              	personObjektLista.add(new Person(liuID, name, personNummer, password));       
              	
              }else{
            	  personObjektLista.add(new Teacher(liuID, name, personNummer, password));
              }
		}
		return personObjektLista;
		
		
	}
}
