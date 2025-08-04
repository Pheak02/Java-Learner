package Hashmap;

import java.util.HashMap;

public class nestedHashmap {
    public static void main(String[] args) {
        HashMap<String, String> employee1 = new HashMap<>();
        employee1.put("id", "001");
        employee1.put("name", "Saing Sopheak");
        employee1.put("department", "ITE");
        HashMap<String, HashMap<String, String>> allEmployee = new HashMap<>();
        allEmployee.put("001", employee1);
        System.out.println(allEmployee);

    }
}