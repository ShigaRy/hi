package curriculum_C;

import java.util.Random;

public class Enemy {
	
    // ランダムな手を決める
    public int decideHand() {
        Random rand = new Random();
        // 0 (グー), 1 (チョキ), 2 (パー) のいずれかをランダムに選択
        return rand.nextInt(3); 
    }
}