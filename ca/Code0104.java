package ca;
/**
* 
* @author b1021042 YumaSakai
*
*/
public class Code0104 {
	public static void main(String[] args) {
		String s = new String("abc");// 1
		String t = new String("def");// 2
		System.out.println(s + "," + t);// 3
		System.out.println(s.equals(t));// 4
		System.out.println(s.equals("abc"));// 5
		System.out.println("abc".equals("abc"));// 6
		int x = 12;
		int y = 4;
		System.out.println(x % y);// 9
		System.out.println(x%2 == 1);// 10
		System.out.println(x%2 == 0);// 11
		int a = 0;
		System.out.println(a++);// 13
		System.out.println(a);// 14
		System.out.println(++a);// 15
		System.out.println(a);// 16
	}
}
