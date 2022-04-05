import java.util.*;
import java.lang.*;

public class RouletteMenu{
    
    public RouletteMenu(){

    }

    public String getRouletteMenu(){

        String menu = "";
        menu += "||====================================||\n";
        menu += "||       Usertag : LevelChoisi        ||\n";
        menu += "||       Usertag : LevelChoisi        ||\n";
        menu += "||       Usertag : LevelChoisi        ||\n";
        menu += "||       Usertag : LevelChoisi        ||\n";
        menu += "||                                    ||\n";
        menu += "||          Tirage au sort...         ||\n";
        menu += "||                uu                  ||\n";
        menu += "||====================================||\n";

        return menu;
    }

    public Level Roulette(){

        int randomJ = (int)(Math.random()*9);

        for(int i=0;i<=randomJ;i++)
        {
            //faire défiler un à un les usertag dans uu jusqu'à celui sélectionné 
        }

        Level MultiLevel = null ;
        //usertag.getLevelChoisi()

        return MultiLevel;

    }


}