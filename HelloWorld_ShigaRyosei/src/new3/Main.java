package new3;

public class Main {
	public static void main() {
	Employee e = new Employee();
	e.setEmployeeId("E002");
	e.setName("田中花子");
	System.out.println(String.format("社員ID:%s,名前:%s" , e.getEmployeeId() , e.getName()));
	}
	
	public static void main(String[] args) {
		main();
	}
}
