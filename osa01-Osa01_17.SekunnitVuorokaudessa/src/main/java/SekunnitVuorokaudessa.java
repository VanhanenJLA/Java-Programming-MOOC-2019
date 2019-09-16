
import java.util.Scanner;

public class SekunnitVuorokaudessa {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Kuinka monen vuorokauden sekunnit tulostetaan?");
        Integer i = Integer.parseInt(lukija.nextLine());
        System.out.println(i*24*60*60);
        

    }
}
