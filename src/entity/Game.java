package entity;
import java.util.*;

public class Game extends Thread {

    private int ind = 0;
    private Player p;
    private Affichage aff;
    private Map lvl;
    private Map currentMap;
    private Function f;
    private ArrayList<Player> tabP;

    public Game(int i) {

        this.f = new Function();
        this.aff = new Affichage(this);
        this.lvl = f.ReadLevel("./level/level"+i+".txt");
        this.currentMap = f.ReadLevel("./level/level"+i+".txt");
        this.currentMap.setLink(this.lvl);
        int [][][] spawn = lvl.getSpawn();
        this.tabP = new ArrayList<Player>();
        this.tabP.add(new Player(ind, "UwU", this.currentMap, spawn[0][0][0], spawn[0][0][1], false));
        this.ind++;

        for (int nb =1 ; i<spawn[2].length;i++){
            this.tabP.add(new Player(this.ind, ("mechant_"+this.ind), this.currentMap, spawn[1][nb][0], spawn[1][nb][1], true));
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
        return this.tabP.get(i);
    }

    public void updateMap(){

        this.currentMap.setlevel(this.lvl);
        this.currentMap.addToMapCoin();
        for(int i = 0;i<this.tabP.size();i++){

            if(this.tabP.get(i).isEvil())
                this.currentMap.setCase(this.tabP.get(i).getX(), this.tabP.get(i).getY(),5);
            else
                this.currentMap.setCase(this.tabP.get(i).getX(), this.tabP.get(i).getY(),6);
        }
        

    }

    public void run() {

        aff.start();
        for(int i = 0;i<this.tabP.size();i++){
            this.tabP.get(i).start();
        }

        for(int i = 0;i<this.tabP.size();i++){
            try {
                this.tabP.get(i).join();
            } catch (Exception e) {
                //TODO: handle exception
            }
        }

    }

}
