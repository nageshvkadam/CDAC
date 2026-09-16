package Collection.Core_interface;
import java.util.HashMap;
import java.util.Map;

public class MapOperations {

    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();

        map.put(1, "Java");
        map.put(2, "Python");
        map.put(3, "C++");
        map.put(4, "JavaScript");

        System.out.println("Map elements: " + map);

        System.out.println("Value of key 2: " + map.get(2));

        System.out.println("Contains key 3? " + map.containsKey(3));

        System.out.println("Contains value Java? " + map.containsValue("Java"));

        
        map.remove(4);
        System.out.println("After removing key 4: " + map);

        map.replace(3, "Spring Boot");
        System.out.println("After replace: " + map);

        System.out.println("Size of map: " + map.size());

        System.out.println("Keys: " + map.keySet());

        System.out.println("Values: " + map.values());

        System.out.println("Key-Value pairs: " + map.entrySet());

        System.out.println("Iterating Map:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        map.clear();
        System.out.println("After clear: " + map);

        System.out.println("Is map empty? " + map.isEmpty());
    }
}