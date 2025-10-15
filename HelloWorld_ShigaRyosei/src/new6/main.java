package new6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class main {
    public static void main(String[] args) {
        // Employee型のリストとして宣言
        List<Billable> list1 = new ArrayList<Billable>();

        // サブクラスのインスタンスをBillable型のリストに追加
        list1.add(new FullTimeEmployee("F001", "山田 太郎"));
        list1.add(new ContractEmployee("C001", "佐藤 花子"));
        list1.add(new FullTimeEmployee("F002", "田中 次郎"));

        // 勤務時間
        List<Integer> hoursWorkedList = Arrays.asList(10, 8, 7);
        
        // リストをループ処理
        for (int i = 0; i < list1.size(); i++) {
        	Billable bill = list1.get(i);
            int hours = hoursWorkedList.get(i);
            
            // Billable型としてcostForDayを呼び出す
            int dailyWage = bill.costForDay(hours); 
            
            // 出力
            System.out.printf(
                "ID: %s, 名前: %s, 勤務時間: %d時間, 日当: ¥%d%n",
                bill.getId(),
                bill.getName(),
                hours,
                dailyWage
            );
        }
    }

}
