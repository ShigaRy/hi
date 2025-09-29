package curriculum_B;

public class Main {
	public static void main(String[] args) {
		//4
		//sayHelloを呼び出す
		Greeting greeting = new Greeting();
		greeting.sayHello();
		
		//5
		Animal a = new Animal();
		
		//setterに入れる
		a.setName("ライオン");
		a.setBodyLength(2.1);
		a.setSpeed(80);
		
		//出力
		System.out.println(String.format("動物名:%s", a.getName()));
		System.out.println(String.format("体長:%.1fm", a.getBodyLength()));
		System.out.println(String.format("速さ:%dkm/h", a.getSpeed()));
	}

}