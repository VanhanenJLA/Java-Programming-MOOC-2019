
import java.util.Dictionary;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class Nestesailiot {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        Nestesailio eka = new Nestesailio("Ensimmäinen");
        Nestesailio toka = new Nestesailio("Toinen");

        while (true) {
            eka.tulosta();
            toka.tulosta();

            String luettu = lukija.nextLine();
            if (luettu.equals("lopeta")) {
                break;
            }

            System.out.println("");

            String[] osat = luettu.split(" ");
            String komento = osat[0];
            int maara = Integer.valueOf(osat[1]);

            if (komento.equals("lisaa")) {
                eka.lisaa(maara);
            }

            if (komento.equals("siirra")) {
                if (eka.neste > 0) {
                    if (eka.neste < maara) {
                        toka.lisaa(eka.neste);
                        eka.vahenna(eka.neste);
                    } else {
                        eka.vahenna(maara);
                        toka.lisaa(maara);
                    }

                }
            }

            if (komento.equals("poista")) {
                toka.vahenna(maara);
            }

        }
    }

}
