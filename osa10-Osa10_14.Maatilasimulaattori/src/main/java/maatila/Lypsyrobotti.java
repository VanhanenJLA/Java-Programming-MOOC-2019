package maatila;

public class Lypsyrobotti {

    private Maitosailio maitosailio;

    public Maitosailio getMaitosailio() {
        return maitosailio;
    }

    public void setMaitosailio(Maitosailio maitosailio) {
        this.maitosailio = maitosailio;
    }

    public void lypsa(Lypsava lypsava) {
        if (maitosailio == null) {
            System.out.println("Maidot menevät hukkaan!");
            lypsava.lypsa();
        } else {
            maitosailio.lisaaSailioon(lypsava.lypsa());
        }

    }
}
