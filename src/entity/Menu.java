package entity;

import java.util.Scanner;

public class Menu {

    public Menu() {
    }

    private String getMainMenu() { /// 1

        String menu = "";

        menu += "||================================================================================||\n";
        menu += "||                                                                                ||\n";
        menu += "||         e     eeeee eeeee eeee    eeeee  e   e eeeee eeeee eeee eeeee          ||\n";
        menu += "||         8     8  88 8   8 8       8   8  8   8 8   8 8   8 8    8   8          ||\n";
        menu += "||         8e    8   8 8e  8 8eee    8eee8e 8   8 8e  8 8e  8 8eee 8eee8e         ||\n";
        menu += "||         88    8   8 88  8 88      88   8 8   8 88  8 88  8 88   88   8         ||\n";
        menu += "||         88eee 8eee8 88ee8 88ee    88   8 88ee8 88  8 88  8 88ee 88   8         ||\n";
        menu += "||                                                                                ||\n";
        menu += "||                                                                                ||\n";
        menu += "||                                                                                ||\n";
        menu += "||                                    1.Jouer                                     ||\n";
        menu += "||                                   2.Quitter                                    ||\n";
        menu += "||                                                                                ||\n";
        menu += "||          --------------------------------------------------------------        ||\n";
        menu += "||          |      Z                                                     |        ||\n";
        menu += "||          |      |                -           -           o A          |        ||\n";
        menu += "||          |   Q--o--D                                                  |        ||\n";
        menu += "||          |      |            start         select             o  E    |        ||\n";
        menu += "||          |      D                                                     |        ||\n";
        menu += "||          --------------------------------------------------------------        ||\n";
        menu += "||                                                                                ||\n";
        menu += "||================================================================================||\n";

        return menu;
    }

    private String getGameMenu() { /// 2

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

    private String getVersusMenu() { /// 3

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

    private String getServeurMenu() { /// 4

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

    private String waitMenuClient() { /// 5

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

    private String getReseauMenu() { /// 6

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

    private String getMultiModeMenu() { /// 7

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

    private String getLevelSelectorMenu() { /// 8

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

    private String getLevelMultiSelectorMenu() { /// 9

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

    private String getClientMenu() { /// 10

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
                            // choisi parmi les socket lequel sera hero
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
                            /// creer serveur
                            /// lance serveur
                            break;

                        case 2:
                            choix = 6;
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
                    }

                    break;

                case 8:
                    System.out.println(getLevelSelectorMenu());
                    result = sc.nextInt();

                    switch (result) {

                        case 1:
                            System.out.println("niveau dispo de 1 a 2");
                            int tmp = sc.nextInt();
                            Game g1 = new Game(tmp);
                            g1.start();
                            try {
                                g1.join();
                            } catch (Exception e) {
                            }
                            break;

                        case 2:
                            Game g2 = new Game((int) (Math.random() * 2) + 1);
                            g2.start();
                            try {
                                g2.join();
                            } catch (Exception e) {
                            }
                            break;

                        case 3:
                            choix = 2;
                            break;
                    }

                    break;

                case 9:
                    System.out.println(getLevelSelectorMenu());
                    result = sc.nextInt();
                    switch (result) {

                        case 1:
                            /// ajout des socket a faire
                            System.out.println("niveau dispo de 1 a 2");
                            int tmp = sc.nextInt();
                            Game g3 = new Game(tmp);
                            g3.start();
                            try {
                                g3.join();
                            } catch (Exception e) {
                            }
                            break;

                        case 2:
                            /// ajout des socket a faire
                            Game g4 = new Game((int) (Math.random() * 2) + 1);
                            g4.start();
                            try {
                                g4.join();
                            } catch (Exception e) {
                            }
                            break;

                        case 3:
                            choix = 7;
                            break;
                    }

                    break;

                case 10:
                    System.out.println(getClientMenu());
                    result = sc.nextInt();
                    /// a voir
                    switch (result) {

                        case 1:
                            choix = 5;
                            break;

                        case 2:
                            choix = 10;
                            break;

                        case 3:
                            choix = 6;
                            break;
                    }

                    break;
            }

        }

        sc.close();
    }

}