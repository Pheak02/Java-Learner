package Explore;

public class coreConcept {
    public static void main(String[] args) {
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

    }

    public static void addExlamationPoint(String s) {
        System.out.println(s + "!");
    }
}
