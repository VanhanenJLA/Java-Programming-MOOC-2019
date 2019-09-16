
import java.util.Scanner;

public class SyotteidenRajaus {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        while (true) {
            System.out.println("Syötä luku");
            int i = Integer.parseInt(lukija.nextLine());
            if (i == 0) {
                return;
            }
            if (i < 0) {
                System.out.println("Epäkelpo luku");
            } else {
                System.out.println(i * i);
            }
        }
    }
}
