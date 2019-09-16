
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class MittauksetTiedostosta {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.print("Tiedosto? ");
        String tiedosto = lukija.nextLine();
        System.out.print("Alaraja? ");
        int alaraja = Integer.valueOf(lukija.nextLine());
        System.out.print("Yläraja? ");
        int ylaraja = Integer.valueOf(lukija.nextLine());

        ArrayList<String> lista = new ArrayList<>();
        try (Scanner tiedostonLukija = new Scanner(new File(tiedosto))) {

            // luetaan tiedostoja kunnes kaikki rivit on luettu
            while (tiedostonLukija.hasNextLine()) {
                // luetaan yksi rivi
                String rivi = tiedostonLukija.nextLine();
                lista.add(rivi);
            }
        } catch (Exception e) {
            System.out.println("Tiedoston " + tiedosto + " lukeminen epäonnistui.");
        }

        int lkm = 0;
        for (String string : lista) {
            if (isWithin(string, ylaraja, alaraja)) {
                lkm++;
            }
        }

        System.out.println("Lukuja: " + lkm);

    }

    private static boolean isWithin(String string, int ylaraja, int alaraja) {
        int vertaus = Integer.valueOf(string);
        if (vertaus >= alaraja && vertaus <= ylaraja) {
            return true;
        }
        return false;
    }

}
