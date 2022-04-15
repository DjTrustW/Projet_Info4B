package entity;

public class Map {
    
    private int[][] map;
    private int[][] EvilSpawn;
    private int[][] HeroSpawn;
    private int[][] CoinSpawn;
    private Map link;

    public Map(int tab[][]){ /// init avec tab 
        this.map = tab;
        this.HeroSpawn = getHeroSpawn();
        this.EvilSpawn = getEvilSpawn();
        this.CoinSpawn = getCoinSpawn();
        clearmap();
    }

    public Map(Map m){ ///init avec une map
        this.map = m.getLevel();
        this.HeroSpawn = getHeroSpawn();
        this.EvilSpawn = getEvilSpawn();
        this.CoinSpawn = getCoinSpawn();
        clearmap();
    }

    public int[][] getLevel(){ /// retourne le tabeau
        return this.map;
    }

    public void setlevel(Map m){ ///  permet de recopier le lvl
        for(int i = 0; i < m.getLevel().length; i++)
        this.map[i] =  m.getLevel()[i].clone();
    }

    public void setCase(int x, int y,int value){/// permet de set une case
        this.map[x][y] = value;
    }

    public int getCase(int x ,int y){ /// permet d avoir la case x y 
        return this.map[x][y];
    }

    private int[][] getHeroSpawn(){ /// retourne les position posible des spawns hero 

        int nb = 0;
        for(int i=0;i<20;i++){ /// verifie combien de spawn pour la taille du tableau
            for(int j =0 ;j<80;j++){
                
                if(getCase(i, j) == 6){
                    nb++;
                }
            }
        }

        int [][] slt = new int [nb][2];
        nb =0;
        for(int i=0;i<20;i++){ /// range les position dans le tableau
            for(int j = 0 ;j<80;j++){
                
                if(getCase(i, j) == 6){
                    slt[nb][0] =  i;
                    slt[nb][1] =  j;
                    nb++;
                }
            }
        }
        return slt;
    }

    private int[][] getEvilSpawn(){ /// retourne les position posible des spawns enemis

        int nb = 0;
        for(int i=0;i<20;i++){/// verifie combien de spawn pour la taille du tableau
            for(int j =0 ;j<80;j++){
                
                if(getCase(i, j) == 5){
                    nb++;
                }
            }
        }

        int [][] slt = new int [nb][2];
        nb =0;
        for(int i=0;i<20;i++){/// range les position dans le tableau
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

    private int[][] getCoinSpawn(){/// retourne les position posible des spawns des "coins"

        int nb = 0;
        for(int i=0;i<20;i++){/// verifie combien de spawn pour la taille du tableau
            for(int j =0 ;j<80;j++){
                
                if(getCase(i, j) == 7){
                    nb++;
                }
            }
        }

        int [][] slt = new int [nb][2];
        nb =0;
        for(int i=0;i<20;i++){/// range les position dans le tableau
            for(int j =0 ;j<80;j++){
                
                if(getCase(i, j) == 7){
                    slt[nb][0] =  i;
                    slt[nb][1] =  j;
                    nb++;
                }
            }
        }
        return slt;
    }

    private void clearmap(){ /// permet de retirer tout le supperflue
        for(int i=0;i<20;i++){
            for(int j =0 ;j<80;j++){
                
                if(getCase(i, j) == 5 || getCase(i, j) == 6 || getCase(i, j) == 7 ){
                    setCase(i, j, 0);
                }
            }
        }
    }

    public int[][][] getSpawn(){ /// permet d'avoir un tableau des trois tableau de spawn
        int [][][] slt =  {this.HeroSpawn,this.EvilSpawn,this.CoinSpawn};
        return slt;
    }

    public void addToMapCoin(){ /// permet d'afficher les coins restant
        for (int i =0 ; i<this.getLink().getSpawn()[2].length;i++){
            if(this.getLink().getSpawn()[2][i][0] >0 && this.getLink().getSpawn()[2][i][1] >0){
                setCase(this.getLink().getSpawn()[2][i][0], this.getLink().getSpawn()[2][i][1], 7);
            }
        }
    }

    public void delToMapCoin(int x,int y){///permet de supprimer un coin pour qu'il ne sois plus afficher
        for (int i =0 ; i<this.getLink().getSpawn()[2].length;i++){

            if( this.getLink().getSpawn()[2][i][0] == x  &&  this.getLink().getSpawn()[2][i][1] == y){
                this.getLink().getSpawn()[2][i][0] = -1;
                this.getLink().getSpawn()[2][i][1] = -1;
            }
        }
    }

    public void setLink(Map m){///lien a la map d origine 
        this.link = m;
    }

    public Map getLink(){ /// retourne la map d origine 
        return this.link;
    }

    public void show(){ /// affichage rudimentare ou la map est afficher en chiifre
        for(int i=0;i<20;i++){
            for(int j =0 ;j<80;j++){
                System.out.print(this.map[i][j]);
            }
            System.out.println();
        }
        System.out.println("------------------");
    }

    public String affiche(){ /// affichage de la map en fonction des block (attention les x sont inverse)

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