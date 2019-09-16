
import java.util.ArrayList;

public class Summa {

    public static void main(String[] args) {
        // kokeile toteuttamasi metodin toimintaa täällä
    }
    
    public static int summa(ArrayList<Integer> luvut) {
        int sum = 0;
        for (Integer integer : luvut) {
            sum += integer;
        }
        return sum;
    }

}
