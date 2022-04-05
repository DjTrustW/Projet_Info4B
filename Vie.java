class Vie{

    //systeme de 5 vies/coeurs pour un joueur
    //methode verifie si on touche un ennemi retire un coeur
    //methode affiche() pour afficher les coeurs sous le niveau joué

    private int vieJoueur;

    public Vie(){
        this.vieJoueur = 5;
    }

    public int getVieJoueur(){return this.vieJoueur;}
    public void setVieJoueur(int nbVie){this.vieJoueur=nbVie;}


    public String affiche(){
        String laVieDispo = "Vies : ";
        for(int i=0;i<getVieJoueur();i++)
        {
            laVieDispo += "<3 ";
        }
        return laVieDispo;
    }

    public void toucheEnnemi(){
        vieJoueur = vieJoueur-1;
        affiche();
    }
}