package gameoflife;

import java.util.Random;

public class GameOfLife {

    private int[][] taulukko;

    public GameOfLife(int leveys, int korkeus) {
        this.taulukko = new int[leveys][korkeus];
    }

    public void alustaSatunnaisesti() {
        Random satunnaistaja = new Random();

        int x = 0;
        while (x < taulukko.length) {

            int y = 0;
            while (y < taulukko[x].length) {
                if (satunnaistaja.nextDouble() < 0.2) {
                    taulukko[x][y] = 1;
                }

                y++;
            }
            x++;
        }
    }

    public void kehity() {
        // säännöt kehittymiselle:

        // 1. jokainen elossa oleva alkio, jolla on alle 2 elossa olevaa naapuria kuolee
        // 2. jokainen elossa oleva alkio, jolla on 2 tai 3 elossa olevaa naapuria pysyy hengissä
        // 3. jokainen elossa oleva alkio, jolla on 4 tai enemmän naapureita kuolee
        // 4. jokainen kuollut alkio, jolla on tasan 3 naapuria muuttuu eläväksi
        // taulukossa arvo 1 kuvaa elävää alkiota, arvo 0 kuollutta alkiota
        int[][] kopio = new int[this.taulukko.length][this.taulukko[0].length];

        for (int x = 0; x < kopio.length; x++) {
            for (int y = 0; y < kopio.length; y++) {
                int naapureita = elossaOleviaNaapureita(taulukko, x, y);

                int arvo = taulukko[x][y];
                if (arvo == 1 && naapureita < 2) {
                    kopio[x][y] = 0;
                }

                if (arvo == 1 && (naapureita == 2 || naapureita == 3)) {
                    kopio[x][y] = 1;
                }

                if (arvo == 1 && naapureita > 3) {
                    kopio[x][y] = 0;
                }

                if (arvo == 0 && naapureita == 3) {
                    kopio[x][y] = 1;
                }
            }
        }

        this.taulukko = kopio;
    }

    public int[][] getTaulukko() {
        return taulukko;
    }

    public void setTaulukko(int[][] taulukko) {
        this.taulukko = taulukko;
    }

    public int elossaOleviaNaapureita(int[][] taulukko, int x, int y) {
        int naapureita = 0;

        for (int xMuunnos = -1; xMuunnos <= 1; xMuunnos++) {
            if (xMuunnos + x < 0 || xMuunnos + x >= this.taulukko.length) {
                continue;
            }

            for (int yMuunnos = -1; yMuunnos <= 1; yMuunnos++) {
                if (yMuunnos + y < 0 || yMuunnos + y >= this.taulukko[x].length) {
                    continue;
                }

                if (yMuunnos == 0 && xMuunnos == 0) {
                    continue;
                }

                if (taulukko[xMuunnos + x][yMuunnos + y] == 1) {
                    naapureita++;
                }
            }
        }

        return naapureita;
    }
}