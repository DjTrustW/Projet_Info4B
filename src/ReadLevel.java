import java.io.*;

class ReadLevel{
    public static void main(String[] args){
        try{
            File file = new File("./matrice.txt");
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
        }		

        catch (Exception e){
            e.printStackTrace();
        }

        
    }
}