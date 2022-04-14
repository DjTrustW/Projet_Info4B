package entity;

import java.util.Scanner;

public class Menu {

    public Menu() {
    }

    public String getMainMenu() { /// 1

        String menu = "";

        menu += "||================================================================================||\n";
        menu += "||                                                                                ||\n";
        menu += "||                                                                                ||\n";
        menu += "||                                                                                ||\n";
        menu += "||                                                                                ||\n";
        menu += "||                                                                                ||\n";
        menu += "||                                                                                ||\n";
        menu += "||                                                                                ||\n";
        menu += "||                                    1.Jouer                                     ||\n";
        menu += "||                                   2.Quitter                                    ||\n";
        menu += "||                                                                                ||\n";
        menu += "||                                                                                ||\n";
        menu += "||                                                                                ||\n";
        menu += "||                                                                                ||\n";
        menu += "||                                                                                ||\n";
        menu += "||                                                                                ||\n";
        menu += "||                                                                                ||\n";
        menu += "||                                                                                ||\n";
        menu += "||                                                                                ||\n";
        menu += "||                                                                                ||\n";
        menu += "||                                                                                ||\n";
        menu += "||================================================================================||\n";

        return menu;
    }

    public String getGameMenu() { /// 2

        String menu = "";

        menu += "||================================================================================||\n";
        menu += "||                                                                                ||\n";
        menu += "||                                                                                ||\n";
        menu += "||                                                                                ||\n";
        menu += "||                                                                                ||\n";
        menu += "||                                                                                ||\n";
        menu += "||                                                                                ||\n";
        menu += "||                                                                                ||\n";
        menu += "||                                    1.Solo                                      ||\n";
        menu += "||                                 2.Multijoueur                                  ||\n";
        menu += "||                                                                                ||\n";
        menu += "||                                                                                ||\n";
        menu += "||                                                                                ||\n";
        menu += "||                                   3.Retour                                     ||\n";
        menu += "||                                                                                ||\n";
        menu += "||                                                                                ||\n";
        menu += "||                                                                                ||\n";
        menu += "||                                                                                ||\n";
        menu += "||                                                                                ||\n";
        menu += "||                                                                                ||\n";
        menu += "||                                                                                ||\n";
        menu += "||================================================================================||\n";

        return menu;
    }

    public String getVersusMenu() { /// 3

        String menu = "";
        
        menu += "||================================================================================||\n";
        menu += "||                                                                                ||\n";
        menu += "||                                                                                ||\n";
        menu += "||                                                                                ||\n";
        menu += "||                                                                                ||\n";
        menu += "||                                                                                ||\n";
        menu += "||                                                                                ||\n";
        menu += "||                                                                                ||\n";
        menu += "||                               1.Heros aleatoire                                ||\n";
        menu += "||                               2.Choisir le Heros                               ||\n";
        menu += "||                                                                                ||\n";
        menu += "||                                                                                ||\n";
        menu += "||                                                                                ||\n";
        menu += "||                                   3.Retour                                     ||\n";
        menu += "||                                                                                ||\n";
        menu += "||                                                                                ||\n";
        menu += "||                                                                                ||\n";
        menu += "||                                                                                ||\n";
        menu += "||                                                                                ||\n";
        menu += "||                                                                                ||\n";
        menu += "||                                                                                ||\n";
        menu += "||================================================================================||\n";

        return menu;
    }

    public String getServeurMenu() { /// 4

        String menu = "";
        menu += "||================================================================================||\n";
        menu += "||                                                                                ||\n";
        menu += "||                                                                                ||\n";
        menu += "||                                    1.Jouer                                     ||\n";
        menu += "||                                                                                ||\n";
        menu += "||                                                                                ||\n";
        menu += "||                                                                                ||\n";
        menu += "||                                                                                ||\n";
        menu += "||                                                                                ||\n";
        menu += "||                                                                                ||\n";
        menu += "||                                                                                ||\n";
        menu += "||                                                                                ||\n";
        menu += "||                                                                                ||\n";
        menu += "||                                                                                ||\n";
        menu += "||                                                                                ||\n";
        menu += "||                                                                                ||\n";
        menu += "||                                                                                ||\n";
        menu += "||                                    2.Retour                                    ||\n";
        menu += "||                                                                                ||\n";
        menu += "||================================================================================||\n";

        return menu;
    }

    public String waitMenuClient() { /// 5

        String menu = "";
        menu += "||================================================================================||\n";
        menu += "||                                                                                ||\n";
        menu += "||                                                                                ||\n";
        menu += "||                                                                                ||\n";
        menu += "||                                                                                ||\n";
        menu += "||                                                                                ||\n";
        menu += "||                                                                                ||\n";
        menu += "||                              En attente de l Host                              ||\n";
        menu += "||                                                                                ||\n";
        menu += "||                                      ...                                       ||\n";
        menu += "||                                                                                ||\n";
        menu += "||                                                                                ||\n";
        menu += "||                                                                                ||\n";
        menu += "||                                                                                ||\n";
        menu += "||                                                                                ||\n";
        menu += "||                                                                                ||\n";
        menu += "||                                                                                ||\n";
        menu += "||                                                                                ||\n";
        menu += "||                                                                                ||\n";
        menu += "||                                                                                ||\n";
        menu += "||                                                                                ||\n";
        menu += "||================================================================================||\n";

        return menu;
    }

    public String getReseauMenu() { /// 6

        String menu = "";
        menu += "||================================================================================||\n";
        menu += "||                                                                                ||\n";
        menu += "||                                                                                ||\n";
        menu += "||                                                                                ||\n";
        menu += "||                                                                                ||\n";
        menu += "||                                                                                ||\n";
        menu += "||                                                                                ||\n";
        menu += "||                              1.Heberger une partie                             ||\n";
        menu += "||                              2.Rejoindre une partie                            ||\n";
        menu += "||                                                                                ||\n";
        menu += "||                                                                                ||\n";
        menu += "||                                                                                ||\n";
        menu += "||                                                                                ||\n";
        menu += "||                                    3.Retour                                    ||\n";
        menu += "||                                                                                ||\n";
        menu += "||                                                                                ||\n";
        menu += "||                                                                                ||\n";
        menu += "||                                                                                ||\n";
        menu += "||                                                                                ||\n";
        menu += "||                                                                                ||\n";
        menu += "||                                                                                ||\n";
        menu += "||================================================================================||\n";

        return menu;
    }

    public String getMultiModeMenu() { /// 7

        String menu = "";

        menu += "||================================================================================||\n";
        menu += "||                                                                                ||\n";
        menu += "||                                                                                ||\n";
        menu += "||                                                                                ||\n";
        menu += "||                                                                                ||\n";
        menu += "||                                                                                ||\n";
        menu += "||                                                                                ||\n";
        menu += "||                                    1.Coop                                      ||\n";
        menu += "||                                   2.Versus                                     ||\n";
        menu += "||                                                                                ||\n";
        menu += "||                                                                                ||\n";
        menu += "||                                                                                ||\n";
        menu += "||                                                                                ||\n";
        menu += "||                                    3.Retour                                    ||\n";
        menu += "||                                                                                ||\n";
        menu += "||                                                                                ||\n";
        menu += "||                                                                                ||\n";
        menu += "||                                                                                ||\n";
        menu += "||                                                                                ||\n";
        menu += "||                                                                                ||\n";
        menu += "||                                                                                ||\n";
        menu += "||================================================================================||\n";

        return menu;
    }

    public String getLevelSelectorMenu() { /// 8

        String menu = "";

        menu += "||================================================================================||\n";
        menu += "||                                                                                ||\n";
        menu += "||                                                                                ||\n";
        menu += "||                                                                                ||\n";
        menu += "||                                                                                ||\n";
        menu += "||                                                                                ||\n";
        menu += "||                                                                                ||\n";
        menu += "||                               1.Choisir un niveau                              ||\n";
        menu += "||                               2.Niveau aleatoire                               ||\n";
        menu += "||                                                                                ||\n";
        menu += "||                                                                                ||\n";
        menu += "||                                                                                ||\n";
        menu += "||                                                                                ||\n";
        menu += "||                                    3.Retour                                    ||\n";
        menu += "||                                                                                ||\n";
        menu += "||                                                                                ||\n";
        menu += "||                                                                                ||\n";
        menu += "||                                                                                ||\n";
        menu += "||                                                                                ||\n";
        menu += "||                                                                                ||\n";
        menu += "||                                                                                ||\n";
        menu += "||================================================================================||\n";

        return menu;
    }

    public String getLevelMultiSelectorMenu() { /// 9

        String menu = "";

        menu += "||================================================================================||\n";
        menu += "||                                                                                ||\n";
        menu += "||                                                                                ||\n";
        menu += "||                                                                                ||\n";
        menu += "||                                                                                ||\n";
        menu += "||                                                                                ||\n";
        menu += "||                                                                                ||\n";
        menu += "||                               1.Choisir un niveau                              ||\n";
        menu += "||                              2.Tourner la roulette                             ||\n";
        menu += "||                                                                                ||\n";
        menu += "||                                                                                ||\n";
        menu += "||                                                                                ||\n";
        menu += "||                                                                                ||\n";
        menu += "||                                    3.Retour                                    ||\n";
        menu += "||                                                                                ||\n";
        menu += "||                                                                                ||\n";
        menu += "||                                                                                ||\n";
        menu += "||                                                                                ||\n";
        menu += "||                                                                                ||\n";
        menu += "||                                                                                ||\n";
        menu += "||                                                                                ||\n";
        menu += "||================================================================================||\n";

        return menu;
    }

    public String getClientMenu() { /// 10

        String menu = "";

        menu += "||================================================================================||\n";
        menu += "||                                                                                ||\n";
        menu += "||                                - - Connection - -                              ||\n";
        menu += "||                                       HOST                                     ||\n";
        menu += "||                                                                                ||\n";
        menu += "||                                                                                ||\n";
        menu += "||                                                                                ||\n";
        menu += "||                                    1. Valider                                  ||\n";
        menu += "||                                2. Autre serveur                                ||\n";
        menu += "||                                                                                ||\n";
        menu += "||                                                                                ||\n";
        menu += "||                                                                                ||\n";
        menu += "||                                                                                ||\n";
        menu += "||                                    3.Retour                                    ||\n";
        menu += "||                                                                                ||\n";
        menu += "||                                                                                ||\n";
        menu += "||                                                                                ||\n";
        menu += "||                                                                                ||\n";
        menu += "||                                                                                ||\n";
        menu += "||                                                                                ||\n";
        menu += "||                                                                                ||\n";
        menu += "||================================================================================||\n";

        return menu;
    }

    public void MenuManager() {

        int choix = 1;
        int result = 0;
        boolean lock = true;
        Scanner sc = new Scanner(System.in);

        while (lock) {

            result = 0;
            switch (choix) {

                case 1:

                    System.out.println(getMainMenu());
                    result = sc.nextInt();

                    switch (result) {

                        case 1:
                            choix = 2;
                            break;

                        case 2:
                            lock = false;
                            break;
                    }
                    break;

                case 2:

                    System.out.println(getGameMenu());
                    result = sc.nextInt();

                    switch (result) {

                        case 1:
                            choix = 8;
                            break;

                        case 2:
                            choix = 6;
                            break;

                        case 3:
                            choix = 1;
                            break;
                    }
                    break;

                case 3:

                    System.out.println(getVersusMenu());
                    result = sc.nextInt();

                    switch (result) {

                        case 1:
                            choix = 9;
                            break;

                        case 2:
                            //choisi parmi les socket lequel sera hero
                            break;

                        case 3:
                            choix = 7;
                            break;
                    }
                    break;

                case 4:

                    System.out.println(getServeurMenu());
                    result = sc.nextInt();

                    switch (result) {

                        case 1:
                            ///creer serveur
                            ///lance serveur
                            break;

                        case 2:
                            choix = 6;
                            break;

                        default:
                            break;
                    }
                    break;

                case 6:
                    System.out.println(getReseauMenu());
                    result = sc.nextInt();

                    switch (result) {

                        case 1:
                            choix = 4;
                            break;

                        case 2:
                            choix = 10;
                            break;

                        case 3:
                            choix = 2;
                            break;

                        default:
                            break;
                    }

                    break;

                case 7:

                    System.out.println(getMultiModeMenu());
                    result = sc.nextInt();
                    switch (result) {

                        case 1:
                            choix = 9;
                            break;

                        case 2:
                            choix = 3;
                            break;

                        case 3:
                            choix = 6;
                            break;

                        default:
                            break;
                    }

                    break;

                case 8:
                    System.out.println(getLevelSelectorMenu());
                    result = sc.nextInt();
                    

                    switch (result) {

                        case 1:
                            System.out.println("niveau dispo de 1 a 2");
                            int tmp = sc.nextInt();
                            Game g = new Game(tmp);
                            g.start();
                            g.join();
                            break;

                        case 2:
                            Game g = new Game(0);
                            g.start();
                            g.join();
                            break;

                        case 3:
                            choix = 2;
                            break;

                        default:
                            break;
                    }

                    break;

                case 9:
                    System.out.println(getLevelSelectorMenu());
                    result = sc.nextInt();
                    switch (result) {

                        case 1:

                            break;

                        case 2:

                            break;

                        case 3:

                            break;

                        default:
                            break;
                    }

                    break;

                case 10:
                    System.out.println(getClientMenu());
                    result = sc.nextInt();

                    switch (result) {

                        case 1:
                            choix = 7;
                            break;

                        case 2:
                            choix = 10;
                            break;

                        case 3:
                            choix = 6;
                            break;

                        default:
                            break;
                    }

                    break;

                case 11:

                    switch (result) {

                        case 1:

                            break;

                        case 2:

                            break;

                        case 3:

                            break;

                        default:
                            break;
                    }

                    break;

                case 12:

                    switch (result) {

                        case 1:

                            break;

                        case 2:

                            break;

                        case 3:

                            break;

                        default:
                            break;
                    }

                    break;

                default:
                    break;
            }

        }

        sc.close();
    }

}