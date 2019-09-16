
import java.util.Scanner;


public class Yhteenlasku {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        System.out.println("Syötä ensimmäinen luku!");
        int eka = Integer.parseInt(lukija.nextLine());
        System.out.println("Syötä toinen luku!");
        int toka = Integer.parseInt(lukija.nextLine());
        int sum = eka + toka;
        System.out.println(eka + " + " + toka + " = " + sum);

    }

}
