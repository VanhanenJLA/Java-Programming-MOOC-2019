
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class LoytyykoTiedostosta {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Minkä niminen tiedosto luetaan? ");
        String tiedosto = lukija.nextLine();

        System.out.println("Mitä etsitään?");
        String etsittava = lukija.nextLine();

        ArrayList<String> lista = new ArrayList<>();
        try (Scanner tiedostonLukija = new Scanner(new File(tiedosto))) {

            // luetaan tiedostoja kunnes kaikki rivit on luettu
            while (tiedostonLukija.hasNextLine()) {
                // luetaan yksi rivi
                String rivi = tiedostonLukija.nextLine();
                lista.add(rivi);
            }
        } catch (Exception e) {
            System.out.println("Tiedoston " + tiedosto + " lukeminen epäonnistui.");
        }

        if (lista.contains(etsittava)) {
            System.out.println("Löytyi!");
        } else {
            System.out.println("Ei löytynyt.");
        }

    }

}
