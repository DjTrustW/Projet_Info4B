package entity;
import java.io.*;

public class Function {

    public Function(){}

    public Map ReadLevel(String path){

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
                    m[x][i]= Integer.parseInt(String.valueOf(ligne.charAt(i)));
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

    /*public Level Roulette(){

        int randomJ = (int)(Math.random()*9);

        for(int i=0;i<=randomJ;i++)
        {
            //faire défiler un à un les usertag dans uu jusqu'à celui sélectionné 
        }

        Level MultiLevel = null ;
        //usertag.getLevelChoisi()

        return MultiLevel;

    }*/


}