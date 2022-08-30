package Strings;

import java.util.Scanner;

class Concatenations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firstName = sc.nextLine();
        String lastName = sc.nextLine();
        sc.close();

        String fullName = firstName + " " + lastName;
        System.out.println("Your Name is : " + fullName);
    }
}
