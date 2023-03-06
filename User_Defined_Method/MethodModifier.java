package User_Defined_Method;

public class MethodModifier {
    public static void main(String[] args) {
        add(3, 4);

    }

    public static void add(int a, int b) { // won't be a class - can't be call to use
        int c = a + b;
        System.out.println(c);
    }
}
