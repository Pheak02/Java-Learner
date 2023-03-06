import java.util.Arrays;
import java.util.Scanner;

// public class Array {
//     public static void main(String[] args) {
//         int[] grades = new int[10];
//         Scanner input = new Scanner(System.in);
//         // grades[0] = 10;
//         // int[] grades = { 10, 7, 8, 4, 5, 2, 9 };
//         // overwrite array element
//         // grades[0] = 900;
//         // System.out.println(Arrays.toString(grades));

//         // array inside array
//         // int[][] grades1 = { { 7, 8, 4 }, { 5, 2, 9 } };
//         // System.out.println(Arrays.deepToString(grades1));
//         for (int i = 0; i < 10; i++) {
//             int x = input.nextInt();
//             grades[i] = x;
//         }
//         System.out.println(Arrays.toString(grades));
//     }
// }

// input with the size of the arrays
public class Array {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int size = input.nextInt();
            int[] grades = new int[size];

            for (int i = 0; i < size; i++) {
                int x = input.nextInt();
                grades[i] = x;
            }
            System.out.println(Arrays.toString(grades));
        }
    }
}