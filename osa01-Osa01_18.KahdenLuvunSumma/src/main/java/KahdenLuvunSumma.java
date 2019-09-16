
import java.util.Scanner;

public class KahdenLuvunSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);


        int sum = 0;
        System.out.println("Syötä ensimmäinen luku!");
        sum += Integer.valueOf(lukija.nextLine());
        System.out.println("Syötä toinen luku!");
        sum += Integer.valueOf(lukija.nextLine());
        System.out.println("Lukujen summa on " + sum);

    }
}
