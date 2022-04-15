package reseau;
import entity.*;

import java.io.*;
import java.net.*;

public class Client extends Thread {

   private int ind;
   private final String pseudo;
   private final static int port = 6969; /// pour de connction
   private final String ip = "localhost"; /// pb avec l'adresse ip toujours a 0.0.0.0(on ne sais pas pourquoi)
   private boolean connecter = false;
   private BufferedReader read;
   private PrintWriter write;
   public CommandReseau cmd;
   private Socket s;

   public Client(String ps) throws Exception { /// initalise un client

      this.pseudo = ps;

      this.s = new Socket(ip, port);
      this.read = new BufferedReader(new InputStreamReader(this.s.getInputStream()));
      this.write = new PrintWriter(new BufferedWriter(new OutputStreamWriter(this.s.getOutputStream())), true);
      this.cmd = new CommandReseau(this);
      send(this.pseudo);
   }

   public void send(String s) { /// envoie sur le lien( write)
      this.write.println(s);
   }

   public String receive() throws Exception { /// permet de lire (read)
      return this.read.readLine();
   }

   public int getInd() { /// retourne l identifiant
      return this.ind;
   }

   public String getPseudo() { /// retourne le pseudo 
      return this.pseudo;
   }

   public BufferedReader getBufferReader() { ///retourne read
      return this.read;
   }

   public PrintWriter getPrintWriter() { /// retourne write
      return this.write;
   }

   public CommandReseau getCommand(){ /// retourne command (reseau)
      return this.cmd;
   }

   public void run() { ///affiche ce qui est recu tant qu i l est connecter
      while (this.connecter != true) {
         try {
            System.out.println(receive());
            this.sleep(50);
         } catch (Exception e) {
         }
      }
      try {
         this.write.close();
         this.read.close();
         this.s.close();
      } catch (Exception e) {}

   }

}
