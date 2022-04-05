import java.util.*;

public class ServeurMenu{
    
    public ServeurMenu(){

    }

    public String getServeurMenu(){

        String menu = "";
        menu += "||====================================||\n";
        menu += "||         1.Ajouter un joueur        ||\n";
        menu += "||              2.Jouer               ||\n";
        menu += "||                                    ||\n";
        menu += "|| Joueurs connectés :                ||\n";
        menu += "||              -                     ||\n";   //add username à chaque ajout, si joueur quitte, enlève le joueur
        menu += "||              -                     ||\n";
        menu += "||              -                     ||\n";
        menu += "||                                    ||\n";
        menu += "||              3.Retour              ||\n";
        menu += "||====================================||\n";

        return menu;
    }

}