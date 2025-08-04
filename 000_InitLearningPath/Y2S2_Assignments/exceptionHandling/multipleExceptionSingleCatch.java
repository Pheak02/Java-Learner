public class multipleExceptionSingleCatch {
    public static void main(String[] args) {
        try {
            int array[] = new int[10];
            array[20] = 30 / 1;

        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());

        }
    }

}
