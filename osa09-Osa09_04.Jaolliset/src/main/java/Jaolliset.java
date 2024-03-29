
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Jaolliset {

    public static void main(String[] args) {
        ArrayList<Integer> luvut = new ArrayList<>();
        luvut.add(3);
        luvut.add(2);
        luvut.add(-17);
        luvut.add(-5);
        luvut.add(7);

        ArrayList<Integer> jaolliset = jaolliset(luvut);

        jaolliset.stream()
                .forEach(luku -> System.out.println(luku));
    }

    public static ArrayList<Integer> jaolliset(ArrayList<Integer> luvut) {
        return luvut.stream()
                .filter(luku -> onkoJaollinen(luku))
                .collect(Collectors.toCollection(() -> {
                    return new ArrayList<>();
                }));
    }

    private static boolean onkoJaollinen(Integer luku) {
        if (luku % 2 == 0) {
            return true;
        }
        if (luku % 3 == 0) {
            return true;
        }
        if (luku % 5 == 0) {
            return true;
        }
        return false;
    }

}
