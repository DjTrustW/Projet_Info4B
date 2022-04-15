package entity;

public class Block extends Thread {  /// thread des blocks qui disparaise  il retienne leur position et disparaise 4s

    private int x; /// coord x 
    private int y; /// cord y 
    private static int time = 4; /// temps 
    private Map level; /// reference a la map 

    public Block(Map m,int x, int y){ // initialise

        this.x = x;
        this.y = y;
        this.level = m;

    }

    @Override
    public void run(){

        this.level.getLink().setCase(this.x,this.y,0); /// met son block a 0(vide)
        try {
            this.sleep(this.time *1000);/// sleep 4000 ms
        } catch (Exception e) {}        
        this.level.getLink().setCase(this.x,this.y,2); /// met son block a 2(brique)
    }
}