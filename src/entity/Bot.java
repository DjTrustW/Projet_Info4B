package entity;

public class Bot extends Thread { /// permet au bot de ce deplacer aléatoirement

    private Player p1;/// reference au joueur 
    private boolean running = true; /// boolean pour dire si il dois bouger

    public Bot(Player p){ /// initialise
        this.p1 = p;
    }

    public void run(){ ///run 

        int dir = 0;
        int test = 9;

        while(this.running){
            if(test > 8){
                dir = ((int)(Math.random() * 4) + 1); ///a 1/10 de changer de direction
            }
            this.p1.move(dir);  /// bouge dans la direction enregistrer
            try {
                this.sleep(100); /// sleep
            } catch (Exception e) {}
            test = ((int)(Math.random() * 10) + 1); /// regenere un nombre aleaatoire
        }
    }
}
