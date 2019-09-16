
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // toteuta luokkaa Ohjelma käyttävä ohjelmasi tänne
        
        ArrayList<TelevisioOhjelma> ohjelmat = new ArrayList<>();
        Scanner lukija = new Scanner(System.in);

        while (true) {
            System.out.print("Nimi: ");
            String nimi = lukija.nextLine();
            if (nimi.isEmpty()) {
                break;
            }

            System.out.print("Pituus: ");
            int pituus = Integer.parseInt(lukija.nextLine());

            ohjelmat.add(new TelevisioOhjelma(nimi, pituus));
        }

        System.out.println("");

        System.out.print("Ohjelman maksimipituus: ");
        int maksimiPituus = Integer.parseInt(lukija.nextLine());

        int indeksi = 0;
        while (indeksi < ohjelmat.size()) {
            if (ohjelmat.get(indeksi).getPituus() <= maksimiPituus) {
                System.out.println(ohjelmat.get(indeksi));
            }

            indeksi++;
        }

    }

}
