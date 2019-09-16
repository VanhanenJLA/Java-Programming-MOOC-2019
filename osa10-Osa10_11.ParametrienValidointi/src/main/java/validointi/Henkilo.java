package validointi;

public class Henkilo {

    private String nimi;
    private int ika;

    public Henkilo(String nimi, int ika) {
        validoiHenkiloSyote(nimi, ika);
        this.nimi = nimi;
        this.ika = ika;
    }

    public String getNimi() {
        return nimi;
    }

    public int getIka() {
        return ika;
    }

    private void validoiHenkiloSyote(String nimi, int ika) {
        if (isNullOrEmpty(nimi)) {
            throw new IllegalArgumentException();
        }

        if (nimi.length() > 40) {
            throw new IllegalArgumentException();
        }

        if (ika > 120) {
            throw new IllegalArgumentException();

        }
        if (ika < 0) {
            throw new IllegalArgumentException();
        }
    }

    public static boolean isNullOrEmpty(String str) {
        if (str != null && !str.trim().isEmpty()) {
            return false;
        }
        return true;
    }
}
