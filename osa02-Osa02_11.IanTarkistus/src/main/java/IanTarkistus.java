
import java.util.Scanner;

public class IanTarkistus {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Kuinka vanha olet?");
        int i = Integer.valueOf(lukija.nextLine());

        if (i >= 0 && i <= 120) {
            System.out.println("OK");
            return;
        }
        System.out.println("Mahdotonta!");
    }
}
