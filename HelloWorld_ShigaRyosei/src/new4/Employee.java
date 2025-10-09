package new4;

abstract class Employee {
		String employeeId;
		String name;
		
		public Employee(String id, String name) {
			this.employeeId = id;
			this.name = name;
		}
		
		
		public String getEmployeeId() {
			return employeeId;
		}
		
		
		public String getName() {
			return name;
		}
		
		
		public int calculateDailyWage(int hoursWorked) {
			return 0;
		}
}
