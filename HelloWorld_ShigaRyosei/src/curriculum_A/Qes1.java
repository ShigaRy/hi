package curriculum_A;

public class Qes1 {
	
	public static void main(String[] args) {
		//1
		byte byteNum = 0;				//byteNumをByteで宣言
		Short shortNum = 0;	//shortNumをShortで宣言
		byteNum = 10; 				//byteNumに10を代入
		shortNum = 100;				//shortNumに100を代入
		int intNum = 0;					//intNumをintで宣言&初期値設定
		long longNum = 0;				//longNumをlongで宣言&初期値設定
		float floatNum = 0.0f;				//floatNumをfloatで宣言&初期値設定
		double doubleNum = 0.0; 			//doubleNumをdoubleで宣言&初期値設定
		char letter = 0;				//letterをcharで宣言&初期値設定
		String letters = null;				//lettersをStringで宣言&初期値設定
		boolean isBoolean = false;			//isBooleanをBooleanで宣言&初期値設定
		
		//2
		byteNum = 10; 				//byteNumに10を代入
		shortNum = 100;				//shortNumに100を代入
		intNum = 1000;				//intNumに1000を代入
		longNum = 10000;			//longNumに10000を代入
		floatNum = 9.5f; 			//floatNumに9.5fを代入
		doubleNum = 10.5;			//doubleNumに10.5を代入
		letter = 'a';				//letterにaを代入
		letters = "ハロー";		//lettersにハローを代入
		isBoolean = true;			//isBooleanをtrueに変更
		
		
		String name = "山田太郎";	//nameをStringで宣言、名前を代入 問題4
		
		int age = 25;				//ageをintで宣言、年齢を代入 問題5
		
		int num1 = 10;				//num1をintで宣言、10を代入 問題6
		int num2 = 5;				//num2をintで宣言、5を代入 問題6
		int sum = num1 + num2;		//sumをintで宣言、num1とnum2を足した数を代入 問題6
		
		int score = 80;				//scoreをintで宣言、点数を代入 問題7
		
		double prise = 99.99;		//priseをdoubleで宣言、値段を代入 問題8
		
		String numStr = "123";		//numStrをStringで宣言、文字列を代入 問題9
		
		int num = 50;				//numをintで宣言、整数を代入 問題10
		
		int a = 10;					//aをintで宣言、整数を代入 問題11
		int b = 20;					//bをintで宣言、整数を代入 問題11
		boolean result;				//resultをbooleanで宣言 問題11
		
		int x = 15;					//xをintで宣言 問題12
		
		String language;			//languageをStringで宣言 問題13
		
		intNum = 1000;				//intNumに1000を代入
		longNum = 10000;			//longNumに10000を代入
		floatNum = 9.5f; 			//floatNumに9.5fを代入
		doubleNum = 10.5;			//doubleNumに10.5を代入
		letter = 'a';				//letterにaを代入
		letters = "ハロー";		//lettersにハローを代入
		isBoolean = true;			//isBooleanをtrueに変更
		
		//3
		System.out.println(byteNum + shortNum + intNum);									//10 + 100 + 10000 = 11110
		System.out.println(byteNum * 2);														//10 * 2 = 20
		System.out.println(letter + " " + letters + " " + isBoolean);						//'a' + "ハロー" + isBoolean(ture) = a ハロー true（間に半角スペースあり）
		System.out.println(byteNum + shortNum + intNum + doubleNum + floatNum);			//全ての数字を足して出力
		System.out.println(byteNum * shortNum * intNum);									//整数型を全て掛け算
		System.out.println(doubleNum / shortNum);											//10.5 / 100 = 0.105
		System.out.println(byteNum - shortNum);												//10 - 100 = -90
		
		//4
		System.out.println("こんにちは、" + name + "さん！");									//コンソールに「こんにちは{name}さん！」を表示
		
		//5
		System.out.println("年齢:" + age + "歳");												//コンソールに「年齢:{age}歳」を表示
		
		//6
		System.out.println(num1 + " + " + num2 + " = " + sum);								//コンソールに「{num1} + {num2} = {sum}」を表示
		
		//7
		System.out.println("最終スコア:" + score);												//コンソールに「最終スコア:{score}」を表示
		
		//8
		System.out.println("整数価格:" + (int)prise );											//コンソールに「整数価格:{(int)prise}」を表示
		
		//9
		System.out.println("変換後の値:" + (Integer.parseInt(numStr) + 10));					//コンソールに「変換後の値:{(int)numStr + 10}」を表示
		
		//10
		System.out.println("得点:" + Integer.toString(num) + "点");							//コンソールに「得点:{(str)num}点」を表示
		
		//11
		result = (a > b);																		//(a > b)を判定
		System.out.println(result);															//コンソールにresultを表示
		
		//12
		if (x > 10) {																			//x > 10ならOKをコンソールに表示
			System.out.println("OK");
		} else {																				//それ以外はNGをコンソールに表示
			System.out.println("NG");
		}
		
		//13]
		language = "Java";																		//languageに"Java"を代入
		System.out.println("私は{a}が好きです。{a}は楽しい！".replace("{a}", language));		//コンソールに"「私は{language}が好きです。{language}は楽しい！」を表示"															
		language = "Python";																	//languageに"Python"を代入
		System.out.println("私は{a}が好きです。{a}は楽しい！".replace("{a}", language));		//コンソールに"「私は{language}が好きです。{language}は楽しい！」を表示"
	}
}