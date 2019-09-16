
import java.util.Scanner;

public class Kokonaisluku {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Syötä luku!");
        String i = lukija.nextLine();
        Integer.parseInt(i);
        
        System.out.println("Syötit luvun " + i);

    }
}
