public class Player extends Thread {

    private Command cmd;
    private int ind;
    private int life = 3;
    private int score = 0;
    private int x, y;

    public Player(Command c, int i) {

        this.cmd = c;
        this.ind = i;
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

    public void setLife(int i) {
        this.life = i;
    }

    public int getLife() {
        return this.life;
    }

    public void setScore(int s) {
        this.score = s;
    }

    public int getScore() {
        return this.score;
    }

    public void addScore(int i) {
        this.setScore(this.getScore() + i);
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

    public void move(int dir, Map m) {

        switch (dir) {

            case 1:
                if (canMove(m, 1)) {
                    this.x++;
                }
                break;

            case 2:
                if (canMove(m, 2)) {
                    this.x--;
                }
                break;

            case 3:
                if (canMove(m, 3)) {
                    this.y++;
                }
                break;
            case 4:
                if (canMove(m, 4)) {
                    this.y--;
                }
                break;

            default:
                break;
        }
    }

    public boolean canMove(Map m, int i) {

        int tab[][] = m.getLevel();
          
        return true;

    }
}
