
import java.util.Scanner;

public class Poistutaanko {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        while (true) {
            System.out.println("Poistutaanko?");
            String s1 = lukija.nextLine();
            if (s1.equals("kyllä")) {
                return;
            }
        }
    }
}
