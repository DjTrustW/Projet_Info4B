package entity;
import java.io.*;


class Affichage extends Thread {

    private Game partie;
    private int ind;
    public boolean lock;

    public Affichage(Game g,int i){
        this.partie = g;
        this.lock = true;
        this.ind = i;
    }

    public void run() {
        
        while(lock){
            try{
                System.out.println(this.show());
                this.sleep(50);
            } 
            catch (Exception e){e.printStackTrace();}
        }
    }


    public String show()throws IOException{
        
        String laMap = "";
        this.partie.updateMap();
        laMap += this.partie.getcurrentMap().affiche()+"\n"; 
        laMap += this.partie.getPlayer(this.ind).getLife().affiche()+" "+this.partie.getPlayer(this.ind).getScore().affiche();
        return laMap;
    }

    

}
