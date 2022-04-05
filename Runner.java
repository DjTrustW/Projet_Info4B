import java.util.*;
import java.io.*;

public class Runner {

    public static void main(String[] args) throws IOException {

        Map map = new Map("matrice.txt");
        Vie vie = new Vie();
        Points points = new Points();


        Thread aff = new Affichage(map,vie,points);
        aff.start();

        /*
        Scanner sc = new Scanner(System.in);
        int result;

        Menu m = new Menu();
        System.out.println(m.getMainMenu());
        result = sc.nextInt();
        sc.close();
        */
    }
}