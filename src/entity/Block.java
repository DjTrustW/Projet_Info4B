package entity;

public class Block extends Thread {

    private int x;
    private int y;
    private static int time = 4;
    private Map level;

    public Block(Map m,int x, int y){

        this.x = x;
        this.y = y;
        this.level = m;

    }

    public void run(){

        this.level.getLink().setCase(this.x,this.y,0);
        try {
            this.sleep(this.time *1000);
        } catch (Exception e) {}        
        this.level.getLink().setCase(this.x,this.y,2);
    }
}