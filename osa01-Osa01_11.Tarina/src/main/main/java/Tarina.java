
import java.util.Scanner;

public class Tarina {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Kerron kohta tarinan, mutta tarvitsen siihen hieman tietoja.\n"
                + "Minkä niminen tarinassa esiintyvä hahmo on?");
        String s = lukija.nextLine();
        System.out.println("Mikä hahmon ammatti on?");
        String r = lukija.nextLine();
        System.out.println("Tässä tarina:");
        System.out.println("Olipa kerran " + s + ", joka oli ammatiltaan "+ r +".\n"
                + "Matkatessaan töihin, " + s + " mietti arkeaan. Kun työnä\n"
                + "on " + r + ", tekemistä riittää välillä hyvin paljon ja\n"
                + "välillä ei lainkaan. Ehkäpä " + s + " ei olekaan koko\n"
                + "elämäänsä " + r + ".");

    }
}
