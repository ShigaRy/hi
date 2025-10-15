package new6;

public class FullTimeEmployee extends Employee {
	
	private static final int HOURLY_RATE = 1250;
	
	@Override
	public int costForDay(int hoursWorked) {
		int wage = Math.max(0,hoursWorked - 8) * (int)(HOURLY_RATE * 1.25) + (HOURLY_RATE * 8);
		return wage;
	}
	
	
	public FullTimeEmployee() {
		super(null, null); 
	}
	
	
	public FullTimeEmployee(String id, String name) {
		super(id,name);
	}
	
}
