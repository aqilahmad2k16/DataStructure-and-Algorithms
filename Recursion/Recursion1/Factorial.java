package Recursion.Recursion1;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enther the number whose factorial we have to find");
        int n = scan.nextInt();
        System.out.println(findFactorial(n));

    }

    private static int findFactorial(int n) {
        if (n == 1) {
            return 1;
        }

        int f = findFactorial(n - 1);
        f = f*n;

        return f;
    }
}
