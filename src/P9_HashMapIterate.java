import java.util.HashMap;
import java.util.Map;

public class P9_HashMapIterate {

    public static void main(String[] args) {

        HashMap<String, Integer> people = new HashMap<>();

        people.put("Hiren", 11);
        people.put("Dhwanit", 22);
        people.put("Hiral", 33);

        for (Map.Entry<String, Integer> people1 : people.entrySet()){
            System.out.println(people1.getValue());
        }
    }
}
