package entity;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;

public class Player extends Thread {

    private Command cmd;
    final private String name;
    private Map map;
    final private int ind;
    private Vie life;
    private Points score;
    private int x, y ;
    private int x_spawn, y_spawn;
    final private boolean evil;

    public Player(int i, String n, Map m,int x,int y,boolean evil) {

        Frame f = new Frame("Demo");
        f.setLayout(new FlowLayout());
        f.setSize(100, 100);
        Label l = new Label();
        l.setText(n);
        f.add(l);
        f.setVisible(true);

        this.map = m;
        this.name = n;
        this.ind = i;
        this.cmd = new Command(this);
        f.addKeyListener(this.cmd);
        this.life = new Vie(5 );
        this.score = new Points();
        this.x = this.x_spawn = x;
        this.y = this.y_spawn = y;
        this.evil = evil;
    }

    public void setCommand(Command c) {
        this.cmd = c;
    }

    public Command getCommand() {
        return this.cmd;
    } 

    public int getInd() {
        return this.ind;
    }

    public String getname() {
        return this.name;
    }

    public void setLife(int i) {
        this.life.setVieJoueur(i);
        ;
    }

    public Vie getLife() {
        return this.life;
    }

    public void setScore(int s) {
        this.score.setPointsJoueur(s);
        ;
    }

    public Points getScore() {
        return this.score;
    }

    public void addScore(int i) {
        this.score.addPointsJoueur(i);
    }

    public void setX(int i) {
        this.x = i;
    }

    public int getX() {
        return this.x;
    }

    public void setY(int i) {
        this.y = i;
    }

    public int getY() {
        return this.y;
    }

    public boolean isEvil(){
        return this.evil;
    }

    public void setSpawn(int x,int y){
        this.x_spawn = x;
        this.y_spawn = y;
    }

    public int[] getSpawn(){
        int [] slt =  {this.x_spawn,this.y_spawn};
        return slt;
    }

    public synchronized void fall(){
        if ((map.getCase(x, y) == 0|| map.getCase(x , y) == 4)  && (map.getCase(x + 1, y) == 0 || map.getCase(x + 1, y) == 4) && map.getCase(x - 1, y) != 4) {
            x++;
            fall();
        }
        else{
            try {
                this.cmd.notify();
            } catch (Exception e) {}
        
        }
    }

    public synchronized void move(int dir) {

        if (!(map.getCase(x, y) == 0 && map.getCase(x + 1, y) == 0 && map.getCase(x - 1, y) != 4)) {

            switch (dir) {

                case 1:/// s
                    if (canMove(3)) {
                        this.x++;
                    }
                    break;

                case 2:/// z
                    if (canMove(4)) {
                        this.x--;

                    }
                    break;

                case 3:/// d
                    if (canMove(1)) {
                        this.y++;
                        }

                    
                    break;
                case 4:/// q
                    if (canMove(2)) {
                        this.y--;
                    }
                    break;

                default:
                    break;

            }
            try {
                this.cmd.wait();
            } catch (Exception e) {
            }
            fall();
            try {
                this.cmd.notify();
            } catch (Exception e) {
            }
            
            if (!isEvil() && map.getCase(this.x, this.y) == 7){
                addScore(10);
                this.map.delToMapCoin(this.x,this.y);
            }

            if (!isEvil() && map.getCase(this.x, this.y) == 5){
                this.life.toucheEnnemi();
                this.x = this.x_spawn;
                this.y = this.y_spawn;
            }
        }
    }

    public boolean canMove(int i) {

        switch (i) {

            case 1:// d
                if (this.y < 79 && (map.getCase(x, y + 1) == 0 || map.getCase(x, y + 1) == 3 || map.getCase(x, y + 1) == 7 || map.getCase(x, y + 1) == 5))
                    return true;
                break;

            case 2:// q
                if (this.y >= 0 && (map.getCase(x, y - 1) == 0 || map.getCase(x, y - 1) == 3 || map.getCase(x, y - 1) == 7 ||map.getCase(x, y - 1) == 5))
                    return true;
                break;

            case 3:// s
                if (this.x < 19 && (map.getCase(x + 1, y) == 3 || map.getCase(x + 1, y ) == 5 || (map.getCase(x - 1, y ) == 4 && !(map.getCase(x+1, y ) == 1 || map.getCase(x+1, y ) == 2))))
                    return true;
                break;

            case 4:// z
                if (this.x >= 0 && (map.getCase(x - 1, y) == 3|| map.getCase(x -1, y ) == 5))
                    return true;
                break;
        }
        return false;
    }

    public void delBlock(int i){

        if (i == 1){

            if (!isEvil() && this.map.getCase(x,y+1) == 2){
                Block b = new Block(this.map, this.x, this.y+1);
                b.start();
            }
            
            if (!isEvil() && this.map.getCase(x+1,y+1) == 2){
                Block b = new Block(this.map, this.x+1, this.y+1);
                b.start();
            }

        }

        else{

            if (!isEvil() && this.map.getCase(x,y-1) == 2){
                Block b = new Block(this.map, this.x, this.y-1);
                b.start();
            }

            if (!isEvil() && this.map.getCase(x+1,y-1) == 2){
                Block b = new Block(this.map, this.x+1, this.y-1);
                b.start();
            }

        }
    }

    public void run(){
        try {
            this.cmd=null;
        } catch (Exception e) {}
    }
}