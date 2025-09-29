package curriculum_B;

import java.util.Scanner;

public class Question5 {
				public static void helloWorld() {				//1
					System.out.println("Hello, World!");		//helloworldを出力
				}
				
				public static String doubleValue(int num) {		//2
					return String.format("%d を 2倍すると %dです。",num , num * 2);		//入力を2倍にしてreturn
				}
				
				public static boolean isEven(int num) {			//3
					if (num % 2 == 1) {							//偶奇判定
						return false;
					} else {
						return true;
					}
				}
			
			public static void main(String[] args) {
				helloWorld();									//1
				
				
				Scanner scanner = new Scanner(System.in);
				int a = scanner.nextInt();												
				scanner.nextLine();
				
				System.out.println(doubleValue(a)); 			//2
				
				
				int num1 = 10;
				int num2 = 7;
				
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
				
				
				
				scanner.close();
			}
}

