import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        // int[] grades = new int[10];
        // grades[0] = 10;
        int[] grades = { 10, 7, 8, 4, 5, 2, 9 };
        // overwrite array element
        // grades[0] = 900;
        System.out.println(Arrays.toString(grades));

        int[][] grades1 = { { 7, 8, 4 }, { 5, 2, 9 } };
        System.out.println(Arrays.deepToString(grades1));
    }
}