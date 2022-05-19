package Test1;

import java.util.Scanner;

class Q1{

    public static boolean isPalindrome(String str, int i, int j){
        if(str.charAt(i) != str.charAt(j)){
            return false;
        }

        return true;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the Integer");
        int n = scan.nextInt();
        String str = Integer.toString(n);
        int l=0, r=str.length()-1;
        while(l<r){
            if(isPalindrome(str, r, l) == false){
                System.out.println("Integer is not palindrom ");
                return;
            }
            l++;
            r--;
        }

        System.out.println("Integer is palindrome "+ true);
    }
}



        