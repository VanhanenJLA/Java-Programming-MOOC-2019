
import java.util.Scanner;

public class LukujenKeskiarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        int cnt = 0;
        int sum = 0;
        double ka = 0;
        
        while (true) {
            System.out.println("Syötä luku");
            int i = Integer.parseInt(lukija.nextLine());
            if (i == 0) {
                ka = (double) sum / cnt;
                System.out.println("Lukujen keskiarvo " + ka);
                return;
            } else {
                sum += i;
                cnt++;
            }

        }
    }
}
