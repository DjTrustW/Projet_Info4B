import java.util.*;

public class ClientMenu{
    
    public ClientMenu(){

    }

    public String getClientMenu(){

        String menu = "";
        menu += "||====================================||\n";
        menu += "||         - - Connection - -         ||\n";
        menu += "||                HOST                ||\n";
        menu += "||        Rejoindre ce serveur ?      ||\n";
        menu += "||                                    ||\n";
        menu += "||            1. Valider              ||\n";
        menu += "||         2. Autre serveur           ||\n";
        menu += "||                                    ||\n";
        menu += "||              3.Retour              ||\n";
        menu += "||====================================||\n";

        return menu;
    }

}