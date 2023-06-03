package Hashmap;

import java.util.HashMap;

public class Maps {
    public static void main(String[] args) {
        // create a hashmap
        HashMap<String, Integer> numbers = new HashMap<>();

        System.out.println("Initial HashMap: " + numbers);
        // put() method to add elements
        numbers.put("One", 1);
        numbers.put("Two", 2);
        numbers.put("Three", 3);
        System.out.println("HashMap after put(): " + numbers);
        numbers.putIfAbsent("Hundred", 100);
        System.out.println("HashMap after put()insert specific value, that's not present: " + numbers);
        numbers.clear();
        System.out.println("Map after using clear method:" + numbers);
    }
}