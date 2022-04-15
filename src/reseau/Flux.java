package reseau;
import java.io.*;
import java.net.*;

class Flux extends Thread {

    private final int ind;
    private final String pseudo;
    private final Socket s;
    private final Serveur host;
    public BufferedReader read;
    public PrintWriter write;

    public Flux(int id, Socket s,Serveur h) throws Exception{

        this.ind=id;
        this.s=s;
        this.host = h;
        this.read = new BufferedReader(new InputStreamReader(s.getInputStream()));
        this.write = new PrintWriter( new BufferedWriter(new OutputStreamWriter(s.getOutputStream())),true);
        this.host.getPrintWriter()[this.ind]=this.write;
        this.pseudo = this.read.readLine();
    }

    public void send(String s){
        this.write.println(s);
    }

    public String receive() throws Exception{
        return this.read.readLine();  
    }

    public int getInd(){
        return this.ind;
    }

    public String getPseudo(){
        return this.pseudo;
    }

    public Socket getSocket(){
        return this.s;
    }

    public Serveur getServeur(){
        return this.host;
    }

    public BufferedReader getBufferReader(){
        return this.read;
    }

    public PrintWriter getPrintWriter(){
        return this.write;
    }
  
    public void run() {

        String out="";
        while (true) {
            try {
                out = receive();
            } catch (Exception e) {}

            // a modifier
            for (int i = 0; i < this.host.getnbMaxConnection(); i++) {
                if (this.host.getPrintWriter()[i] != null && i != this.ind)
                    this.host.getPrintWriter()[i].println(pseudo + "=>" + out);
            }

        try {
            this.read.close();
            this.write.close();
            this.s.close();
        } catch (Exception e) {}

        }
    }

}