package entity;

public class Game extends Thread {

    private Player p;
    private Affichage aff;
    private Map lvl;
    private Map currentMap;
    private Function f;

    public Game(int i) {

        this.f = new Function();
        this.aff = new Affichage(this);
        this.lvl = f.ReadLevel("./level/level"+i+".txt");
        this.currentMap = f.ReadLevel("./level/level"+i+".txt");
        this.currentMap.setLink(this.lvl);
        int [][][] spawn = lvl.getSpawn();
        this.p = new Player(0, "UwU", this.currentMap, spawn[0][0][0], spawn[0][0][1], false);
    }

    public Map getMap(){
        return this.lvl;
    }

    public Map getcurrentMap(){
        return this.currentMap;
    }

    public Player getPlayer(){
        return this.p;
    }

    public void updateMap(){

        this.currentMap.setlevel(this.lvl);
        this.currentMap.addToMapCoin();
        this.currentMap.setCase(p.getX(), p.getY(),6);

    }

    public void run() {

        aff.start();
        p.start();

        while(p.getLife().getVieJoueur() > 0){
            
        }
    }
}
