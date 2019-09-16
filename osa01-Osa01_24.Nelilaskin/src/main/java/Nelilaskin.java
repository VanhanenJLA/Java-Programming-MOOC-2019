
import java.util.Scanner;

public class Nelilaskin {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Syötä ensimmäinen luku!");
        int eka = Integer.parseInt(lukija.nextLine());
        System.out.println("Syötä toinen luku!");
        int toka = Integer.parseInt(lukija.nextLine());
        int sum = eka + toka;
        int sub = eka - toka;
        int mul = eka * toka;
        double div = (double) eka / toka;
        System.out.println(eka + " + " + toka + " = " + sum);
        System.out.println(eka + " - " + toka + " = " + sub);
        System.out.println(eka + " * " + toka + " = " + mul);
        System.out.println(eka + " / " + toka + " = " + div);

    }
}
