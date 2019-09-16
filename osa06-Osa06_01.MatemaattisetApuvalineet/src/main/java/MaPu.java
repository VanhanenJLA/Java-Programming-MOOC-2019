
import java.util.ArrayList;

public class MaPu {

    public static double keskiarvo(ArrayList<Integer> luvut) {
        int sum = 0;
        for (Integer integer : luvut) {
            sum += integer;
        }
        return (double) sum / luvut.size();
    }
}
