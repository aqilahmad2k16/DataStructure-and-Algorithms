package Recursion.Recursion1;

import java.util.Scanner;

public class PowerLinear {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter x");
        int x = scan.nextInt();

        System.out.println("Enter n");
        int n = scan.nextInt();

        System.out.println(findPower(x, n));
    }

    private static int findPower(int x, int n) {
        if (n == 1) {
            return 1;
        }

        int f = x * findPower(x, n - 1);
        return f;
    }
}
