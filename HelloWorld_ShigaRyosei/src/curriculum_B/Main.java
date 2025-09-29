package curriculum_B;

public class Main {
	public static void main(String[] args) {
		Greeting greeting = new Greeting();
		greeting.sayHello();
		
		Animal a = new Animal("",0,0);
		
		a.setName("ライオン");
		a.setBodyLength(2.1);
		a.setSpeed(80);
		System.out.println(String.format("動物名:%s", a.getName()));
		System.out.println(String.format("体長:%.1fm", a.getBodyLength()));
		System.out.println(String.format("名前:%dkm/h", a.getSpeed()));
	}

}