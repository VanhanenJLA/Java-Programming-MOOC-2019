
import java.util.Scanner;

public class LuvustaSataan {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        int i = Integer.valueOf(lukija.nextLine());
        
        for (int j = i; j < 101; j++) {
            System.out.println(j);
        }
    }
}
