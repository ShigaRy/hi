package New;

public class Employee {
	//名前フィールドを設定
	String name;
	int age;
	
	
	//コンストラクタ
	public Employee() {
		
	}
	
	
	public String getName() {
		return name;
	}
	
	
	public void work() {
		System.out.println(String.format("%sは働いています。", name));
	}
}
