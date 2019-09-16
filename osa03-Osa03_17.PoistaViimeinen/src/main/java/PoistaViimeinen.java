
import java.util.ArrayList;

public class PoistaViimeinen {

    public static void main(String[] args) {
        ArrayList<String> mjonot = new ArrayList();
        mjonot.add("A");
        mjonot.add("B");
        mjonot.add("C");
        poistaViimeinen(mjonot);
        System.out.println(mjonot);
    }

    public static void poistaViimeinen(ArrayList<String> mjonot) {
        if (mjonot.isEmpty()) {
            return;
        }

        mjonot.remove(mjonot.size() - 1);
    }

}
