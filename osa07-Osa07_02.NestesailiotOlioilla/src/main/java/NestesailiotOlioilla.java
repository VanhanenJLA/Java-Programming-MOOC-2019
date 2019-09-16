
import java.util.Scanner;

public class NestesailiotOlioilla {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        Sailio eka = new Sailio();
        Sailio toka = new Sailio();

        while (true) {
            System.out.println("Ensimmäinen: " + eka.toString());
            System.out.println("Toinen: " + toka.toString());

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
                if (eka.sisalto() > 0) {
                    if (eka.sisalto() < maara) {
                        toka.lisaa(eka.sisalto());
                        eka.poista(eka.sisalto());
                    } else {
                        eka.poista(maara);
                        toka.lisaa(maara);
                    }

                }
            }

            if (komento.equals("poista")) {
                toka.poista(maara);
            }

        }
    }

}
