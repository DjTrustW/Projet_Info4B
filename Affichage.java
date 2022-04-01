class Affichage extends Thread {
    public void run() {
        
        Map mapHere = getLevel();
        while(lock)
        {
            mapHere.show();

            try
            {
                this.sleep(1000);
            } 
            catch (Exception e){e.printStackTrace();}
        }
    }

    private String name;
    private boolean deverrouille; //revoir

    public String getName()
    { 
        this.name = name;

    }
    public void setName(String name)
    {
        this.name = name; 
    }

}
    
class Affichage{
    public static void main ( String [] args ) throws Exception 
    {
        Thread aff = new Affichage();

        aff.start();

    }
}