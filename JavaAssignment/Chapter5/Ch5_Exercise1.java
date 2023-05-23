
//ITE-M5-G8, Group10, Ch05 Ex1, Present by Saing Sopheak(សាំង សុភក្ដិ)
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Ch5_Exercise1 {
    static ArrayList<Integer> removeInt(ArrayList<Integer> intNum) {

        return intNum;
    }

    public static void main(String[] args) {

        ArrayList<Integer> intNum = new ArrayList<>(Arrays.asList(5, 3, 4, 7, 6, 2, 9, 6));
        int duplicatedItem = 6;
        intNum.removeAll(Collections.singleton(duplicatedItem));
        System.out.println(intNum);

    }
}