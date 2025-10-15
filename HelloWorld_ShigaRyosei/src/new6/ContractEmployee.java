package new6;

public class ContractEmployee extends Employee {
	
	private static final int HOURLY_RATE = 1000;
	
	@Override
	public int costForDay(int hoursWorked) {
		int wage = (HOURLY_RATE * hoursWorked);
		return wage;
	}
	
	public ContractEmployee() {
		super(null,null);
	}
	
	public ContractEmployee(String id, String name) {
		super(id,name);
	}
	
}