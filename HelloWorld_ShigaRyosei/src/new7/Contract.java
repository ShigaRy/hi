package new7;

public class Contract extends Employee {
	
	private static final int HOURLY_RATE = 1000;
	
	@Override
	//時給計算(1000/h)
	public int CalculateSalary(int workTime) {
		int wage = HOURLY_RATE * workTime;
		return wage;
	}
	
	
	public Contract() {
		super(null, null);
	}
	
	
	public Contract(String type, String name) {
		super(type,name);
	}

}
