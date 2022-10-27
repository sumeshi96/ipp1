/**
 * 
 */
package ca2;

/**
 * @author b1021042 YumaSakai
 *
 */
public class Student2 {
	String name;
	int id;
	
	Student2(String nameX, int idX){
		this.name = nameX;
		this.id = idX;
		System.out.println("初期設定を実行しました");
	}
	
	public String toString(){
		return this.name + ", " + this.id;
	}
	
	public static void main(String[] args) {
		Student2 taro = new Student2("Mirai Taro", 100);
		Student2 hana = new Student2("Future Hana", 201);
		System.out.println(taro.toString());
		System.out.println(hana.toString());
	}
}
