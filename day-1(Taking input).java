import java.util.Scanner;

class TakingInput {
    public static void main(String[] args){
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc1.nextInt();
        System.out.println("Enter another number: ");
        int b = sc1.nextInt();
        int result = a + b;
        System.out.println("The result is: " + result);
    }
    
}
