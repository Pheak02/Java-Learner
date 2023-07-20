import java.util.Scanner;

class exercise {
    public static void main(String[] arg) {
        String[] months = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
                "October", "November", "December" };
        int[] dom = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        Scanner month = new Scanner(System.in);
        System.out.print("Enter an integer between 1 to 12 that represent the month: ");
        Integer monthNum = month.nextInt();
        try {
            switch (monthNum) {
                case 1:
                    System.out.println(dom[0]);
                    break;
                case 2:
                    System.out.println(dom[1]);
                    break;
                case 3:
                    System.out.println(dom[2]);
                    break;
                case 4:
                    System.out.println(dom[3]);
                    break;
                case 5:
                    System.out.println(dom[4]);
                    break;
                case 6:
                    System.out.println(dom[5]);
                    break;
                case 7:
                    System.out.println(dom[6]);
                    break;
                case 8:
                    System.out.println(dom[7]);
                    break;
                case 9:
                    System.out.println(dom[8]);
                    break;
                case 10:
                    System.out.println(dom[9]);
                    break;
                case 11:
                    System.out.println(dom[10]);
                case 12:
                    System.out.println(dom[11]);
                    break;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);

        }

    }
}