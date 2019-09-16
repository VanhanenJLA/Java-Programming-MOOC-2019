
import java.util.Scanner;

public class SummanNeliojuuri {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int i = 0;
        i += Integer.valueOf(lukija.nextLine());
        i += Integer.valueOf(lukija.nextLine());
        System.out.println(Math.sqrt(i));
    }
}
