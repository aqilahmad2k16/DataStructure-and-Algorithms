package GetStarted;

import java.util.Scanner;

public class Q1{
    public static void displayMessage(int marks){
        if(marks>90){
            System.out.println("excellent");
        }else if(marks>80 && marks<=90){
            System.out.println("good");
            
        }else if(marks>70 && marks<=80){
            System.out.println("fair");
            
        }else if(marks>60 && marks<=70){
            System.out.println("meets expectation");
            
        }else{
            System.out.println("below par");

        }
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the marks of the students");
        int marks=scan.nextInt();

        displayMessage(marks);
        scan.close();
    }
}