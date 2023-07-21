package exercises;
import java.util.HashMap;
import java.util.Map;

public class ObjectsClass {
    public static void main(String[] args) {
        HashMap<String, String> names = new HashMap<>();
        names.put("ARYSE", "MEDIC1111");
        names.put("BRUNA", "SISTA");
        names.put("ANA", "PIU");
        names.put("MARIA", "DUDU");

        System.out.println(names);

        String realName = names.get("ARYSE");
        System.out.println(realName);
        System.out.println(names.keySet());
        System.out.println(names.values());
        System.out.println(names.size());
        System.out.println(names.containsKey("MARIA"));
        System.out.println(names.containsValue("DUDU"));



    }
}
