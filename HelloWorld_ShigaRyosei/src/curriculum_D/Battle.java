package curriculum_D;

import java.io.FileWriter; // ファイル書き込み用
import java.io.IOException; // 例外処理用
import java.io.PrintWriter; // ファイルにテキストを出力用
import java.util.Scanner;

public class Battle {

	private Scanner scanner;
    private Character player;
    
	boolean isPlayerIsAttacker = false;
    

    public Battle(Scanner scanner, Character player) {
        this.scanner = scanner;
        this.player = player;
    }
	

    public void startGame(Character demon) {
        // PrintWriterを初期化
        PrintWriter writer = null;
        
        try {
        	String OUTPUT_FILENAME = "data/battle_log";
            writer = new PrintWriter(new FileWriter(OUTPUT_FILENAME)); 

            writer.println("バトル開始─────────");
            writer.println(String.format("%s (攻撃力:%d　体力:%d)",player.getName() , player.getAT(), player.getHP()));
            writer.println("VS");
            writer.println(String.format("%s (攻撃力:%d　体力:%d)",demon.getName() , demon.getAT(), demon.getHP()));
            writer.println("-----------------");

            int pHP = player.getHP();
            int dHP = demon.getHP();
            int turn = 1; //ターンカウント用
            
            // 素早さ判定
            if (player.getSP() >= demon.getSP()) {
                isPlayerIsAttacker = true;
                writer.println(player.getName() + "が先攻！");
            } else {
                writer.println(demon.getName() + "が先攻！");
            }
            writer.println("-----------------");

            do {
            	//先攻後攻をフラグ管理
                if (isPlayerIsAttacker) {
                    dHP = dHP - player.getAT();
                    dHP = Math.max(0, dHP); // HPの最小値は0
                    
                    writer.println(turn + "ターン目");
                    writer.println(player.getName() + "の攻撃");
                    writer.println(demon.getName() + "に" + player.getAT() + "ダメージ 残りHP: " + dHP);
                    
                    turn++;
                    isPlayerIsAttacker = false;
                } else {
                    pHP = pHP - demon.getAT();
                    pHP = Math.max(0, pHP);
                    
                    writer.println(turn + "ターン目");
                    writer.println(demon.getName() + "の攻撃");
                    writer.println(player.getName() + "に" + demon.getAT() + "ダメージ 残りHP: " + pHP);
                    
                    turn++;
                    isPlayerIsAttacker = true;
                }
                writer.println("---");
            } while(pHP >= 1 && dHP >= 1);
            
            // 勝利判定の出力
            writer.println("--- バトル終了 ---");
            if (pHP > 0) {
                writer.println(player.getName() + "の勝利！");
            } else {
                writer.println(demon.getName() + "の勝利...");
            }
            writer.println("-----------------");
            
            // コンソールにファイルに出力したことを通知
            System.out.println("バトルログを「" + OUTPUT_FILENAME + "」に出力しました。");

        } catch (IOException e) {
            // ファイルの書き込みに失敗した場合のエラー処理
            System.err.println("ファイルへの書き込み中にエラーが発生しました: " + e.getMessage());
        } finally {
            // PrintWriter閉じ
            if (writer != null) {
                writer.close();
            }
        }
    	}
    }