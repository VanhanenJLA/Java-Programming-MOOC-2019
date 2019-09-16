
import java.util.Scanner;

public class YkkostenOsuus {
     
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        int cnt = 0;
        int ycnt = 0;
        
        while (true) {
            int i = Integer.valueOf(lukija.nextLine());
            if (i == 0) {
                if (ycnt < 1) {
                    System.out.println("ykkösten osuutta ei voida laskea");
                    return;
                }
                System.out.println((double) ycnt/cnt);
                return;
            } else if (i == 1) {
                ycnt++;
            }
            cnt++;
        }
    }
}

