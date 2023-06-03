package Hashmap;

import java.util.HashMap;

public class Maps {
    public static void main(String[] args) {
        HashMap<String, Integer> empIds = new HashMap<>(); // map of str to int
        empIds.put("Meisme", 01);
        empIds.put("Dnao", 02);
        empIds.put("kalo", 03);
        System.out.println(empIds);
        System.out.println(empIds.get("kalo"));
        System.out.println(empIds.containsValue(01));
        System.out.println(empIds.containsKey("sopheak"));
        // OVERWRITE OLD VALUE
        empIds.put("kalo", 04);
        System.out.println(empIds);
        empIds.putIfAbsent("Jonh", 222);
        System.out.println(empIds);

        empIds.putIfAbsent("Thida", 2525);
        System.out.println(empIds);
        empIds.remove("Thida", 2525);
        System.out.println(empIds);

    }
}