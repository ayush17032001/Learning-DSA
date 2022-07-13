package Collection_framework_practise;
import java.util.Map;
import java.util.HashMap;
public class LearnMap {
    public static void main(String[] args) {
        Map<String, Integer> hm = new HashMap<>();
        hm.put("First", 89);
        hm.put("Second", 57);
        hm.put("Third", 11);
        hm.put("Fourth", 974);
        System.out.println(hm);

        for(Map.Entry<String,Integer> e: hm.entrySet()){
            System.out.println(e);
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
        System.out.println(" ");

        for(String key:hm.keySet()){
            System.out.println(key);
        }
        System.out.println(" ");

        for(Integer value:hm.values()){
            System.out.println(value);
        }
    }
}
