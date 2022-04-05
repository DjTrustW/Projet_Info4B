import java.util.*;
import java.io.*;


class Affichage extends Thread {

    private Map mapHere;
    private Vie vieJoueur;
    private Points pointsJoueur;
    public boolean lock;

    public Affichage(Map mapHere,Vie vieJoueur,Points pointsJoueur)
    {
        this.mapHere = mapHere;
        this.vieJoueur= vieJoueur;
        this.pointsJoueur=pointsJoueur;
        this.lock = true;
    }

    public void run() {
        
        while(lock)
        {
            try
            {
                System.out.println(this.show());
                this.sleep(1000);
            } 
            catch (Exception e){e.printStackTrace();}
        }
    }


    public String show()throws IOException{
        
        String laMap = "";
        laMap += this.mapHere.affiche()+"\n"; 
        laMap += this.vieJoueur.affiche()+" "+this.pointsJoueur.affiche();

        return laMap;
    }

    

}
