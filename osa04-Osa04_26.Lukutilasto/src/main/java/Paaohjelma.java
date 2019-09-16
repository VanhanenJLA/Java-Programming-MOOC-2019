
import java.util.Scanner;

public class Paaohjelma {
    
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        // voit tehdä testikoodia tänne
        // poista kaikki ylimääräinen koodi kuitenkin tehtävän viimeisiä osia tehdessäsi

        // Jotta testi toimisi, on oliot luotava pääohjelmassa oikeassa järjestyksessä 
        //  eli ensin kaikkien summan laskeva olio, toisena parillisten summan laskeva 
        //  ja viimeisenä parittomien summan laskeva olio)!
        System.out.println("Anna lukuja:");
        
        Lukutilasto kaikki = new Lukutilasto();
        Lukutilasto pari = new Lukutilasto();
        Lukutilasto not = new Lukutilasto();
        
        while (true) {
            int i = Integer.valueOf(lukija.nextLine());
            
            if (i == -1) {
                break;
            }
            
            kaikki.lisaaLuku(i);
            if (onkoPariton(i)) {
                pari.lisaaLuku(i);
            }
            not.lisaaLuku(i);
        }
        
        System.out.println("Summa: " + kaikki.summa());
        System.out.println("Parillisten summa: " + pari.summa());
        System.out.println("Parittomien summa: " + not.summa());
        
    }
    
    private static boolean onkoPariton(int i) {
        return i % 2 == 0;
    }
}
