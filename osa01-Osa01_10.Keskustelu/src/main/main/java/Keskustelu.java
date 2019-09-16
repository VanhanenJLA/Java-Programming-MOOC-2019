
import java.util.Scanner;

public class Keskustelu {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Hyvää päivää! Mitä kuuluu?");
        String s = lukija.nextLine();

        System.out.println("No mutta sepäs kiinnostavaa, kerro lisää!");
        s = lukija.nextLine();

        System.out.println("Kiitos kertomastasi!");

    }
}
