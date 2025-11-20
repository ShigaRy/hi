package curriculum_D;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Demon {
	String DEMON_FILE_PATH = "data/demon_status.txt"; 
    
    public Character demonStatus() {
        try {   	
        	Path path = Paths.get(DEMON_FILE_PATH);
            List<String> lines = Files.readAllLines(path);
            
            
            if (lines.size() < 4) {
                 System.err.println("ファイル " + DEMON_FILE_PATH + " の行数が4行未満です。");
                 return null;
            }
            
            try {
            	// 0行目: 名前
                String demonName = lines.get(0).trim();     
                
                //Stringをintに変換
                int demonHP  = Integer.parseInt(lines.get(1).trim()); // 1行目: HP
                int demonAT  = Integer.parseInt(lines.get(2).trim()); // 2行目: AT
                int demonSP  = Integer.parseInt(lines.get(3).trim()); // 3行目: SP
                
                // Characterオブジェクトを作成し、データを設定する
                final Character newChara = new Character(demonName, demonHP, demonAT, demonSP);
                return newChara;
            } catch (NumberFormatException nfex) {
                System.err.println(String.format("数値変換エラーが発生しました。ファイル (%s) の2～4行目を確認してください。", DEMON_FILE_PATH));
                return null;
            }
            
        } catch(IOException ioex) {
            System.err.println(String.format("ファイル読み込みエラー(%s)が発生しました。ファイルが存在するか確認してください。", DEMON_FILE_PATH));
            ioex.printStackTrace();
            return null;
        }
    }
  
}