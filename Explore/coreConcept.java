package Explore;

public class coreConcept {
    public static void main(String[] args) {
        // USE ONE AND TWO METHODS
        // Primitive Type number - turn blue
        int a = 4;
        char b = 'B';
        long c = 400;
        double d = 3.2;
        // non-primitive type number - not turn blue - means it's an object
        String name = "Meisme";
        // when don't have sort of (), put ;
        System.out.println(name.toUpperCase()); // use with method()
        addExlamationPoint("Good Job, Pheak");
        // TO USE RETURN
        String returnSth = tryingToUseReturn("Good Job, Meisme");
        System.out.println(returnSth);

        // CALL CLASS OBJECT FROM ANOTHER FILE
        animal m = new animal();
        String monkey = m.iAmMonkey();
        System.out.println(monkey);

    }

    public static void addExlamationPoint(String s) {
        System.out.println(s + "!");
    }

    public static String tryingToUseReturn(String R) {
        return R + "!";
    }

}
