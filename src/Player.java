public class Player extends Thread{
    
    private Command cmd;
    private int id ;
    private int life ;

    public Player(Command c , int i){

        this.cmd = c;
        this.id = i;
    }
}
