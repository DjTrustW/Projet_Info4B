package reseau;
import java.io.*;
import java.net.*;

public class Serveur extends Thread { /// serveur qui accepte les connction

   private static int port = 6969;
   private static final int max = 4;
   private PrintWriter writers[];
   private ServerSocket s;
   private static int nb = 0;
   private boolean stp = true;

   public Serveur() throws Exception {
      this.writers = new PrintWriter[this.max];
      this.s = new ServerSocket(port);
   }

   public PrintWriter[] getPrintWriter() {
      return this.writers;
   }

   public int getnbConnection() {
      return this.nb;
   }

   public int getnbMaxConnection() {
      return this.max;
   }

   public void stoped(){
      this.stp = false;
   }

   public void run() {

      Flux fl = null;
      Socket soc;
      while (this.nb < this.max && this.stp) {
         try {
            soc = s.accept();
            fl = new Flux(nb, soc, this);
         } catch (Exception e) {
            
         }
         nb++;
         fl.start();
      }
   }
}