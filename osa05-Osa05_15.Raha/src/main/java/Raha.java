public class Raha {
 
    private final int euroa;
    private final int senttia;
 
    public Raha(int euroa, int senttia) {
 
        if (senttia > 99) {
            euroa += senttia / 100;
            senttia %= 100;
        }
 
        this.euroa = euroa;
        this.senttia = senttia;
    }
 
    public int eurot() {
        return euroa;
    }
 
    public int sentit() {
        return senttia;
    }
 
    public String toString() {
        String nolla = "";
        if (senttia < 10) {
            nolla = "0";
        }
 
        return euroa + "." + nolla + senttia + "e";
    }
 
    public Raha plus(Raha lisattava) {
        int eurot = euroa + lisattava.eurot();
        int sentit = senttia + lisattava.sentit();
 
        if (sentit > 99) {
            sentit -= 100;
            eurot++;
        }
 
        return new Raha(eurot, sentit);
    }
 
    public boolean vahemman(Raha verrattava) {
        return (100 * euroa + senttia) < (100 * verrattava.eurot() + verrattava.sentit());
    }
 
    public Raha miinus(Raha vahennettava) {
        int eurot = euroa - vahennettava.eurot();
        int sentit = senttia - vahennettava.sentit();
 
        if (sentit < 0) {
            sentit += 100;
            eurot--;
        }
 
        // jos raha menisi negatiiviseksi, palautetaan nolla
        if (eurot < 0) {
            return new Raha(0, 0);
        }
 
        return new Raha(eurot, sentit);
    }
}