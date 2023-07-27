import java.util.Random;

public class Quicksort {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(100);
        }
        System.out.println("before:");
        printArray(numbers);

        quicksort(numbers, 0, numbers.length - 1);
        System.out.println("\nafter:");
        printArray(numbers);
    }

    private static void quicksort(int[] array, int lowIndex, int highIndex) {


    }

    private static void printArray(int[] numbers) {
    }
}