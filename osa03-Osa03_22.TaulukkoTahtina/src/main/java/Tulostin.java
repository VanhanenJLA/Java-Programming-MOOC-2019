
public class Tulostin {

    public static void main(String[] args) {
        // Tässä voit testata metodia
        int[] taulukko = {5, 1, 3, 4, 2};
        tulostaTaulukkoTahtina(taulukko);
    }

    public static void tulostaTyylikkaasti(int[] taulukko) {
        // Kirjoita koodia tänne
        int i = 0;
        while (i < taulukko.length) {
            System.out.print(taulukko[i]);
            if (i < taulukko.length - 1) {
                System.out.print(", ");
            }

            i++;
        }
        System.out.println();
    }

}
