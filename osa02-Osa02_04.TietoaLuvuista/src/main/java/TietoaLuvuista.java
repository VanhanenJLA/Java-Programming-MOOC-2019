
import java.util.Scanner;

public class TietoaLuvuista {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int eka = Integer.valueOf(lukija.nextLine());
        int toka = Integer.valueOf(lukija.nextLine());
        String fakta = "";

        if (eka == toka) {
            fakta = "yhtä suuri";
        }else if (eka > toka) {
            fakta = "suurempi";
        } else {
            fakta = "pienempi";
        }
        System.out.println("Luku " + eka + " on " + fakta + " kuin luku " + toka + ".");
    }
}
