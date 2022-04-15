package entity;
import java.io.*;

class Affichage extends Thread {

    private Game partie; /// lien a la partie 
    public boolean lock; /// permet de savoir si l 'affiche dois afficher'

    public Affichage(Game g){ //initialise
        this.partie = g;
        this.lock = true;
    }

    @Override
    public void run() { /// run 
        
        while(lock){
            try{
                System.out.println(this.show());
                this.sleep(50);
            } 
            catch (Exception e){}
        }
    }


    public String show(){ ///permet d afficher la map puis la vie puis le score
        
        String laMap = "";
        this.partie.updateMap();
        laMap += this.partie.getcurrentMap().affiche()+"\n"; 
        laMap += this.partie.getPlayer(this.ind).getLife().affiche()+" "+this.partie.getPlayer(this.ind).getScore().affiche();
        return laMap;
    }

}
