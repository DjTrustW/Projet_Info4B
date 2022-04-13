package entity;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;

public class Player extends Thread {

    private Command cmd;
    private String name;
    private Map map;
    private int ind;
    private Vie life;
    private Points score;
    private int x=1, y=1;

    public Player(int i, String name, Map m) {

        Frame f = new Frame("Demo");
        f.setLayout(new FlowLayout());
        f.setSize(100, 100);
        Label l = new Label();
        l.setText("This is a Game");
        f.add(l);
        f.setVisible(true);

        this.map = m;
        this.ind = i;
        this.cmd = new Command(this);
        f.addKeyListener(this.cmd);
        this.life = new Vie(5);
        this.score = new Points();
    }

    public void setCommand(Command c) {
        this.cmd = c;
    }

    public Command getCommand() {
        return this.cmd;
    }

    public void setInd(int i) {
        this.ind = i;
    }

    public int getInd() {
        return this.ind;
    }

    public void setname(String name) {
        this.name = name;
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

    public synchronized void move(int dir) {

            /*if(map.getCase(x , y)  == 0 && map.getCase(x, y-1 ) == 0 && map.getCase(x, y+1) != 3){
                y--;
                move(4);
            }

            else{*/
            switch (dir) {

                case 1:///s
                    if (canMove(3)) {
                        System.out.println("x+");
                        this.x++;

                    }
                    break;

                case 2:///z
                    if (canMove(4)) {
                        System.out.println("x-");
                        this.x--;

                    }
                    break;

                case 3:///d
                    if (canMove(1)) {
                        System.out.println("y+");
                        this.y++;

                    }
                    break;
                case 4:///q
                    if (canMove(2)) {
                        System.out.println("y-");
                        this.y--;

                    }
                    break;

                default:
                    break;
            }
        }
    ///}

    public boolean canMove(int i) {

        switch (i) {

            case 1://d
                if (this.y < 19 && (map.getCase(x , y+1) == 0 || map.getCase(x , y+1) == 3 || map.getCase(x , y+1) == 7))
                    return true;

            case 2://q
                if (this.y >= 0 && (map.getCase(x , y-1) == 0 || map.getCase(x , y-1) == 3 || map.getCase(x , y-1) == 7))
                    return true;

            case 3://s
                if (this.x >=0 && (map.getCase(x+1, y) == 3))
                    return true;

            case 4://z
                if ( this.x <79 && (map.getCase(x-1, y) == 0 || map.getCase(x-1, y) == 3))
                    return true;

            default:
                break;
        }
        return false;
    }
}
