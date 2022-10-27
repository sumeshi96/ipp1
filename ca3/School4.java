package ca3;

/**
 * @author b1021042 YumaSakai
 *
 */

import java.util.ArrayList;
public class School4 {
	ArrayList<Person4> classroom;
	
	School4(){
	 	classroom = new ArrayList<>(); 
	}
	
	public String toString() {
		String returnString = "";
		for(Person4 p: classroom) {
			returnString = returnString + p.name + ", " + p.id + "\n";
			for(int i = 0;i < p.subject.length;i++) {
				returnString = returnString + p.subject[i] + ":" + p.score[i] + "\n";
			}
			returnString = returnString + "\n";
		}
		return returnString;
	}
	
	public void join(Person4 data) {
		classroom.add(data);
	}
	
	public void bye(int n) {
		classroom.remove(n);
	}
	
	public Person4 info(int n) {
		return classroom.get(n);
	}
	
	public double average() {
		double x = 0;
		int n = 0;
		for(Person4 p:classroom) {
			for(int y:p.getScore()) {
				x = x + y;
				n++;
			}
		}
		return x/n;
	}
	
	public static void main(String[] args) {
		// create this
        School4 c = new School4();

        // add three persons
        c.join(new Person4("ichi", 101));
        c.join(new Person4("ni", 102));
        c.join(new Person4("san", 103));
        c.info(0).setScore(0, 72);
        c.info(0).setScore(1, 68);
        c.info(1).setScore(0, 80);
        c.info(1).setScore(1, 70);
        c.info(2).setScore(0, 55);
        c.info(2).setScore(1, 72);
        System.out.println(c);
        System.out.println(c.average());
	}
}
