public class CH4_Ex10 {
    public static void coutOccurences(int... numbers) {
        for (int i = 0; i < numbers.length; i++) {

            boolean alreadycount = false;
            for (int j = 0; j < i; j++) {
                if (numbers[i] == numbers[j]) {
                    alreadycount = true;
                    break;
                }
            }
            if (alreadycount) {
                continue;
            }
            // count the number of occurence
            int count = 0;
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    count++;
                }
            }
            // print time or times
            if (count > 1) {
                System.out.println(numbers[i] + " occurs " + count + " times.");
            } else {
                System.out.println(numbers[i] + " occurs " + count + " time.");
            }
        }
    }

    public static void main(String[] args) {
        int[] arrayOfNumber = new int[20];
        for (int i = 0; i < arrayOfNumber.length; i++) {
            arrayOfNumber[i] = (int) (Math.random() * arrayOfNumber.length);
        }
        for (int i = 0; i < arrayOfNumber.length; i++) {
            System.out.printf("%-5d", arrayOfNumber[i]);
        }
        System.out.println("");
        coutOccurences(arrayOfNumber);
    }
}
