package curriculum_D;

import java.util.Random;
import java.util.Scanner;

public class Player {
		public static Character playerStatus(Scanner scanner) {
			Random rand = new Random();
			String NAME = scanner.nextLine();
			int HP = rand.nextInt(200) + 1;
			int AT = rand.nextInt(100) + 1;
			int SP = rand.nextInt(50) + 1;
			
			Character player = new Character(NAME,HP,AT,SP);
			return player;
		}
}
