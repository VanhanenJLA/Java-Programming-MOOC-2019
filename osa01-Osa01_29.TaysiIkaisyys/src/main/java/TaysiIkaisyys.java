
import java.util.Scanner;

public class TaysiIkaisyys {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Kuinka vanha olet?");
        int i = Integer.parseInt(lukija.nextLine());
        if (i < 18) {
            System.out.println("Et ole täysi-ikäinen!");
        } else {
            System.out.println("Olet täysi-ikäinen!");
        }
    }
}
