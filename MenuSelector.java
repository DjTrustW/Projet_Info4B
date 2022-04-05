import java.util.*;

public class MenuSelector{
    
    public MenuSelector(){

    }

    public String getSelectorMenu(){

        String menu = "";
        menu += "||====================================||\n";
        menu += "||              1.Solo                ||\n";
        menu += "||              2.Multijoueur         ||\n";
        menu += "||                                    ||\n";
        menu += "||              3.Retour              ||\n";
        menu += "||====================================||\n";

        return menu;
    }

}
