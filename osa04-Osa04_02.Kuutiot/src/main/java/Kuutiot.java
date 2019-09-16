
import java.util.ArrayList;
import java.util.Scanner;

public class Kuutiot {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        ArrayList<Integer> luvut = new ArrayList<>();

        while (true) {
            String syote = lukija.nextLine();

            if (syote.equals("loppu")) {
                break;
            }

            Integer luku = Integer.valueOf(syote);
            System.out.println(luku*luku*luku);

            // lisää luettu rivi listalle myöhempää käsittelyä
            // varten tai käsittele rivi heti
        }

    }
}
