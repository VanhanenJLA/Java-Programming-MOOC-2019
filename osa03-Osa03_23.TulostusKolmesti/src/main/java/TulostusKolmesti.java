
import java.util.Scanner;

public class TulostusKolmesti {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Mitä tulostetaan?");
        String s  = lukija.nextLine();
        String tuloste = "";
        
        for (int i = 0; i < 3; i++) {
            tuloste += s;
        }
        System.out.println(tuloste);
    }
}
