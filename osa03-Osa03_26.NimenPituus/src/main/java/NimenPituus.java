import java.util.Scanner;
 
public class NimenPituus {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        // kutsu täältä metodiasi
        System.out.print("Anna nimi: ");
        String nimi = lukija.nextLine();
        System.out.print("Kirjainmäärä: " + laskeKirjaimet(nimi));
    }
    
    // tee tänne metodi 
    // public static int laskeKirjaimet(String merkkijono)
    
    public static int laskeKirjaimet(String merkkijono) {
        return merkkijono.length();
    }
}