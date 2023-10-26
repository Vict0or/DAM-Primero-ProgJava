import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class EjemploMapas {
    public static void main(String[] args) {
        //HashMap
        Map <Integer, String> hashmap = new HashMap<>();
        hashmap.put(1, "Valor UNO");
        System.out.println(hashmap);
        //TreeMap
        Map <Integer, String> treemap = new TreeMap<>();
        treemap.put(2, "Valor DOS");
        System.out.println(treemap);
        //LinkedHashMap
        Map <Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(3, "Valor TRES");
        System.out.println(linkedHashMap);
    }
}
