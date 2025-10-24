package new7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
	    public static void main(String[] args) {
	        // Employee型のリストとして宣言
	        List<CalclateSalary> list1 = new ArrayList<CalclateSalary>();

	        // サブクラスのインスタンスをcalculateSalary型のリストに追加
	        list1.add(new FullTime("F001", "山田 太郎"));
	        list1.add(new Contract("C001", "佐藤 花子"));
	        list1.add(new FullTime("F002", "田中 次郎"));

	        // 勤務時間
	        List<Integer> hoursWorkedList = Arrays.asList(10, 8, 7);
	        
	        // リストをループ処理
	        for (int i = 0; i < list1.size(); i++) {
	        	CalclateSalary cs = list1.get(i);
	            int hours = hoursWorkedList.get(i);
	            
	            // calculateSalary型としてcostForDayを呼び出す
	            int dailyWage = cs.CalculateSalary(hours); 
	            
	            // 出力
	            System.out.printf(
	                "%sの給料は%d円%n",
	                cs.getName(),
	                dailyWage
	            );
	        }
	    }
}
