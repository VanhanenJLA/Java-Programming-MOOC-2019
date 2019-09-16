import java.util.Scanner;
 
public class Paaohjelma {
 
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
 
        // Tee sovelluksesi tänne -- kannattaa harkita sovelluksen pilkkomista
        // useampaan luokkaan.
        Arvosanatilastot jakauma = new Arvosanatilastot();
 
        System.out.println("Syötä yhteispisteet, -1 lopettaa: ");
        while (true) {
            int luku = Integer.parseInt(lukija.nextLine());
            if (luku == -1) {
                break;
            }
 
            jakauma.lisaaPistemaara(luku);
        }
 
        jakauma.tulosta();
    }
}