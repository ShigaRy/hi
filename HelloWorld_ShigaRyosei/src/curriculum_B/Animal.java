package curriculum_B;

public class Animal {
	//5
	//名前、体長、速さを宣言
	private String name;
	private double bodyLength;
	private int speed;
	
	//コンストラクタ
	Animal(String name, double bodyLength , int speed){
		this.name = name;
		this.bodyLength = bodyLength;
		this.speed = speed;
	}
	//getter
	public String getName() {
		return name;
	}
	public double getBodyLength() {
		return bodyLength;
	}
	public int getSpeed() {
		return speed;
	}
	
	//setter
	public void setName(String name) {
		this.name = name;
	}
	public void setBodyLength(double bodyLength) {
		if (bodyLength > 0.0) {
			this.bodyLength = bodyLength;
		}
	}
	public void setSpeed(int speed) {
		if (speed > 0) {
			this.speed = speed;
		}
	}
}
