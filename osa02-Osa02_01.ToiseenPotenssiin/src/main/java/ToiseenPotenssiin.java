
import java.util.Scanner;

public class ToiseenPotenssiin {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int i = Integer.valueOf(lukija.nextLine());
        System.out.println(Math.pow(i, 2));
    }
}
