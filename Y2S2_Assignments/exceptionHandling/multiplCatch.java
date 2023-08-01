public class multiplCatch {
    public static void main(String[] args) {
        try {
            int array[] = new int[10];
            array[20] = 30 / 0;
        } catch (ArithmeticException e) {
            System.out.println(e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
        /*
         * if the first catch can catch all err, the next catch won't have to func
         * handle: refers to what to do, when there's err found
         * then, if all the catch can't handle err w/ its type, will terminate
         * it usually arranges from the most specific to the less specific
         */
    }
}
