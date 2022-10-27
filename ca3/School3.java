package ca3;

/**
 * @author b1021042 YumaSakai
 *
 */

import java.util.ArrayList;
public class School3 {
	ArrayList<Person3> classroom;
	
	School3(){
	 	classroom = new ArrayList<>(); 
	}
	
	public String toString() {
		String returnString = "";
		for(Person3 p: classroom) {
			returnString = returnString + p.name + ", " + p.id + "\n";
			for(int i = 0;i < p.subject.length;i++) {
				returnString = returnString + p.subject[i] + ":" + p.score[i] + "\n";
			}
			returnString = returnString + "\n";
		}
		return returnString;
	}
	
	public void join(Person3 data) {
		classroom.add(data);
	}
	
	public void bye(int n) {
		classroom.remove(n);
	}
	
	public Person3 info(int n) {
		return classroom.get(n);
	}
	
	 public static void main(String[] args) {
		// create this
	        School3 c = new School3();

	        // add three persons
	        c.join(new Person3("shi", 202));
	        c.join(new Person3("ni", 102));
	        c.join(new Person3("san", 201));

	        // test printout
	        System.out.println("---join test\n" + c);

	        // remove one person
	        c.bye(0);
	        System.out.println("---bye test\n" + c);

	        // get an element
	        System.out.println("---info test\n"+ c.info(1));

	        // verify independence
	        Person3 p1 = new Person3("ichi", 101);
	        c.join(p1);
	        System.out.println("---join test\n" + c);
	        p1.name = "shin-ichi";
	        System.out.println("---reference test\n" + c);
	    }
}
