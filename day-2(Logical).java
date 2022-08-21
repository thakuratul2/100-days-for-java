import java.util.Scanner;

class Logical {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        //logical AND Example
        boolean result = (boolean)(a<5 && b>10);
        System.out.println("The Result1 is : " + result);
        //Logical OR Example
        boolean result2 = (boolean)(a<5 || b>10);
        System.out.println("The Result2 is : " + result2);
        //logical NOT Example
        //it return reverse of the boolean value like true to false and false to true
        boolean result3 = (boolean)(!(a<10 && b>10));
        System.out.println("The Result3 is : " + result3);

    }
}
