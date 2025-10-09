package new4;

public class FullTimeEmployee extends Employee {
	
	private static final int HOURLY_RATE = 1200;
	
	@Override
	public int calculateDailyWage(int hoursWorked) {
		int wage = Math.max(0,hoursWorked - 8) * (HOURLY_RATE * 125 / 100) + (HOURLY_RATE * 8);
		return wage;
	}
	
	
	public FullTimeEmployee() {
		super(null, null); 
	}
	
	
	public FullTimeEmployee(String id, String name) {
		super(id,name);
	}
	
}

