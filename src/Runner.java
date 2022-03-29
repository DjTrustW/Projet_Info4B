
public class Runner {

    public static void main(String[] args) throws InterruptedException {

        /*
        Scanner sc = new Scanner(System.in);
        int result;

        Menu m = new Menu();
        System.out.println(m.getMainMenu());
        result = sc.nextInt();
        sc.close();
        */

        Game g = new Game();
        g.start();

    }
}