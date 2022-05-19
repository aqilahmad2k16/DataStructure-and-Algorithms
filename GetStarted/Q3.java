package GetStarted;

import java.util.Scanner;

public class Q3 {
    public static void printAllPrimeNumberTillN(int n){
        int count=0;
        System.out.println("All prime number is ");
        for(int i=2; i<=n; i++){// time complexity: O(n^2);

            for(int div=2; div<i; div++){
                if(i%div==0){
                    count++;
                }
            }
            if(count==0){
                System.out.println(i);
            }
            count=0;
        }

    }
    // print all prime till N
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the number");

        int n=scan.nextInt();
        printAllPrimeNumberTillN(n);
        scan.close();
    }
}
