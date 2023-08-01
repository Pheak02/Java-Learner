public class throwsKeyword {
    public static void divideByZero() throws ArithmeticException {
        int divideByZero = 5 / 0;
    }

    public static void main(String[] args) {
        // throw new ArithmeticException("Trying to divide by 0");
        try {
            divideByZero();
        } catch (ArithmeticException e) {
            System.out.println(e);
        }

    }
}
