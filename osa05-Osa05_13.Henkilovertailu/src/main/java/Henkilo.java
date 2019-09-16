import java.util.Objects;
 
public class Henkilo {
 
    private String nimi;
    private Paivays syntymaPaiva;
    private int pituus;
    private int paino;
 
    public Henkilo(String nimi, Paivays syntymaPaiva, int pituus, int paino) {
        this.nimi = nimi;
        this.syntymaPaiva = syntymaPaiva;
        this.pituus = pituus;
        this.paino = paino;
    }
 
    // toteuta tänne equals-metodi, jolla tarkastellaan olioiden samuutta
    // Tämä on luotu NetBeansin avulla automaattisesti
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Henkilo other = (Henkilo) obj;
        if (this.pituus != other.pituus) {
            return false;
        }
        if (this.paino != other.paino) {
            return false;
        }
        if (!Objects.equals(this.nimi, other.nimi)) {
            return false;
        }
        if (!Objects.equals(this.syntymaPaiva, other.syntymaPaiva)) {
            return false;
        }
        return true;
    }
 
}