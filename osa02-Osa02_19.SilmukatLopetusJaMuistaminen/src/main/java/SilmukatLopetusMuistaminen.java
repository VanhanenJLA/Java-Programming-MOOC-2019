
import java.util.Scanner;

public class SilmukatLopetusMuistaminen {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        int lukuja, parillisia, parittomia, sum;
        sum = lukuja = parillisia = parittomia = 0;

        System.out.println("Syötä luvut:");
        while (true) {
            int i = Integer.valueOf(lukija.nextLine());
            if (i == -1) {
                break;
            }

            if (i % 2 == 0) {
                parillisia++;
            } else {
                parittomia++;
            }

            sum += i;
            lukuja++;

        }
        System.out.println("Kiitos ja näkemiin!");
        System.out.println("Summa: " + sum);
        System.out.println("Lukuja: " + lukuja);
        System.out.println("Keskiarvo: " + ka(sum, lukuja));
        System.out.println("Parillisia: " + parillisia);
        System.out.println("Parittomia: " + parittomia);

    }

    static double ka(int sum, int lukuja) {
        return (double) sum / lukuja;
    }
}
