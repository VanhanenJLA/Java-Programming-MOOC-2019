
import java.util.Scanner;

public class SuurempiTaiYhtasuuri {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Syötä ensimmäinen luku:");
        int eka = Integer.parseInt(lukija.nextLine());
        System.out.println("Syötä toinen luku:");
        int toka = Integer.parseInt(lukija.nextLine());

        if (eka == toka) {
            System.out.println("Luvut ovat yhtä suuret!");
            return;
        }
        int suurempi;
        if (eka > toka) {
            suurempi = eka;
        } else {
            suurempi = toka;
        }
        System.out.println("Suurempi luku: " + suurempi);

    }
}
