
import java.util.Random;
import java.util.Scanner;

public class Ohjelma {
    
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Montako satunnaislukua tulostetaan?");
        int lkm = Integer.valueOf(lukija.nextLine());
        
        Random rand = new Random();
        for (int i = 0; i < lkm; i++) {
            System.out.println(rand.nextInt(11));
        }
    }
    
}
