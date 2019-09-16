package sanakirja;

public class Ohjelma {

    public static void main(String[] args) {
        MuistavaSanakirja s = new MuistavaSanakirja("sanat-550.txt");
        s.lataa();
        s.poista("below");
        s.lisaa("tieokone", "computer");
        s.tallenna();
    }
}
