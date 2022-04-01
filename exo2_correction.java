import java.util.*;
import java.io.*;

public class exo2_correction {
    public static void main(String[] Args) throws IOException {

        Hashtable<String, Integer> TableauH = new Hashtable<String, Integer>();
        BufferedReader fichier = new BufferedReader(new FileReader("matrice.txt"));
        String ligne;
        String mot;

        while ((ligne = fichier.readLine()) != null) {
            StringTokenizer st1 = new StringTokenizer(ligne, " ,;:.\n");
            while (st1.hasMoreTokens()) {
                mot = st1.nextToken();
                Object o = TableauH.get(mot);
                if (o == null)
                    TableauH.put(mot, new Integer(1));
                else {
                    Integer i = (Integer) o;
                    TableauH.put(mot, new Integer(i.intValue() + 1));
                }

            }

        }
        fichier.close();

        Enumeration listeDesMots = TableauH.keys();
        while (listeDesMots.hasMoreElements()) {
            String m = (String) (listeDesMots.nextElement());

            Object o1 = TableauH.get(m);
            Integer occurrence = (Integer) o1;
            System.out.println(m + "==>" + occurrence);
        }

    }
}