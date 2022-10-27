package ca;
/**
* 
* @author b1021042 YumaSakai
*
*/
public class Code0103 {
	public static void main(String[] args) {
		char c = 'あ';// 1
		char d = 'a';// 2
		String s = "あいうえお";// 3
		String t = "abc";// 4
		
		System.out.println(c);// 5
		System.out.println(d);// 6
		System.out.println(c + 1);// 7
		System.out.println(d + 1);// 8
		System.out.println(s);// 9
		System.out.println(t);// 10
		System.out.println(s + t);// 11
		System.out.println(s + c);// 12
		s = s + ":";// 13
		System.out.println(s); // 14
		System.out.println(s + 12.3); //15
		s = s + 45.6;// 16
		s = s + 78.9;// 17
		System.out.println(s);
	}
	
	
}
