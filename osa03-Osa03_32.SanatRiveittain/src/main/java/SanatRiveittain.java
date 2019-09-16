
import java.util.Scanner;

public class SanatRiveittain {

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
            
            for (String string : palat) {
                System.out.println(string);
            }
        }


    }
}
