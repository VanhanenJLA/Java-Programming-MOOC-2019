
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HenkilotietojenTarkastelu {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        int ikienSumma = 0;
        int ikienLukumaara = 0;
        String pisinNimi = "";

        while (true) {
            String luettu = lukija.nextLine();
            if (luettu.equals("")) {
                break;
            }

            String[] palat = luettu.split(",");
            List<String[]> henkilot = new ArrayList();
            henkilot.add(palat);

            for (String[] henkilo : henkilot) {
                if (henkilo[0].length() > pisinNimi.length()) {
                    pisinNimi = henkilo[0];
                }
                ikienSumma += Integer.parseInt(henkilo[1]);
                ikienLukumaara++;
            }
        }
        System.out.println("Pisin nimi: " + pisinNimi);
        System.out.println("Syntymävuosien keskiarvo: " + (double) ikienSumma / ikienLukumaara);
    }
}
