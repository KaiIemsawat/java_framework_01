import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class WarmUp {
    public static void main(String[] args) {
        String[] strArr = {"White", "Black", "Green", "Red", "Yellow"};
        Map<String, Integer> resMap = getColorsLen(strArr);
        System.out.println(resMap);
    }

    public static Map<String, Integer> getColorsLen(String[] strArr) {
        Map<String, Integer> ret = new LinkedHashMap<>();
        for (String keys : strArr) {
            ret.put(keys, keys.length());
        }
        return ret;
    }
}
