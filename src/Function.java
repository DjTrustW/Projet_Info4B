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
            Map level = new Map(10,10);
            int x =0;
            while ((ligne=textBuffer.readLine()) != null)
            {
                for(int i=0;i<ligne.length();i++){
                    level.setCase(x, i,Integer.parseInt(String.valueOf(ligne.charAt(i))));
                }
                x++;
            }
            level.show();
            textBuffer.close(); 
            return level;
        }		
    
        catch (Exception e){
            e.printStackTrace();
            return null;
        }

    }
}
