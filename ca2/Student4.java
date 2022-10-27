/**
 * 
 */
package ca2;

/**
 * @author b1021042 YumaSakai
 *
 */
public class Student4 {
	String name;
	int id;
	int score;
	
	Student4(String nameX, int idX){
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
	
	public String course(){
		switch(id/100) {
		case 1:
			return "II";
		case 2:
			return "CS";
		default:
			return "それ以外";
		}
	}
	
	public static void main(String[] args) {
		Student4 taro = new Student4("Mirai Taro", 100);
		Student4 hana = new Student4("Future Hana", 201);
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
		Student4 shiro = new Student4("Shiro the Dog", 901);
		System.out.println(taro.toString() + ", 学科は" + taro.course());
		System.out.println(hana.toString() + ", 学科は" + hana.course());
		System.out.println(shiro.toString() + ", 学科は" + shiro.course());
	}
}
