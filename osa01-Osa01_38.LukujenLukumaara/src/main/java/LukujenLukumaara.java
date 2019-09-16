
import java.util.Scanner;

public class LukujenLukumaara {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int cnt = 0;
        while (true) {
            System.out.println("Syötä luku");
            int i = Integer.parseInt(lukija.nextLine());

            if (i == 0) {
                System.out.println("Lukuja yhteensä " + cnt);
                return;
            }
            cnt++;
        }
    }
}
