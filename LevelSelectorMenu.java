import java.util.*;

public class LevelSelectorMenu{
    
    public LevelSelectorMenu(){

    }

    public String getLevelSelectorMenu(){

        String menu = "";
        menu += "||====================================||\n";
        menu += "||         1.Choisir un niveau        ||\n";
        menu += "||         2.Niveau aléatoire         ||\n";
        menu += "||                                    ||\n";
        menu += "||              3.Retour              ||\n";
        menu += "||====================================||\n";

        return menu;
    }

}