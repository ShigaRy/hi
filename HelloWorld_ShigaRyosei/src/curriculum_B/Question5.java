package curriculum_B;

import java.util.Scanner;

public class Question5 {
				public static void helloWorld() {				
					//1
					//helloworldを出力
					System.out.println("Hello, World!");		
				}
				
				public static String doubleValue(int num) {		
					//2
					//入力を2倍にしてreturn
					return String.format("%d を 2倍すると %dです。",num , num * 2);		
				}
				
				public static boolean isEven(int num) {			
					//3
					//偶奇判定
					if (num % 2 == 1) {							
						return false;
					} else {
						return true;
					}
				}
			
			public static void main(String[] args) {
				//1
				helloWorld();									
				
				//2
				//scanner呼び出し
				Scanner scanner = new Scanner(System.in);
				int a = scanner.nextInt();												
				scanner.nextLine();
				
				//入力された値をdoubleValueに渡して出力
				System.out.println(doubleValue(a)); 			
				
				//3
				int num1 = 10;
				int num2 = 7;
				
				//isEvenに数を渡してtrueなら偶数、そうでは無かった場合は奇数として出力
				if (isEven(num1)) {
					System.out.println(String.format("%dは偶数です。", num1));
				}else {
					System.out.println(String.format("%dは奇数です。", num1));
				}
				
				
				if (isEven(num2)) {
					System.out.println(String.format("%dは偶数です。", num2));
				}else {
					System.out.println(String.format("%dは奇数です。", num2));
				}
				
				
				//scanner閉
				scanner.close();
			}
}

