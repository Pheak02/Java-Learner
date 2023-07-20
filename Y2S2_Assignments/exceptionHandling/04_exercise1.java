import java.util.Scanner;

class exercise {
    public static void main(String[] arg) {
        String[] months = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
                "October", "November", "December" };
        int[] dom = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        Scanner month = new Scanner(System.in);
        System.out.print("Enter an integer between 1 to 12 that represent the month: ");
        Integer monthNum = month.nextInt();
        for (monthNum = 1; monthNum < months.length - 1; monthNum++) {
            try {
                if (monthNum)
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e);

            }

        }

    }
}