package new4;

public class PartTimeEmployee extends Employee {
	
	private static final int HOURLY_RATE = 1000;
	
	@Override
	public int calculateDailyWage(int hoursWorked) {
		int wage = (HOURLY_RATE * hoursWorked);
		return wage;
	}
	
	public PartTimeEmployee() {
		super(null,null);
	}
	
	public PartTimeEmployee(String id, String name) {
		super(id,name);
	}
	
}
