
import java.util.Scanner;

public class RajatunLukusarjanSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Ensimmäinen:");
        int i = Integer.valueOf(lukija.nextLine());
        System.out.println("Viimeinen:");
        int j = Integer.valueOf(lukija.nextLine());
        int sum = 0;

        while (i < j+1) {
            sum += i;
            i++;
        }
        System.out.println("Summa on " + sum);
    }
}
