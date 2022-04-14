package entity;

public class Map {
    
    private int[][] map;

    public Map(int tab[][]){
        this.map = tab;
    }

    public Map(Map m){
        this.map = m.getLevel();
    }

    public Map(int x,int y){
        this.map = new int[x][y];
    }

    public int[][] getLevel(){
        return this.map;
    }

    public void setlevel(Map m){
        for(int i = 0; i < m.getLevel().length; i++)
        this.map[i] =  m.getLevel()[i].clone();
    }

    public void setCase(int x, int y,int value){
        this.map[x][y] = value;
    }

    public int getCase(int x ,int y){
        return this.map[x][y];
    }

    public int[][] getHeroSpawn(){

        int nb = 0;
        for(int i=0;i<20;i++){
            for(int j =0 ;j<80;j++){
                
                if(getCase(i, j) == 6){
                    nb++;
                }
            }
        }

        int [][] slt = new int [nb][2];
        nb =0;
        for(int i=0;i<20;i++){
            for(int j =0 ;j<80;j++){
                
                if(getCase(i, j) == 6){
                    slt[nb][0] =  i;
                    slt[nb][1] =  j;
                    nb++;
                }
            }
        }
        return slt;
    }

    public int[][] getEvilSpawn(){

        int nb = 0;
        for(int i=0;i<20;i++){
            for(int j =0 ;j<80;j++){
                
                if(getCase(i, j) == 6){
                    nb++;
                }
            }
        }

        int [][] slt = new int [nb][2];
        nb =0;
        for(int i=0;i<20;i++){
            for(int j =0 ;j<80;j++){
                
                if(getCase(i, j) == 5){
                    slt[nb][0] =  i;
                    slt[nb][1] =  j;
                    nb++;
                }
            }
        }
        return slt;
    }

    public void show(){
        for(int i=0;i<20;i++){
            for(int j =0 ;j<80;j++){
                System.out.print(this.map[i][j]);
            }
            System.out.println();
        }
        System.out.println("------------------");
    }

    public String affiche(){

        String laMap="";
        laMap += "||================================================================================||\n";

        for(int i =0; i<this.map.length;i++) {
            laMap+="||";
            for(int j=0;j<this.map[i].length;j++) {
                
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
            laMap+="||\n";
        }
        laMap += "||================================================================================||\n";
        return laMap;
    }

}