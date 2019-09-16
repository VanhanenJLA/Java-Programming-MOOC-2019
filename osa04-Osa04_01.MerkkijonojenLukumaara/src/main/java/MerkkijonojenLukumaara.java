
import java.util.ArrayList;
import java.util.Scanner;

public class MerkkijonojenLukumaara {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        ArrayList<String> s = new ArrayList<>();

        while (true) {
            String rivi = lukija.nextLine();

            if (rivi.equals("loppu")) {
                break;
            }
            
            s.add(rivi);

            // lisää luettu rivi listalle myöhempää käsittelyä
            // varten tai käsittele rivi heti
        }
        
        System.out.println(s.size());
    }
}
