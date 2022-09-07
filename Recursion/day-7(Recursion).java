package Recursion;

import java.util.Scanner;

class Recursion {
    //recursive function
    public static void Print(int n){
        if(n==0){
            return;
        }

        System.out.println(n);
        Print(n-1);
    }
   
    public static void main(String[] args) {
        //print number from 5 to 1

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        Print(num);
        System.out.println();
        sc.close();

    }
}
