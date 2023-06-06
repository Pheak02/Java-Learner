package Hashmap;

import java.util.HashMap;

public class streamInHashMap {
    HashMap<String, Integer> myMap = new HashMap<>();
    myMap.put("Apple", 1);
    myMap.put("Banana", 2);
    myMap.put("Orange", 3);

    myMap.entrySet().stream()
        .forEach(entry -> System.out.println(entry.getKey() + " : " + entry.getValue()));
}
