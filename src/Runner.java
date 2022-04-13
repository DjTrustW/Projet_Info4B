import entity.*;

public class Runner {

    public static void main(String[] args) throws InterruptedException {
        
        Game g = new Game(1);
        g.start();
        g.join();
    }
}