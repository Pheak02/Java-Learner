package basic;

public class dataTypes {
    public static void main(String[] arg) {
        // int myNum = 5; // Integer (whole number)
        // float myFloatNum = 5.99f; // Floating point number
        // char myLetter = 'D'; // Character
        // boolean myBool = true; // Boolean
        // String myText = "Hello"; // String

        // INTEGER TYPE
        byte myNum = 100;
        System.out.println("can store form -128 to 127, can use instead of int :" + myNum); // Integer(who num)
        short myNum1 = 5000;
        System.out.println("can store whole numbers from -32768 to 32767 :" + myNum1);
        int myNum2 = 100000;
        System.out.println("from -2147483648 to 2147483647 :" + myNum2);
        long myNum3 = 150000000000000L;
        System.out.println("-9223372036854775808 to 9223372036854775807, should end value with L :" + myNum3);
        // FLOAT POINT TYPE
        float myNum4 = 5.63f;
        System.out.println("when use number with decimal, can store only 6 or 7 digits :" + myNum4);
        double myNum5 = 19.99d;
        System.out.println("can store until 15 decimal digits :" + myNum5);
        // SCIENTIFIC NUMBER
        float f1 = 35e3f;
        double d1 = 12E4d;
        System.out.println(f1);
        System.out.println(d1);

    }

}