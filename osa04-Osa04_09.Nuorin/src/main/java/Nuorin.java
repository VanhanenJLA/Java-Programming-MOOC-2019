
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Nuorin {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        Map<String, Integer> mappi = new HashMap<>();

        while (true) {
            String luettu = lukija.nextLine();
            if ("loppu".equals(luettu)) {
                break;
            }
            String[] split = luettu.split(",");
            mappi.put(split[0], Integer.valueOf(split[1]));
        }
        String nimi = "";
        int pienin = 9999;
        for (Map.Entry<String, Integer> entry : mappi.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            if (value < pienin) {
                pienin = value;
                nimi = key;
            }
        }

        System.out.println("Nuorin oli: " + nimi);
    }
}
