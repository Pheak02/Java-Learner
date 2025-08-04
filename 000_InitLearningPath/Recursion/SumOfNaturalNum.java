package Recursion;

public class SumOfNaturalNum {
    public static int recursiveSummation(int inputNum) {
        if (inputNum <= 1)
            return inputNum; // stop the condition
        return inputNum + recursiveSummation(inputNum - 1); // return Recursive call
    }

    public static void main(String[] args) {
        int result = recursiveSummation(5);
        int result1 = recursiveSummation(10);
        System.out.println(result);
        System.out.println(result1);
    }

}
