
import java.util.Scanner;

public class Ohjelma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int[] arvot = {8, -2, 3, 1, 1};
        System.out.println(summa(arvot, 0, arvot.length, 0, 999));

    }

    public static int summa(int[] taulukko, int mista, int mihin, int pienin, int suurin) {

        int sum = 0;
        if (mista < 0) {
            mista = 0;
        }

        if (mihin > taulukko.length) {
            mihin = taulukko.length;
        }

        for (int i = mista; i < mihin; i++) {
            if (onkoValilla(taulukko[i], pienin, suurin)) {
                sum += taulukko[i];
            }
        }
        return sum;
    }

    static boolean onkoValilla(int luku, int pienin, int suurin) {
        if (luku > suurin || luku < pienin) {
            return false;
        }
        return true;
    }

}
