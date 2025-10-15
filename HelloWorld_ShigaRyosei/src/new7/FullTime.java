package new7;

public class FullTime extends Employee {
	
	private static final int HOURLY_RATE = 1250;
	
	@Override
	//時給計算(1250/h [8時間超過分は1.25x])
	public int calculateSalary(int workTime) {
		int wage = Math.max(0,workTime - 8) * (int)(HOURLY_RATE * 1.25) + (HOURLY_RATE * 8);
		return wage;
	}
	
	
	public FullTime() {
		super(null, null); 
	}
	
	
	public FullTime(String type, String name) {
		super(type, name);
	}
	
}

