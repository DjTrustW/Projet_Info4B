package entity;
import java.util.*;
import reseau.*;

public class Game extends Thread {

    private int ind_incr = 0;
    private Player p;
    private Affichage aff;
    private Map lvl;
    private Map currentMap;
    private Function f;
    private ArrayList<Player> tabH;
    private ArrayList<Player> tabE;
    private Serveur s;

    public Game(int i,String name) {///Mode solo

        this.f = new Function();
        this.aff = new Affichage(this,0);
        this.lvl = f.ReadLevel("./level/level"+i+".txt");
        this.currentMap = f.ReadLevel("./level/level"+i+".txt");
        this.currentMap.setLink(this.lvl);
        int [][][] spawn = lvl.getSpawn();
        this.tabH = new ArrayList<Player>();
        this.tabE = new ArrayList<Player>();
        this.tabH.add(new Player(ind_incr, name, this.currentMap, spawn[0][0][0], spawn[0][0][1], false,false));
        this.ind_incr++;

        for (int nb =1 ; i<spawn[2].length;i++){
            this.tabE.add(new Player(this.ind_incr, ("mechant_"+this.ind_incr), this.currentMap, spawn[1][nb][0], spawn[1][nb][1], true,false));
            this.ind_incr++;
        }
        
    }

    public Game (int i,String name ,int mode ,Serveur s){///Mode Multi

        this.f = new Function();
        this.aff = new Affichage(this,0);
        this.lvl = f.ReadLevel("./level/level"+i+".txt");
        this.currentMap = f.ReadLevel("./level/level"+i+".txt");
        this.currentMap.setLink(this.lvl);
        int [][][] spawn = lvl.getSpawn();
        this.tabH = new ArrayList<Player>();
        this.tabE = new ArrayList<Player>();

        switch (((int)(Math.random()*4)+1)) {

            case 1:
                this.tabH.add(new Player(ind_incr, this.s.getPrintWriter()[i], this.currentMap, spawn[0][0][0], spawn[0][0][1], true,false));
                break;

            case 2:
                this.tabH.add(new Player(ind_incr, this.s.getPrintWriter()[i], this.currentMap, spawn[0][0][0], spawn[0][0][1], false,false));
                break;
        }

    }

    public Map getMap(){ // retourne la map d origine
        return this.lvl;
    }

    public Map getcurrentMap(){ // retourne la map (courante)
        return this.currentMap;
    }

    public Player getPlayer(int i){ // retourne le joueur i
        return this.tabH.get(i);
    }

    public Player getEnemie(int i){// retour l enemi i
        return this.tabE.get(i);
    }

    public void updateMap(){ // permet de netoyer la map 

        this.currentMap.setlevel(this.lvl); //
        this.currentMap.addToMapCoin();
        if(this.tabH.get(0).getScore().getPointsJoueur() == 100){
            
        }

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
        aff.lock = false;

    }

}
