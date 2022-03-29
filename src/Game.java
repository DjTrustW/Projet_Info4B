import java.util.*;

public class Game extends Thread {

    private ArrayList<Player> List_player;
    //private ArrayList<Enemy> list_Enemy;
    private Map level;
    private Function f;

    public Game() {

        this.f = new Function();
        this.level = f.ReadLevel("./matrice.txt");
        this.List_player.add(new Player(new Command(this.level), 0));

    }

    public void run() {

        while(true){
            this.level.show();
        }
    }
}
