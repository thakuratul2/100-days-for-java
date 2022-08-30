package Strings;

import java.util.Scanner;

class compareTo {
    public static void main(String[] args) {
        //compareTo
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string: ");
        String str1 = sc.nextLine();
        System.out.println("Enter the second string: ");
        String str2 = sc.nextLine();
        sc.close();

        //str1>str2 : +ve value
        //str1<str2 : -ve value
        //str1==str2 : 0

        if(str1.compareTo(str2)>0){
            System.out.println("Strings are +ve");
        }else{
            System.out.println("Strings are not +ve");
        }
        }
    
}
