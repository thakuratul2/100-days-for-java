import java.util.Scanner;

public class BasicCalculator{
         public static void main(String[] args) {
            //Basic Calculator
            Scanner sc = new Scanner(System.in);
            double sum = 0;
            System.out.println("________Welcome to Atul Calculator___________");
            System.out.println();
            System.out.println("Enter the first number: ");
            double num1 = sc.nextDouble();
            System.out.println("Enter the second number: ");
            double num2 = sc.nextDouble();
            System.out.println();
            System.out.println("___________Choice the opertion to perform__________");
            System.out.println();
            System.out.println("1. Addition");
            System.out.println("2. Substraction");
            System.out.println("3. Division");
            System.out.println("4. Multiplication");
            int ch = sc.nextInt();

            switch(ch){

                case 1:
                   sum = num1+num2;
                   break;
                case 2:
                   sum = num1 - num2;
                   break;
                case 3: 
                    sum = num1 / num2;
                    break;
                case 4:
                   sum = num1 * num2;
                   break;
            }
            System.out.print("The Answer is: ");
            System.out.println(sum);
            sc.close();
         }
}