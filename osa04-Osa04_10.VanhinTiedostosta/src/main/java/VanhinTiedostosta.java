
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class VanhinTiedostosta {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Mikä tiedosto luetaan?");
        String tiedosto = lukija.nextLine();
        try (Scanner tiedostonLukija = new Scanner(new File(tiedosto))) {
            Map<String, Integer> mappi = new HashMap<>();
            // luetaan kaikki tiedoston rivit
            while (tiedostonLukija.hasNextLine()) {
                String rivi = tiedostonLukija.nextLine();

                // mikäli rivi on tyhjä, ei käsitellä sitä
                if (rivi.trim().length() == 0) {
                    continue;
                }

                // muulloin tulostetaan tiedot
                String[] split = rivi.split(",");
                mappi.put(split[0], Integer.valueOf(split[1]));
            }
            String nimi = "";
            int suurin = 0;
            for (Map.Entry<String, Integer> entry : mappi.entrySet()) {
                String key = entry.getKey();
                Integer value = entry.getValue();
                if (value > suurin) {
                    suurin = value;
                    nimi = key;
                }
            }

            System.out.println("Vanhin oli: " + nimi);

        } catch (Exception e) {
            System.out.println("Virhe: " + e.getMessage());
        }
    }
}
