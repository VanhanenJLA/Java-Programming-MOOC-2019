
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // toteuta tänne toiminnallisuus, jonka avulla käyttäjä voi syöttää
        // kirjoja sekä tarkastella niitä

        ArrayList<Kirja> kirjat = new ArrayList<>();
        Scanner lukija = new Scanner(System.in);
        while (true) {
            System.out.print("Nimi: ");
            String nimi = lukija.nextLine();
            if (nimi.isEmpty()) {
                break;
            }

            System.out.print("Sivuja: ");
            int sivuja = Integer.valueOf(lukija.nextLine());
            System.out.print("Kirjoitusvuosi: ");
            int kirjoitusvuosi = Integer.valueOf(lukija.nextLine());

            kirjat.add(new Kirja(nimi, sivuja, kirjoitusvuosi));
        }

        System.out.println("");

        System.out.print("Mitä tulostetaan? ");
        String tulostus = lukija.nextLine();

        int indeksi = 0;
        while (indeksi < kirjat.size()) {
            Kirja kirja = kirjat.get(indeksi);

            if (tulostus.equals("kaikki")) {
                System.out.println(kirja);
            } else if (tulostus.equals("nimi")) {
                System.out.println(kirja.getNimi());
            }

            indeksi++;
        }

    }
}
