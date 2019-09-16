
import java.util.Scanner;

public class SamatSanat {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Syötä ensimmäinen merkkijono:");
        String s1 = lukija.nextLine();
        System.out.println("Syötä toinen merkkijono:");
        String s2 = lukija.nextLine();

        if (s1.equals(s2))  {
            System.out.println("Samat sanat");
        } else {
            System.out.println("Ei sitten");
        }

//       
//Caput Draconis
//Tervetuloa!
    }
}
