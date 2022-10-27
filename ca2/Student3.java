/**
 * 
 */
package ca2;

/**
 * @author b1021042 YumaSakai
 *
 */
public class Student3 {
	String name;
	int id;
	int score;
	
	Student3(String nameX, int idX){
		System.out.println("初期設定を実行しました");
		this.name = nameX;
		this.id = idX;
		this.score = 0;
	}
	
	public String toString(){
		return this.name + ", " + this.id;
	}
	
	public void addScore(int aScore){
		if(aScore > 100) {
			return;
		}else if(aScore < 0){
			return;
		}else {
			score += aScore;
		}
	}
	
	public String info(){
		return this.name + ": " + this.score;
	}
	
	public static void main(String[] args) {
		Student3 taro = new Student3("Mirai Taro", 100);
		Student3 hana = new Student3("Future Hana", 201);
		System.out.println(taro.toString());
		System.out.println(hana.toString());
		taro.addScore(50);
		hana.addScore(80);
		System.out.println(taro.info());
		System.out.println(hana.info());
		taro.addScore(100);
		hana.addScore(-50);
		taro.addScore(90);
		hana.addScore(100);
		System.out.println(taro.info());
		System.out.println(hana.info());
	}
}
