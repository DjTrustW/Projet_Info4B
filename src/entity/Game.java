package entity;
import java.util.*;

public class Game extends Thread {

    private int ind = 0;
    private Player p;
    private Affichage aff;
    private Map lvl;
    private Map currentMap;
    private Function f;
    private ArrayList<Player> tabH;
    private ArrayList<Player> tabE;

    public Game(int i) {

        this.f = new Function();
        this.aff = new Affichage(this,0);
        this.lvl = f.ReadLevel("./level/level"+i+".txt");
        this.currentMap = f.ReadLevel("./level/level"+i+".txt");
        this.currentMap.setLink(this.lvl);
        int [][][] spawn = lvl.getSpawn();
        this.tabH = new ArrayList<Player>();
        this.tabE = new ArrayList<Player>();
        this.tabH.add(new Player(ind, "UwU", this.currentMap, spawn[0][0][0], spawn[0][0][1], false));
        this.ind++;

        for (int nb =1 ; i<spawn[2].length;i++){
            this.tabE.add(new Player(this.ind, ("mechant_"+this.ind), this.currentMap, spawn[1][nb][0], spawn[1][nb][1], true));
            this.ind++;
        }
        
    }

    public Map getMap(){
        return this.lvl;
    }

    public Map getcurrentMap(){
        return this.currentMap;
    }

    public Player getPlayer(int i){
        return this.tabH.get(i);
    }

    public Player getEnemie(int i){
        return this.tabE.get(i);
    }

    public void updateMap(){

        this.currentMap.setlevel(this.lvl);
        this.currentMap.addToMapCoin();

        for(int i = 0;i<this.tabE.size();i++){
            this.currentMap.setCase(this.tabE.get(i).getX(), this.tabE.get(i).getY(),5);
        }

        for(int i = 0;i<this.tabH.size();i++){
            if(this.tabH.get(i).getLife().getVieJoueur() > 0)
            this.currentMap.setCase(this.tabH.get(i).getX(), this.tabH.get(i).getY(),6);
        }
    }

    public void run() {

        aff.start();
        for(int i = 0;i<this.tabH.size();i++){
            this.tabH.get(i).start();
        }
        for(int i = 0;i<this.tabE.size();i++){
            this.tabE.get(i).start();
        }

        for(int i = 0;i<this.tabH.size();i++){
            try {
                this.tabH.get(i).join();
            } catch (Exception e) {
            }
        }

    }

}
