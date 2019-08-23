package lesson03;

public class Fibonacci {

    private static int calcFibonacci(int n) {
        int result;

        switch (n) {
           case 1 :
                result = 0;
                break;
           case 2 :
                result = 1;
                break;
           default :
                result = calcFibonacci(n-2) + calcFibonacci(n-1);
        }

        return result;
    }

    public static void printFibonacciNumbers(int n) {
        if (n < 1) {
            System.out.print("Please enter a positive number more than 0");
        }
        else {
            for (int i = 1; i <= n; i++) {
                System.out.print(calcFibonacci(i));
                if (i < n) {
                    System.out.print(", ");
                }
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printFibonacciNumbers(-1); // -> "Please enter a positive number more than 0";
        printFibonacciNumbers(0); // -> "Please enter a positive number more than 0";
        printFibonacciNumbers(1); // -> 0;
        printFibonacciNumbers(4); // -> 0, 1, 1, 2;
        printFibonacciNumbers(7); // -> 0, 1, 1, 2, 3, 5, 8/
    }
}
