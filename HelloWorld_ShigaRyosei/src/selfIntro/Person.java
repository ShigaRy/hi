package selfIntro;

public class Person{
	// インスタンスフィールドを定義
	String name;
	int age;
	double height;
	double weight;
	
	//人数カウント用変数
	private static int count = 0;
	
	// コンストラクタを定義しインスタンスフィールドに値をセット
	 Person(String name, int age, double height, double weight){
		  this.name = name;
		  this.age = age;
		  this.height = height;
		  this.weight = weight;
		  //インスタンスがリセットされるごとにcountをインクリメント
		  count++;
	 }
	 
	 //BMI計算
	 public double bmi(double ht,double wt) {
		 //BMI = (身長 / 体重²)
		 return wt / Math.pow(ht, 2);
	 }
	 
	 //出力
	 public void print() {
		 System.out.println(String.format("名前は%sです", this.name));
		 System.out.println(String.format("年齢は%sです", this.age));
		 System.out.println(String.format("BMIは%.2fです", bmi(this.height, this.weight)));
		 System.out.println(String.format("人数は%d人です", count));
	 }
	 
	}
	
