import java.util.*;
import java.io.*;

public class Map {
    
    private int[][] map;

    public Map(int tab[][]){
        this.map = tab;
    }

    public Map(int x,int y){
        this.map = new int[x][y];
    }

    public Map(String emplacementLevel)throws IOException{
        BufferedReader matrice = new BufferedReader(new FileReader(emplacementLevel));
        this.map = new int[20][80];

        for(int i=0;i<20;i++)
        {
            String st1 = matrice.readLine();
            for(int j = 0;j<80;j++)
            {
                this.map[i][j]= Integer.parseInt(""+st1.charAt(j));
            }
        }

    }


    public int[][] getLevel(){
        return this.map;
    }

    public void setCase(int x, int y,int value){
        this.map[x][y] = value;
    }

    public int getCase(int x ,int y){
        return this.map[x][y];
    }

    public void show(){
        for(int i=0;i<20;i++){
            for(int j=0;j<80;j++){
                System.out.print(this.map[i][j]);
            }
            System.out.println();
        }
    }
    


    public String affiche(){

        String laMap="";

        for(int i =0; i<this.map.length;i++) {
            for(int j=0;j<this.map[i].length;j++){
                
                switch(this.map[i][j]){
                    case 0 : laMap+=" ";break; //vide
                    case 1 : laMap+="*";break; //bloc incassable
                    case 2 : laMap+="#";break; //brique, creusable
                    case 3 : laMap+="H";break; //échelle
                    case 4 : laMap+="_";break; //tyrolienne
                    case 5 : laMap+="!";break; //ennemi
                    case 6 : laMap+="?";break; //joueur
                    case 7 : laMap+="E";break; //élément ramassable
                    case 8 : laMap+="T";break; //échelle la plus haute, observée comme corde au plafond
                }
                
            }
            laMap+="\n";
        }

        return laMap;
    }


}
