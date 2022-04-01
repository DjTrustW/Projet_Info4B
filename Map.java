public class Map {
    
    private int[][] map;

    public Map(int tab[][]){
        this.map = tab;
    }

    public Map(int x,int y){
        this.map = new int[x][y];
    }

    public int[][] getLevel(){
        return this.map;
    }

    public void setCase(int x, int y,int value){
        this.map[x][y] = value;
    }

    public int getCase(int x ,int y){
        return this.map[x][y];
    }

    public void show(){
        for(int i=0;i<10;i++){
            for(int j =0 ;j<10;j++){
                System.out.print(this.map[i][j]);
            }
            System.out.println();
        }
    }
}
