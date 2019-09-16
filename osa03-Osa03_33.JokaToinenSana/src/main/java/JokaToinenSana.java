
import java.util.Scanner;

public class JokaToinenSana {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int ikienSumma = 0;
        int ikienLukumaara = 0;

        while (true) {
            String luettu = lukija.nextLine();
            if (luettu.equals("")) {
                break;
            }
            String[] palat = luettu.split(" ");

            int cnt = 1;

            for (String string : palat) {
                if (cnt % 2 == 0) {
                    System.out.println(string);
                }
                cnt++;
            }
        }

    }
}
