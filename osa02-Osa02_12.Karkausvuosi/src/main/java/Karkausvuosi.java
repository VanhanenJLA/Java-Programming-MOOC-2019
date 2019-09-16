
import java.util.Scanner;

public class Karkausvuosi {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Anna vuosi:");
        int i = Integer.valueOf(lukija.nextLine());

        if (i % 4 != 0) {
            System.out.println("Vuosi ei ole karkausvuosi.");
            return;
        }
        
        if (i % 100 == 0 && i % 400 != 0) {
            System.out.println("Vuosi ei ole karkausvuosi.");
            return;
        }
        System.out.println("Vuosi on karkausvuosi.");
    }
}
