
import java.util.Scanner;

public class MuuttujatYhdessa {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Syötä merkkijono!");
        String teksti = lukija.nextLine();

        System.out.println("Syötä kokonaisluku!");
        int kokonaisluku = Integer.valueOf(lukija.nextLine());

        System.out.println("Syötä liukuluku!");
        double liukuluku = Double.valueOf(lukija.nextLine());

        System.out.println("Syötä totuusarvo!");
        boolean totuusarvo = Boolean.valueOf(lukija.nextLine());

        System.out.println("Syötit merkkijonon " + teksti + "\n"
                + "Syötit kokonaisluvun " + kokonaisluku + "\n"
                + "Syötit liukuluvun " + liukuluku + "\n"
                + "Syötit totuusarvon " + totuusarvo);
    }
}
