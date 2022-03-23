import java.util.*;

class command extends Thread {

    private String result;
    private int len;

    public command() {
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            result = scanner.next();
            len = result.length();
            if (result.equals("END"))
                try {
                    scanner.close();
                    this.stop();
                } catch (Exception e) {
                }
            switch (result.charAt(len - 1)) {
                case 'z':
                    System.out.println("1");
                    break;

                case 's':
                    System.out.println("2");
                    break;

                case 'q':
                    System.out.println("3");
                    break;

                case 'd':
                    System.out.println("4");
                    break;

                default:
                    break;
            }
        }
    }

}
