package new4;

public class Main {
	public static void main(int hour,String[] args) {
		FullTimeEmployee fte = new FullTimeEmployee();
		PartTimeEmployee pte = new PartTimeEmployee();
		System.out.println(String.format("正社員の給与:%s円",fte.calculateDailyWage(hour)));
		System.out.println(String.format("パート社員の給与:%s円",pte.calculateDailyWage(hour)));
	}
}
