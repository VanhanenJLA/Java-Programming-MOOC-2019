
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TiettyjenLukujenKeskiarvo {

    public static void main(String[] args) {

        Scanner lukija = new Scanner(System.in);
        List<String> syotteet = new ArrayList<>();

// luetaan syotteet
        while (true) {
            String rivi = lukija.nextLine();
            if (rivi.equals("loppu")) {
                break;
            }

            syotteet.add(rivi);
        }

        double keskiarvo;

        System.out.println("Tulostetaanko negatiivisten vai positiivisten lukujen keskiarvo? (n / p)");
        if (lukija.nextLine().equals("n")) {

            keskiarvo = syotteet.stream()
                    .mapToInt(s -> Integer.valueOf(s))
                    .filter(luku -> onkoNegatiivinen(luku))
                    .average()
                    .getAsDouble();
        } else {
            keskiarvo = syotteet.stream()
                    .mapToInt(s -> Integer.valueOf(s))
                    .filter(luku -> !onkoNegatiivinen(luku))
                    .average()
                    .getAsDouble();
        }
        System.out.println("Lukujen keskiarvo: " + keskiarvo);

    }

    public static boolean onkoNegatiivinen(int luku) {
        if (luku < 0) {
            return true;
        }
        return false;
    }
}
