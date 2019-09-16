
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Paaohjelma {

    public static void main(String[] args) {
        // tee testikoodia tänne
        int[] taulukko = {3, 1, 5, 99, 3, 12};
        jarjesta(taulukko);
        System.out.println(taulukko);
    }

    public static int pienin(int[] taulukko) {
        int pienin = taulukko[0];
        for (int i : taulukko) {
            if (i < pienin) {
                pienin = i;
            }
        }
        return pienin;
    }

    public static int pienimmanIndeksi(int[] taulukko) {
        int pienin = pienin(taulukko);
        for (int i = 0; i < taulukko.length; i++) {
            if (taulukko[i] == pienin) {
                return i;
            }
        }
        return -1;
    }

    public static int pienimmanIndeksiAlkaen(int[] taulukko, int aloitusIndeksi) {
        int pienin = taulukko[aloitusIndeksi];
        int indeksi = aloitusIndeksi;
        for (int i = aloitusIndeksi; i < taulukko.length; i++) {
            if (taulukko[i] < pienin) {
                pienin = taulukko[i];
                indeksi = i;
            }
        }
        return indeksi;
    }

    public static void vaihda(int[] taulukko, int eka, int toka) {
        int kopio = taulukko[eka];
        taulukko[eka] = taulukko[toka];
        taulukko[toka] = kopio;
    }

    public static void jarjesta(int[] taulukko) {
        int temp;
        for (int i = 1; i < taulukko.length; i++) {
            for (int j = i; j > 0; j--) {
                if (taulukko[j] < taulukko[j - 1]) {
                    temp = taulukko[j];
                    taulukko[j] = taulukko[j - 1];
                    taulukko[j - 1] = temp;
                }
            }
        }
    }
}
