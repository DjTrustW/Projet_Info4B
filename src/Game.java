import java.util.*;

public class Game extends Thread {

    private Player p;
    private Map level;
    private Function f;

    public Game() {

        this.f = new Function();
        this.level = f.ReadLevel("./matrice.txt");
        this.p = new Player(new Command(this.level), 0);

    }

    public void run() {

        while(true){
            this.level.show();
        }
    }
}
