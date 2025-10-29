package curriculum_C;

import java.util.Scanner;

public class Player {

    // 自分の手をユーザーに入力させる
    public int decideHand(Scanner scanner) {
        int playerHand = -1; // 初期値を無効な値にしておく
        
        // 有効な数値が入力されるまでループ
        do {
            System.out.println("あなたの手を入力してください。 (グー = 0、チョキ = 1、パー = 2)");
            
            if (scanner.hasNextInt()) {
                playerHand = scanner.nextInt();
                // 改行
                scanner.nextLine();
                
                // 範囲チェック
                if (playerHand < 0 || playerHand > 2) {
                    System.out.println("\n範囲外です。0 (グー)、1 (チョキ)、2 (パー) のいずれかを入力してください。");
                }
            } else {
                System.out.println("\n数値を入力してください。\n");
                scanner.next(); // スキップ
            }
            
        } while (playerHand < 0 || playerHand > 2);
        
        return playerHand;
    }
}