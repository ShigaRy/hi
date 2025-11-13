package curriculum_D;

public class Character {
    private String name;
    private int hp; 
    private int at; 
    private int sp; 

    public Character(String name, int HP, int AT, int SP) {
        this.name = name;
        this.hp = HP; 
        this.at = AT;
        this.sp = SP;
    }


    public String getName() { return name; }
    public int getHP() { return hp; } 
    public int getAT() { return at; } 
    public int getSP() { return sp; } 
}