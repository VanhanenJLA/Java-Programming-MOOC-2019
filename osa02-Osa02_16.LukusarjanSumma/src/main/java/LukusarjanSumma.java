
import java.util.Scanner;

public class LukusarjanSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Mihin asti?");
        int i = Integer.valueOf(lukija.nextLine());
        int sum = 0;
        
        for (int j = 0; j < i+1; j++) {
            sum += j;
        }
        System.out.println("Summa on " + sum);
    }
}
