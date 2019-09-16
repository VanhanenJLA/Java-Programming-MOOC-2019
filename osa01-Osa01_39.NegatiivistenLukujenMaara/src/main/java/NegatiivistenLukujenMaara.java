
import java.util.Scanner;

public class NegatiivistenLukujenMaara {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        int cnt = 0;
        while (true) {
            System.out.println("Syötä luku");
            int i = Integer.parseInt(lukija.nextLine());

            if (i == 0) {
                System.out.println("Negatiivisia lukuja yhteensä " + cnt);
                return;
            } else {
                if (i < 0) {
                    cnt++;
                }
            }

        }
    }
}
