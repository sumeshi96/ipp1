/**
 * 
 */
package ca3;

/**
 * @author b1021042 YumaSakai
 *
 */
public class Person2 {
	int id;
	String name;
	String[] subject = {"math","english"};
	int[] score = {0,0};
	
	Person2(String nameX,int idX){
		this.name = nameX;
		this.id = idX;
	}
	
	public String toString() {
		String returnName = this.name + ", " + this.id + "\n";
		for(int i = 0;i < subject.length;i++) {
			returnName = returnName + subject[i];
			returnName = returnName + ":";
			returnName = returnName + score[i];
			returnName = returnName + "\n";
		}
		return returnName;
	}
	
	public static void main(String[] args) {
		Person2 a = new Person2("taro",100);
		System.out.println(a.toString());
	} 
}
