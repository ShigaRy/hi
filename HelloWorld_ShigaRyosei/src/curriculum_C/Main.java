package curriculum_C;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Player player = new Player();
		Enemy enemy = new Enemy();
		Referee referee = new Referee(0, 0); 
		
		// Scannerをループの外で開く
		Scanner scanner = new Scanner(System.in);
		int result;

		System.out.println("----------------------\n");
		
		// 勝つまで（resultが2になるまで）ループ
		do {
            // Player.decideHand()が有効な入力を強制する
            int playerHand = player.decideHand(scanner);
            int enemyHand = enemy.decideHand();

            referee.updateHands(playerHand, enemyHand);
            
            result = Referee.check(playerHand, enemyHand);
            
            referee.print();
            
		} while (result != 2);
		
		scanner.close();
	}
}