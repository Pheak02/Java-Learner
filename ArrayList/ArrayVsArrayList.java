package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayVsArrayList {
    public static void main(String[] args) {
        String[] frieldArray1 = new String[4]; // it has the fix size
        String[] frieldArray2 = { "Jonh", "Chris", "Eric", "Luke" }; // declear size by implied its elements
        ArrayList<String> friendsArrayList = new ArrayList<>(); // has dynamic size
        ArrayList<String> friendsArrayList2 = new ArrayList<>(Arrays.asList("Jonh", "Chris", "Eric", "Luke"));
        System.out.println(frieldArray2[1]);
        System.out.println(friendsArrayList2.get(1));

    }

}
