package curriculum_C;

public class Referee {
    private int playerHand;
    private int enemyHand;
    
    public Referee(int playerHand, int enemyHand) {
        this.playerHand = playerHand;
        this.enemyHand = enemyHand;
    }

    public int getPlayerHand() {
        return playerHand;
    }
    
    public int getEnemyHand() {
        return enemyHand;
    }
    
    // ループ内でじゃんけんの手を更新するためのメソッド
    public void updateHands(int playerHand, int enemyHand) {
        this.playerHand = playerHand;
        this.enemyHand = enemyHand;
    }
    
    // 勝敗チェック
    public static int check(int pH, int eH) {
        return (pH - eH + 3) % 3;	// 2:勝ち、1:負け、0:引き分け
    }
    
    public String kachimake(int f) {
        if (f == 2) {
            return "あなたの勝ち";
        } else if (f == 1) {
            return "あなたの負け";
        } else {
            return "あいこ";
        }
    }
    
    public String hand(int h) {
        if (h == 0) {
            return "グー";
        } else if (h == 1) {
            return "チョキ";
        } else {
            return "パー";
        }
    }
    
    public void print() {
        System.out.println(String.format("\nあなたの手は%s、CPUの手は%s。%sです。\n",
                hand(playerHand),
                hand(enemyHand),
                kachimake(check(playerHand, enemyHand)) 
                ));
    }
}