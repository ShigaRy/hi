package curriculum_B;

import java.util.Scanner;														//scannerをimport

public class Question3 {
	public static void main(String[] args) {
		
																				//1
		for (int i = 1; i < 11; i++) {											//11未満である限りiを1ずつ増やす
			System.out.println(i);												//iを出力
		}
		
																				//2
		for (int a = 2; a < 21; a += 2) {										//21未満である限りaを2ずつ増やす
			System.out.println(a);												//aを出力
		}
		
																				//3
		for (int b = 10; b > 0; b -= 1) {										//0以上である限りbを1ずつ減らす
			System.out.println(b);												//bを出力
		}
		
																				//4
		int sum = 0;															//合計計算用の変数sumを宣言
		for (int c = 1; c < 101; c++) {											//cを1~100まで順番に増やす
			sum += c;															//sumにcを足す
		}
		System.out.println(sum);												//sumを表示
		
																				//5
		
		for (int d = 1; d < 6; d++) {											//dを1~5まで増やす
			for (int e = 1; e < d + 1; e++) {									//eをdの数まで増やす
				System.out.print("*");											//アスタリスクを出力
			}
			System.out.println("");												//改行用
		}
		
																				//6
		int f = 1;																//fをintで宣言
		
		while (f < 11) {														//fが11未満である限り続ける
			System.out.println(f);												//fを出力
			f++;																//fをインクリメント
		}
		
																				//7
		int g = 2;																//gをintで宣言
		
		while (g < 21) {														//gが21以下なら繰り返す
			System.out.println(g);												//gを表示
			g += 2;																//gを2増やす
		}
		
																				//8
		int h = 10;																//hをintで宣言
		
		while (h > 0) {															//hが0より大きいなら繰り返す
			System.out.println(h);												//hを表示
			h--;																//hをデクリメント
		}
		
																				//9
		int j = 1;																//jをintで宣言
		int sum2 = 0;															//計算用変数sum2を宣言
		
		while (j < 101) {														//jが101未満なら繰り返す
			sum2 += j;															//sum2にjを足す
			j++;																//jをインクリメント
		}
		System.out.println(sum2);
		
																				//10
		Scanner scanner = new Scanner(System.in);								//scannerのインスタンスを作成
        
		 int k = scanner.nextInt();												//ユーザーの入力を受付、kに代入
		 String reset = scanner.nextLine();										//入力リセット用
	        
	        while (k != 0) {													//kが0になるまでユーザーに入力を繰り返し要求
	        	k = scanner.nextInt();
	        }
	        
	        System.out.println("終了しました");									//終了メッセージ
        
        																		//11
        String str = "";														//出力用変数strを宣言
        for (int l = 1;l < 10; l++) {											//1~9まで繰り返し
        	for (int m = 1; m < 10; m++) {										//同様に繰り返し
        		str += String.format("||%02d * %02d = %02d", l, m, l * m);			//計算式をstrに追加
        	}
        	System.out.println(str);											//strを出力
        	str = "";															//strを初期化
        }
        
        																		//12 (10問目を消すと動きます)
        String[] o = scanner.nextLine().split("、");							//入力された文字列を区切って配列に入れる
        int olen = o.length;													//その配列の長さをintに入れる
        int[] counts = new int[7];												//残り台数用配列
        	counts[0] = (int)(Math.random() * 11 + 0);
        	counts[1] = (int)(Math.random() * 11 + 0);
        	counts[2] = (int)(Math.random() * 11 + 0);
        	counts[3] = (int)(Math.random() * 11 + 0);
        	counts[4] = (int)(Math.random() * 11 + 0);
        	counts[5] = (int)(Math.random() * 11 + 0);
        	counts[6] = 11 - counts[5];
        for (int p = 0;p < olen; p++ ) {										//入力された配列の長さまで繰り返す
        switch (o[p]) {
		case "パソコン": {
			String str2 = String.format("%sの残り台数は%d台です", o[p] ,counts[0]);		//残り台数の出力
			System.out.println(str2);
			break;
		}
		case "冷蔵庫": {
			String str3 = String.format("%sの残り台数は%d台です", o[p] ,counts[1]);
			System.out.println(str3);
			break;
		}
		case "扇風機": {
			String str4 = String.format("%sの残り台数は%d台です", o[p] ,counts[2]);
			System.out.println(str4);
			break;
		}
		case "洗濯機": {
			String str6 = String.format("%sの残り台数は%d台です", o[p] ,counts[3]);
			System.out.println(str6);
			break;
		}
		case "加湿器": {
			String str7 = String.format("%sの残り台数は%d台です", o[p] ,counts[4]);
			System.out.println(str7);
			break;
		}
		case "テレビ": {
			String str8 = String.format("%sの残り台数は%d台です", o[p] ,counts[5]);
			System.out.println(str8);
			break;
		}
		case "ディスプレイ": {
			String str9 = String.format("%sの残り台数は%d台です", o[p] ,counts[6]);
			System.out.println(str9);
			break;
		}
		default:
			String str10 = String.format("『%s』は指定の商品ではありません", o[p]);
			System.out.println(str10);
			break;
		}
       }
        scanner.close();
	}
}
