
import java.io.File;
import java.util.Scanner;

public class KysytynTiedostonTulostaminen {

    public static void main(String[] args) {
// luodaan lukija tiedoston lukemista varten
        Scanner lukija = new Scanner(System.in);
        System.out.println("Minkä tiedoston sisältö tulostetaan?");
        String tiedosto = lukija.nextLine();

        try (Scanner tiedostonLukija = new Scanner(new File(tiedosto))) {

            // luetaan tiedostoja kunnes kaikki rivit on luettu
            while (tiedostonLukija.hasNextLine()) {
                // luetaan yksi rivi
                String rivi = tiedostonLukija.nextLine();
                // tulostetaan luettu rivi
                System.out.println(rivi);
            }
        } catch (Exception e) {
            System.out.println("Virhe: " + e.getMessage());
        }
    }
}
