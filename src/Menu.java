public class Menu{
    
    public Menu(){

    }

    public String getMainMenu(){

        String menu = "";
        menu += "||====================================||\n";
        menu += "||              1.Jouer               ||\n";
        menu += "||              2.Quitter             ||\n";
        menu += "||                                    ||\n";
        menu += "||              3.Options             ||\n";
        menu += "||====================================||\n";

        return menu;
    }

    public String getGameMenu(){

        String menu = "";
        menu += "||====================================||\n";
        menu += "||              1.Solo                ||\n";
        menu += "||              2.Multijoueur         ||\n";
        menu += "||              3.Retour              ||\n";
        menu += "||                                    ||\n";
        menu += "||====================================||\n";

        return menu;
    }

}