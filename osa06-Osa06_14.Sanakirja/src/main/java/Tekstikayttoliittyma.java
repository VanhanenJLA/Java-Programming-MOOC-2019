import java.util.Scanner;
 
public class Tekstikayttoliittyma {
 
    private Scanner lukija;
    private Sanakirja sanakirja;
 
    public Tekstikayttoliittyma(Scanner lukija, Sanakirja sanakirja) {
        this.lukija = lukija;
        this.sanakirja = sanakirja;
    }
 
    public void kaynnista() {
        System.out.println("Komennot:");
        System.out.println("  lisaa - lisää sanaparin sanakirjaan");
        System.out.println("  kaanna - kysyy sanan ja tulostaa sen käännöksen");
        System.out.println("  lopeta - poistuu käyttöliittymästä");
        System.out.println("");
 
        while (true) {
            System.out.print("Komento: ");
            String syote = lukija.nextLine();
            if (syote.equals("lopeta")) {
                break;
            }
 
            hoidaKomento(syote);
            System.out.println("");
        }
 
        System.out.println("Hei hei!");
    }
 
    private void hoidaKomento(String komento) {
        if (komento.equals("lisaa")) {
            lisaa();
        } else if (komento.equals("kaanna")) {
            kaanna();
        } else {
            System.out.println("Tuntematon komento.");
        }
    }
 
    private void lisaa() {
        System.out.print("Suomeksi: ");
        String sana = this.lukija.nextLine();
        System.out.print("Käännös: ");
        String kaannos = this.lukija.nextLine();
        this.sanakirja.lisaa(sana, kaannos);
    }
 
    private void kaanna() {
        System.out.print("Anna sana: ");
        String sana = this.lukija.nextLine();
 
        if (this.sanakirja.kaanna(sana) == null) {
            System.out.println("Tuntematon sana!");
        } else {
            System.out.println("Käännös: " + this.sanakirja.kaanna(sana));
        }
    }
}