package curriculum_B;

import java.util.Objects;

public class Question2 {
	
	public static void main(String[] args) {
																//1
		int score = 75;											//scoreをintで宣言。
		String result = "";										//結果出力用の変数を宣言。
		
		if (score >= 60) {										//scoreが60点以上である場合、resultに文字を代入。
			result = "合格です！";
		}  else {
			result = "";										//それ以外の場合は何も出力しない。
		}
		System.out.println(result);								//resultを表示。
		
																//2
		int age = 25;											//ageをintで宣言。
																//結果出力用の変数を宣言。
		if (age >= 20) {										//年齢が20才以上、かつ30才以下の場合にresultに文字を代入。
			result = (30>= age) ? "適正年齢です" : "対象外です";
		} else{
			result = "対象外です";								//条件に当てはまらかった場合のメッセージ。
		}
		System.out.println(result);								//結果を出力
		
																//3
		age = 18;												//ageに18を代入。
		if (age >= 20)	{										//20才以上か判定、もしそうならresultに文字列を代入。
			result = "成人です。";
		}else if (13 <= age) {									//13才以上か判定、もしそうならresultに文字列を代入。
			result = "ティーンエイジャーです";
		} else {												//条件に当てはまらかった場合のメッセージ。
			result = "子供です";
		}
		
		System.out.println(result);								//結果を出力
		
																//4
		int x = 30;												//x,y,zをそれぞれintで宣言。
		int y = 15;
		int z = 50;
		
		if (x > y) {														//xはyより大きいかを判定
			result = (x > z) ? Integer.toString(x) : Integer.toString(z);		//xとzを比較、大きいほうをresultに代入
		} 
		else {															//yのほうが大きかった場合
			result = (y > z) ? Integer.toString(y) : Integer.toString(z);		//yとzを比較、大きいほうをresultに代入
		}
		System.out.println(result);								//結果を出力
		
																//5
		int num = 20;											//numをintで宣言。
		if (num >= 0)	{										//numは0以上かを判定。
			if (num == 0) {										//0の場合は0
				result = "0です";
			}else {												//0ではない場合は自然数
					result = "正の数です";
			}
		} else {
			result = "負の数です";								//どれにも当てはまらない数は負の数になる
		}
		System.out.println(result);								//結果を出力
		
																//6
		int value = 2;											//valueをintで宣言
		int odd = value % 2;									//奇数判定用
		if (odd == 1) {											//oddが1なら奇数
			result = "奇数";
		}else {													//それ以外
			result = "偶数";
		}
		System.out.println(result);								//結果
		
																//7
		score = (int)(Math.random() * 101 + 0);						//0~100をランダムに決定
		if (score >= 90) {										//90以上か判定
			result = "優";
		}else if (score >= 70) {								//70以上か判定
			result = "良";
		}else if (score >= 50) {								//50以上か判定
			result = "可";
		}else {													//それ以外
			result = "不可";
		}
		System.out.println(result);								//結果
		
																//8
		String str = null;										//string文字列
		if (!Objects.nonNull(str)) {							//nullか判定
				result = "入力が無効です";
		}else if (str.length() == 0){							//文字列の長さを判定
			result = "入力が無効です";
		} else {												//それ以外は文字列をそのまま出力
			result = str;
		}
		System.out.println(result);								//結果
		
																//9
		int day = (int)(Math.random() * 7 + 1); 				// 1〜7のランダムな整数

		switch (day) {											//各値によって曜日を変更する
		    case 1:
		        result = "月曜日";
		        break;
		    case 2:
		        result = "火曜日";
		        break;
		    case 3:
		        result = "水曜日";
		        break;
		    case 4:
		        result = "木曜日";
		        break;
		    case 5:
		        result = "金曜日";
		        break;
		    case 6:
		        result = "土曜日";
		        break;
		    case 7:
		        result = "日曜日";
		        break;
		    default:											//例外処理
		        result = "無効な入力です";
		}
		
		System.out.println(result);								//結果
		
																//10
		int month = (int)(Math.random() * 12 + 1); 				//1～12のランダムな整数

		switch (month) {										//3か月ごとに季節を分ける
		    case 12:
		    case 1:
		    case 2:
		    	result = "冬";
		        break;
		    case 3:
		    case 4:
		    case 5:
		    	result = "春";
		        break;
		    case 6:
		    case 7:
		    case 8:
		    	result = "夏";
		        break;
		    case 9:
		    case 10:
		    case 11:
		    	result = "秋";
		        break;
		    default:
		        result = "無効な月です";
		}
		System.out.println(result);									//結果
	}
}
