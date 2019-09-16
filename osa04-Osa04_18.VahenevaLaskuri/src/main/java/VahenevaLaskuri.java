
public class VahenevaLaskuri {

    private int arvoAlussa;
    private int arvo;  // oliomuuttuja joka muistaa laskurin arvon

    public VahenevaLaskuri(int arvoAlussa) {
        this.arvo = arvoAlussa;
        this.arvoAlussa = arvoAlussa;
    }

    public void tulostaArvo() {
        // älä koske tässä olevaan koodiin!
        System.out.println("arvo: " + this.arvo);
    }

    public void vahene() {
        
        if (this.arvo > 0) {
            this.arvo--;
        }
        
        // kirjoita tänne metodin toteutus
        // laskurin arvon on siis tarkoitus vähentyä yhdellä
    }
    
    public void nollaa() {
        this.arvo = 0;
    }
    
    public void palautaAlkuarvo() {
        this.arvo = arvoAlussa;
    }

    // ja tänne muut metodit
}
