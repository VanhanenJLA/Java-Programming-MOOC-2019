
import java.util.Scanner;

public class MihinJaMista {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Mihin asti?");
        int i = Integer.valueOf(lukija.nextLine());
        System.out.println("Mistä alkaen?");
        int j = Integer.valueOf(lukija.nextLine());

        while (j <= i) {
            System.out.println(j);
            j++;
        }
    }
}
