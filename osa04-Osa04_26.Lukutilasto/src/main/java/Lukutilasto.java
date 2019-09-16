
public class Lukutilasto {

    private int lukujenMaara;
    private int summa;

    public Lukutilasto() {
        // alusta tässä muuttujat maara ja summa
        lukujenMaara = 0;
        summa = 0;
    }

    public void lisaaLuku(int luku) {
        summa += luku;
        lukujenMaara++;
    }

    public int haeLukujenMaara() {
        return lukujenMaara;
    }

    public int summa() {
        return summa;
    }

    public double keskiarvo() {
        if (lukujenMaara == 0) {
            return 0;
        }
        return (double) summa / lukujenMaara;
    }
}
