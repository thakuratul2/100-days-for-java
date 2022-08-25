import java.util.Scanner;

class TakingInput {
    public static void main(String[] args){
        Scanner sc1 = new Scanner(System.in);
        //taking input from user
        System.out.println("Enter a number: ");
        //input in number
        int a = sc1.nextInt();
        System.out.println("Enter the number: ");
        int b = sc1.nextInt();
        sc1.close();
        int result = a + b;
        System.out.println("The result is: " + result);
    }
    
}
