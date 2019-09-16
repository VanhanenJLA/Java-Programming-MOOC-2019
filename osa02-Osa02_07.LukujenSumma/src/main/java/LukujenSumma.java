
import java.util.Scanner;

public class LukujenSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        int i = 0;
        while (true) {
            int l = Integer.valueOf(lukija.nextLine());
            if (l == 0) {
                System.out.println(i);
                return;
            } else {
                i += l;
            }
        }
    }
}
