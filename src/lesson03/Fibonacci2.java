package lesson03;

public class Fibonacci2 {

    private static int calcFibonacci(int n) {
        return n == 1 ? 0 : n == 2 ? 1 : calcFibonacci(n-2) + calcFibonacci(n-1);
    }

    public static void printFibonacciNumbers(int n) {
        String result = "Please enter a positive number more than 0";

        if (n > 0) {
            result = "";
            for (int i = 1; i <= n; i++) {
                result += String.format("%d", calcFibonacci(i));
                if (i < n) result += ", ";
            }
        }

        System.out.println(result);
    }

    public static void main(String[] args) {
        printFibonacciNumbers(-1); // -> "Please enter a positive number more than 0";
        printFibonacciNumbers(0); // -> "Please enter a positive number more than 0";
        printFibonacciNumbers(1); // -> 0;
        printFibonacciNumbers(4); // -> 0, 1, 1, 2;
        printFibonacciNumbers(7); // -> 0, 1, 1, 2, 3, 5, 8/
    }
}
