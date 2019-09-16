
import java.util.Scanner;

public class ViestiKolmesti {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Kirjoita merkkijono!");
        String s = lukija.nextLine();

        for (int i = 0; i < 3; i++) {
            System.out.println(s);
        }
    }
}
