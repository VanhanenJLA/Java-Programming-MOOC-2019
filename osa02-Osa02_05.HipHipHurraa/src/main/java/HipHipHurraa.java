
import java.util.Scanner;

public class HipHipHurraa {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        String s = "";
        while (true) {
            s = lukija.nextLine();
            if (s.equals("lopeta")) {
                System.out.println("hurraa!");
                return;
            } else {
                System.out.println("hip!");
            }
        }
    }
}
