
import java.util.Scanner;

public class Orwell {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

                System.out.println("Anna luku:");
        int i = Integer.parseInt(lukija.nextLine());
        if (i == 1984) {
            System.out.println("Orwell");
        }
    }
}
