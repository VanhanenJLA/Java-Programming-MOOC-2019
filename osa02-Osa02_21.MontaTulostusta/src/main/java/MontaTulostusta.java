
import java.util.Scanner;

public class MontaTulostusta {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Kuinka monta?");
        int lkm = Integer.parseInt(lukija.nextLine());
        while (lkm > 0) {
            lkm--;
            tulostaTeksti();
        }
    }

    public static void tulostaTeksti() {
        System.out.println("Alussa olivat suo, kuokka ja Java.");
    }
}
