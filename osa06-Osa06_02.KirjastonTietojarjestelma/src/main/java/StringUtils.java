public class StringUtils {
 
    public static boolean sisaltaa(String sana, String haettava) {
        if (sana == null || haettava == null) {
            return false;
        }
 
        sana = sana.trim();
        haettava = haettava.trim();
 
        sana = sana.toUpperCase();
        haettava = haettava.toUpperCase();
 
        return sana.contains(haettava);
    }
}