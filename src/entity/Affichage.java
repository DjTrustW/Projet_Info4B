package entity;
import java.io.*;


class Affichage extends Thread {

    private Game partie;
    public boolean lock;

    public Affichage(Game g)
    {
        this.partie = g;
        this.lock = true;
    }

    public void run() {
        
        while(lock)
        {
            try
            {
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
        laMap += this.partie.getPlayer(0).getLife().affiche()+" "+this.partie.getPlayer(0).getScore().affiche();
        return laMap;
    }

    

}
