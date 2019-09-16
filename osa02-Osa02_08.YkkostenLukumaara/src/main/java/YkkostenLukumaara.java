
import java.util.Scanner;

public class YkkostenLukumaara {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        int cnt = 0;
        while (true) {
            int i = Integer.valueOf(lukija.nextLine());
            if (i == 0) {
                System.out.println(cnt);
                return;
            } else if (i == 1) {
               cnt++;
            }
        }
    }
}
