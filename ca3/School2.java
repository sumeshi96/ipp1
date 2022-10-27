package ca3;

/**
 * @author b1021042 YumaSakai
 *
 */

public class School2 {
	Person2[] classroom;
	
	School2(Person2[] person2){
		classroom = person2;
	}
	
	public String toString() {
		String returnString = "";
		for(Person2 p: classroom) {
			returnString = returnString + p.name + ", " + p.id + "\n";
			for(int i = 0;i < p.subject.length;i++) {
				returnString = returnString + p.subject[i] + ":" + p.score[i] + "\n";
			}
			returnString = returnString + "\n";
		}
		return returnString;
	}
	
	 public static void main(String[] args) {
	        Person2[] member = new Person2[4];
	        member[0] = new Person2("ichi", 101);
	        member[1] = new Person2("ni", 102);
	        member[2] = new Person2("san", 201);
	        member[3] = new Person2("shi", 202);

	        School2 c = new School2(member);
	        System.out.println(c);

	        member[0] = new Person2("shin-ichi", 100);
	        System.out.println(c);
	    }
}
