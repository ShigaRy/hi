package new2;

public class Employee {
		String employeeId;
		String name;
		
		public Employee() {
			
		}
		
		public String getEmployeeId(String employeeId) {
			return employeeId;
		}
		
		public String getName() {
			return name;
		}
		
		public void showInfo() {
			System.out.println(String.format("社員ID:%s,名前:%s" , employeeId , name));
		}
		
}
