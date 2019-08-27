package lesson03;
import java.util.*;

public class Fibonacci3 {

    private static int calcFibonacci(int n) {
        return n == 1 ? 0 : n == 2 ? 1 : calcFibonacci(n-2) + calcFibonacci(n-1);
    }

    public static void printFibonacciNumbers(int n) {
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 1; i <= n; i++) list.add(Integer.toString(calcFibonacci(i)));
        System.out.println(n > 0 ? String.join(", ", list) : "Please enter a positive number more than 0");
    }

    public static void main(String[] args) {
        printFibonacciNumbers(-1); // -> "Please enter a positive number more than 0";
        printFibonacciNumbers(0); // -> "Please enter a positive number more than 0";
        printFibonacciNumbers(1); // -> 0;
        printFibonacciNumbers(4); // -> 0, 1, 1, 2;
        printFibonacciNumbers(7); // -> 0, 1, 1, 2, 3, 5, 8/
    }
}
