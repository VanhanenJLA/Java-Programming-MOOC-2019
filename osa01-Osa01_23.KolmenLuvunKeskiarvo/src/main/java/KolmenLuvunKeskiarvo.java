
import java.util.Scanner;

public class KolmenLuvunKeskiarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Syötä ensimmäinen luku!");
        int eka = Integer.parseInt(lukija.nextLine());
        System.out.println("Syötä toinen luku!");
        int toka = Integer.parseInt(lukija.nextLine());
        System.out.println("Syötä kolmas luku!");
        int kolmas = Integer.parseInt(lukija.nextLine());
        int sum = eka + toka + kolmas;
        double ka = (double) sum / 3;
        System.out.println("Syötettyjen lukujen keskiarvo on " + ka);

    }
}
