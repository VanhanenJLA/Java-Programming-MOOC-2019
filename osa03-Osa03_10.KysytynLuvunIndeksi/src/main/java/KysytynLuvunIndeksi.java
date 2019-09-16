
import java.util.ArrayList;
import java.util.Scanner;

public class KysytynLuvunIndeksi {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        ArrayList<Integer> lista = new ArrayList<>();
        while (true) {
            int luettu = Integer.valueOf(lukija.nextLine());
            if (luettu == -1) {
                break;
            }

            lista.add(luettu);
        }

        System.out.println("");
        System.out.println("Mitä etsitään?");
        int e = Integer.valueOf(lukija.nextLine());
        int i = 0;
        
        for (Integer integer : lista) {
            if (integer == e) {
                System.out.println("Luku " + e +" on indeksissä " + i);
            }
            i++;
        }
        // toteuta tänne toiminnallisuus luvun etsimiseen
    }
}
