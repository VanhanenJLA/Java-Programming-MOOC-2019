
public enum Maa {
    RISTI(1), RUUTU(2), HERTTA(3), PATA(4);

    private int arvo;

    private Maa(int arvo) {
        this.arvo = arvo;
    }

    public int getArvo() {
        return arvo;
    }

}
