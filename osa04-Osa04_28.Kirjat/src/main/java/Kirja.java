public class Kirja {

    private String nimi;
    private int sivuja;
    private int kirjoitusvuosi;

    public Kirja(String nimi, int sivuja, int kirjoitusvuosi) {
        this.nimi = nimi;
        this.sivuja = sivuja;
        this.kirjoitusvuosi = kirjoitusvuosi;
    }

    public String getNimi() {
        return nimi;
    }

    @Override
    public String toString() {
        return this.nimi + ", " + this.sivuja + " sivua, " + this.kirjoitusvuosi;
    }
}