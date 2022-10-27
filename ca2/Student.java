/**
 * 
 */
package ca2;

/**
 * @author b1021042 YumaSakai
 *
 */
public class Student {
	Student(){
		System.out.println("初期設定を実行しました");
	}
	
	public static void main(String[] args) {
		Student taro = new Student();
		Student hana = new Student();
		System.out.println(taro);
		System.out.println(hana);
	}
}
