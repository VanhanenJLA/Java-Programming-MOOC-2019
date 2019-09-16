
public class Ohjelma {

    public static void main(String[] args) {
        int[][] matriisi = {
            {3, 2, 7, 6},
            {2, 4, 1, 0},
            {3, 2, 1, 0}
        };

        System.out.println(taulukkoMerkkijonona(matriisi));
    }

    public static String taulukkoMerkkijonona(int[][] taulukko) {
        StringBuilder sb = new StringBuilder();
        for (int x = 0; x < taulukko.length; x++) {
            for (int y = 0; y < taulukko[x].length; y++) {
                sb.append(taulukko[x][y]);
            }
            sb.append("\n");
        }
        return sb.toString();
    }

}
