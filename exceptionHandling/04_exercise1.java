import java.util.Scanner;

class exercise {
    public static void main(String[] arg) {
        try {
            Scanner month = new Scanner(System.in);
            System.out.print("Enter an integer between 1 to 12 that represent the month: ");
            Integer monthNum = month.nextInt();
            switch (monthNum) {
                case 1:
                    System.out.println("31");
                    break;
                case 2:
                    System.out.println("28");
                    break;
                case 3:
                    System.out.println("31");
                    break;
                case 4:
                    System.out.println("30");
                    break;
                case 5:
                    System.out.println("31");
                    break;
                case 6:
                    System.out.println("31");
                    break;
                case 7:
                    System.out.println("30");
                    break;
                case 8:
                    System.out.println("31");
                    break;
                case 9:
                    System.out.println("30");
                    break;
                case 10:
                    System.out.println("31");
                    break;
                case 11:
                    System.out.println("30");
                    break;
                case 12:
                    System.out.println("31");
                    break;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
    }
}