package new7;

public class Contract extends Employee {
	
	private static final int HOURLY_RATE = 1250;
	
	@Override
	//時給計算(1250/h [8時間超過分は1.25x])
	public int calculateSalary(int workTime) {
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
