package new6;

public class FullTimeEmployee extends Employee {
	
	private static final int HOURLY_RATE = 1250;
	
	@Override
	//時給計算(1250/h [8時間超過分は1.25x])
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
