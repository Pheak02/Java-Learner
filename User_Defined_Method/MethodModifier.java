package User_Defined_Method;

public class MethodModifier {
    public static void main(String[] args) {
        MethodModifier obj = new MethodModifier();
        obj.add(3, 4);

    }

    public void add(int a, int b) { // won't be a class - can't be call to use
        int c = a + b;
        System.out.println(c);
    }
}
