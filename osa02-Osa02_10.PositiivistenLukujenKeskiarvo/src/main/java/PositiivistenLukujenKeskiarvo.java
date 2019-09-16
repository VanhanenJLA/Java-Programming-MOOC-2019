
import java.util.Scanner;

public class PositiivistenLukujenKeskiarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        int cnt = 0;
        int ycnt = 0;
        int ysum = 0;

        while (true) {
            int i = Integer.valueOf(lukija.nextLine());
            if (i == 0) {
                if (ycnt < 1) {
                    System.out.println("keskiarvon laskeminen ei ole mahdollista");
                    return;
                }
                System.out.println((double) ysum / ycnt);
                return;
            } else if (i > 0) {
                ysum += i;
                ycnt++;
            }
            cnt++;
        }
    }
}
