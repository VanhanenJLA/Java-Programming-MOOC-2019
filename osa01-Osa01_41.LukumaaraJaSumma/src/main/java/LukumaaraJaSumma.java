
import java.util.Scanner;

public class LukumaaraJaSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        int cnt = 0;
        int sum = 0;
        while (true) {
            System.out.println("Syötä luku");
            int i = Integer.parseInt(lukija.nextLine());
            if (i == 0) {
                System.out.println("Lukuja yhteensä " + cnt);
                System.out.println("Lukujen summa " + sum);
                return;
            } else {
                sum += i;
                cnt++;
            }

        }
    }
}
