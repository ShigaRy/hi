package curriculum_D;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Demon demon = new Demon();
		Battle battle = new Battle(scanner, Player.playerStatus(scanner));
		try {
			battle.startGame(demon.demonStatus());
		} catch (Exception e) {
			e.printStackTrace();
		}
		}
	}
