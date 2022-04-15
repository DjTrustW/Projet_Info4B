package entity;
class Vie{

    //systeme de 5 vies/coeurs pour un joueur
    //methode verifie si on touche un ennemi retire un coeur
    //methode affiche() pour afficher les coeurs sous le niveau joué

    private int vieJoueur;
    private final int vie_max;

    public Vie(int i){ /// init 
        this.vieJoueur = i;
        this.vie_max = i;
    }

    public int getVieJoueur(){return this.vieJoueur;} /// retourne les pv
    public void setVieJoueur(int nbVie){this.vieJoueur=nbVie;} /// permet de set la vie 


    public String affiche(){///affiche en fonction des point de vie restant :
        String laVieDispo = "Vies : ";
        for(int i=0;i<getVieJoueur();i++)
        {
            laVieDispo += " <3 ";   /// coeur entier 
        }

        for(int i=0;i<(this.vie_max - this.vieJoueur);i++)
        {
            laVieDispo += "</3 ";   /// coeur briser 
        }
        return laVieDispo;
    }

    public void toucheEnnemi(){
        vieJoueur = vieJoueur-1;
    }
}