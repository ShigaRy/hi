package new7;

public class FullTime extends Employee {
	
	private static final int HOURLY_RATE = 1200;
	
	@Override
	//時給計算(1250/h [8時間超過分は1.25x])
	public int CalculateSalary(int workTime) {
		int wage;
		if (workTime > 8) {
			wage = Math.max(0,workTime - 8) * (int)(HOURLY_RATE * 1.25) + (HOURLY_RATE * 8);
		} 
		else{
			wage = (HOURLY_RATE * workTime);
		}
		return wage;
	}
	
	
	public FullTime() {
		super(null, null); 
	}
	
	
	public FullTime(String type, String name) {
		super(type, name);
	}
	
}

