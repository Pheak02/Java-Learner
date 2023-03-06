package User_Defined_Method;

public class ReturningMethod {
    public static void main(String[] args) {
        int answer = add(2, 5);
        System.out.println(answer);
    }

    public static int add(int x, int y) {
        return x + y;
    }

}
