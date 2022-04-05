class Points{

// systeme de points lorsqu'on ramasse des objets sur la map ;

// methode affiche() les points que le joueur possède en dessous du niveau joué;

// système de ranking

// un objet = 5 points ; on pourra débloquer la grande échelle lorsque dans un niveau donné le joueur ramasse le nb de points max d'un niveau
// cumule les points sur tous les niveaux joués en une run (jusqu'à ce que le joueur décide de s'arrêter après un niveau ou s'il est mort) 

private int pointsJoueur;

    public Points(){
        this.pointsJoueur = 0;
    }

    public int getPointsJoueur(){return this.pointsJoueur;}

    public void ramasseItem(){

    }

    public String affiche(){
        String nbPoints = "Points : "+getPointsJoueur()+"\n";
        return nbPoints;
    }

}