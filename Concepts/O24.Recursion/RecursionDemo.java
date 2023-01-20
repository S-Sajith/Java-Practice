package O24.Recursion;

public class RecursionDemo {
    public static void main(String[] args) {

        // Example while calculating factorial
        System.out.println(factorial(4));
    }

    private static int factorial(int value) {

        if (value == 0){
            return 1;
        }
        return factorial(value - 1) * value;
        // calculate(value); this (Recursion) causes StackOverFlowError
    }
}
