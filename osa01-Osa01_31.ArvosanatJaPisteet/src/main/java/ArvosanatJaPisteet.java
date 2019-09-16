
import java.util.Scanner;

public class ArvosanatJaPisteet {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Anna pisteet [0-100]:");
        int i = Integer.parseInt(lukija.nextLine());
        String arvosana = "";

        if (i > 100) {
            arvosana = "uskomatonta!";
        }
        if (i <= 100) {
            arvosana = "5";
        }
        if (i < 90) {
            arvosana = "4";
        }
        if (i < 80) {
            arvosana = "3";
        }
        if (i < 70) {
            arvosana = "2";
        }
        if (i < 60) {
            arvosana = "1";
        }
        if (i < 50) {
            arvosana = "hylätty!";
        }
        if (i < 0) {
            arvosana = "mahdotonta!";
        }
        System.out.println("Arvosana: " + arvosana);
    }
}
