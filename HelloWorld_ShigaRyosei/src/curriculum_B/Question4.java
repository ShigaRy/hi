package curriculum_B;

import java.util.Scanner;

public class Question4 {
	
	public static int[] maxMin(int[] arrays) {
		int c = 0;
		int d = arrays[0];
		for (int i: arrays) {													
			if (c < i) {													//現在の最大値より新しく入力された値が大きければ最大値を更新
				c = i;
			}else if (d > i) {												//最大値ではなかった場合、最小値を検証
				d = i;
			}
		}
		int[] result = {c , d};
		return result;
	}
	public static void main(String[] args) {
		
																			//1
		int[] hairetsu = { 1, 2, 3, 4, 5};
		for (int i: hairetsu) {												//配列内の各要素を表示
			System.out.println(i);
		}
		
																			//2
		int[] hairet = { 10, 20, 30, 40, 50};
		int a = hairet.length - 1;
		for (int i = 0; a >= i; i++) {
			System.out.println(hairet[a - i]);								//配列の長さ - 繰り返し回数を引くことで逆順で配列を表示
		}
		
																			//3
		int[] haire = {3, 5, 7, 9, 11};
		int b = 0;
		for (int i: haire) {												//各要素をbに足す
			b += i;
		}
		System.out.println(b);
		
																			//4
		int[] hair = {12, 7, 9, 21, 5, 18};
		int[] r = maxMin(hair);												//7行目のメソッドを使用
		String e = String.format("最大値:%d , 最小値:%d", r[0] , r[1]);		//最大値最小値を表示
		System.out.println(e);
		
																			//5
		for (int i: hairetsu) {												//7行目から配列を流用
			System.out.println(i * 2);										//各要素に2をかけて表示
		}
		
																			//6
		int[] hai = {4, 7, 10, 15, 20};
		boolean isInclude = false;											//含まれていたかを判別するフラグ
		Scanner scanner = new Scanner(System.in);
        
		int f = scanner.nextInt();												
		scanner.nextLine();
		scanner.close();
		
		for (int i: hai) {
			if (i == f) {
				isInclude = true;											//おなじ数字があったらフラグを立てる
			}
		}
		 if (isInclude) {													//フラグが経っているかどうか
			 System.out.println( String.format("%dは配列に含まれています", f) );
		 } else {
			 System.out.println( String.format("%dは配列に含まれていません", f) );
		 }
		 
		 																	//7
		 int[][] array = {
				 {1, 2}, 
				 {3, 4}, 
				 {5, 6}
				 };
		 
		 for (int i = 0; i < array.length; i++) {							//行列処理
			 for (int j = 0; j < array[i].length; j++) {
				 System.out.println(array[i][j] + " ");
			 }
		 }
		 
		 																	//8
		 int[][] array10 = {{10, 20, 30}, {40, 50, 60}, {70, 80, 90}};
		 int g = 0;															//合計計算用変数
		 
		 for (int i = 0; i < array10.length; i++) {
			 for (int j = 0; j < array10[i].length ; j++) {
				 g += array10[i][j];										//計算用の変数に各要素を足す
			 } 
		 }
		 System.out.println(g);	
		 
		 																	//9
		 int[][] array2 = {{12, 15, 8}, {6, 19, 25}, {30, 2, 10}};
		 int[] s = new int [array2.length * array2[0].length];				//1次元配列に変換する為の変数を宣言
		 int t = 0;															//カウント用
		 
		 for (int i = 0; i < array2.length; i++) {							//各行列から要素を一次元配列に入れる
			 for (int j = 0; j < array2[i].length ; j++) {
				s[t] = array2[i][j];
				t += 1;
			 }
			 
		 }
		 
		 int[] p = maxMin(s);												//問4と同じメソッド
		 
		 String o = String.format("最大値:%d , 最小値:%d", p[0] , p[1]);
		 System.out.println(o);
		 
		 																	//10
		 int[][][] array3 = {{{1, 2}, {3, 4}}, {{5, 6}, {7, 8}}};
		 
		 for (int i = 0; i < array3.length; i++) {							//3次元の行列処理
			 for (int j = 0; j < array3[i].length; j++) {
				 for (int k = 0; k < array3[i][j].length ; k++) {
				 System.out.println(array3[i][j][k] + " ");
				 }
			 }
		 }
		 
		 scanner.close();
	}
}
