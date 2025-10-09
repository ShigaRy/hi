package new5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Employeeクラスの作成
abstract class Employee{
	protected String id;
	protected String name;
	public Employee(String id, String name) {
		this.id = id;
		this.name = name;
	}
	public abstract int calculateDailyWage(int hoursWorked);
}

//フルタイム勤務の給料計算
class FullTimeEmployee extends Employee {
	public FullTimeEmployee(String id, String name) {
			super(id, name);
		}
		@Override
		public int calculateDailyWage(int hoursWorked) {
			int hourlyRate = 1250;
			int overtime = Math.max(0, hoursWorked - 8);
			int regularHours = hoursWorked - overtime;
			return (regularHours * hourlyRate) + (int)(overtime * hourlyRate * 1.25);
		}
}

//契約社員の給料計算
class ContractEmployee extends Employee {
	public ContractEmployee(String id, String name) {
		super(id, name);
	}
		@Override
		public int calculateDailyWage(int hoursWorked) {
			int hourlyRate = 1000;
			return hoursWorked * hourlyRate;
		}
}

class Employees{
    public static void main(String[] args) {
        // Employee型のリストとして宣言
        List<Employee> list1 = new ArrayList<Employee>();

        // サブクラスのインスタンスをEmployee型のリストに追加
        list1.add(new FullTimeEmployee("F001", "山田 太郎"));
        list1.add(new ContractEmployee("C001", "佐藤 花子"));
        list1.add(new FullTimeEmployee("F002", "田中 次郎"));

        // 勤務時間
        List<Integer> hoursWorkedList = Arrays.asList(10, 8, 7);
        
        // リストをループ処理
        for (int i = 0; i < list1.size(); i++) {
            Employee emp = list1.get(i);
            int hours = hoursWorkedList.get(i);
            
            // Employee型としてcalculateDailyWageを呼び出す
            int dailyWage = emp.calculateDailyWage(hours); 
            
            // どのサブクラスのインスタンスかを実行時に判別し、適切なメソッドが実行される
            System.out.printf(
                "ID: %s, 名前: %s, 勤務時間: %d時間, 日当: ¥%d%n",
                emp.id, // protectedフィールドなのでアクセス可能
                emp.name, // protectedフィールドなのでアクセス可能
                hours,
                dailyWage
            );
        }
    }
}
