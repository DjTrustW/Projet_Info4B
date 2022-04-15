package entity;
import java.io.*;

public class Function { // class de fonction utile

    public Function(){}  //init

    public Map ReadLevel(String path){ /// permet de transformer 

        try{
            File file = new File(path);
            InputStream fichierMatrice = new FileInputStream(file); 
            InputStreamReader lecture = new InputStreamReader(fichierMatrice);
            BufferedReader textBuffer = new BufferedReader(lecture);
            String ligne;
            int[][] m = new int[20][80];
            int x =0;
            while ((ligne=textBuffer.readLine()) != null)
            {
                for(int i=0;i<ligne.length();i++){
                    m[x][i]= Integer.parseInt(String.valueOf(ligne.charAt(i))); /// tansforme les strings en entiers pour les stocket dans la map
                }
                x++;
            }
            textBuffer.close();
            Map level = new Map(m);
            return level;
        }		
    
        catch (Exception e){
            e.printStackTrace();
            return null;
        }

    }

}