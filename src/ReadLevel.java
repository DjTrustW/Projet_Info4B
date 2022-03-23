import java.io.*;

class ReadLevel
{
    public static void main(String[] args)
    {
        try
        {
            InputStream fichierMatrice = new FileInputStream("matrice.txt"); 
            InputStreamReader lecture = new InputStreamReader(fichierMatrice);
            BufferedReader textBuffer = new BufferedReader(lecture);
            String ligne;
            while ((ligne=textBuffer.readLine()) != null)
            {
                System.out.println(ligne);
            }
            textBuffer.close(); 
        }		
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}