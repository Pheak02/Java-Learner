public class StringMethod {
    public static void main(String[] args) {
        String mainStatement = "Java is Fun as Java is boring";
        System.out.println(mainStatement.indexOf('a'));
        // may have to slit the word of string first
        System.out.println(mainStatement.lastIndexOf('a'));
        System.out.println(mainStatement.substring(15));

    }
}