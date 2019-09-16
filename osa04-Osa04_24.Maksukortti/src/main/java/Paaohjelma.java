
public class Paaohjelma {

    public static void main(String[] args) {
        // Scanner lukija = new Scanner(System.in);

        // Tee tänne koodia jolla testaat että Maksukortti toimii halutulla tavalla
        // muista kuitenkin pyyhkiä ylimääräinen koodi pois tehtävän viimeisessä osassa!
        Maksukortti pk = new Maksukortti(20);
        Maksukortti mk = new Maksukortti(30);

        pk.syoMaukkaasti();
        mk.syoEdullisesti();

        System.out.println("Pekka: " + pk.toString());
        System.out.println("Matti: " + mk.toString());

        pk.lataaRahaa(20);
        mk.syoMaukkaasti();
        
        System.out.println("Pekka: " + pk.toString());
        System.out.println("Matti: " + mk.toString());

        pk.syoEdullisesti();
        pk.syoEdullisesti();

        mk.lataaRahaa(50);

        System.out.println("Pekka: " + pk.toString());
        System.out.println("Matti: " + mk.toString());

    }

}
