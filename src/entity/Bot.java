package entity;

public class Bot extends Thread {

    private Player p1;
    private boolean running = true;

    public Bot(Player p){
        this.p1 = p;
    }

    public void run(){

        int dir = 0;
        int test = 9;

        while(this.running){
            if(test > 7){
                dir = ((int)(Math.random() * 4) + 1);
            }
            this.p1.move(dir);
            try {
                this.sleep(50);
            } catch (Exception e) {}
            test = ((int)(Math.random() * 10) + 1);
        }
    }
}
