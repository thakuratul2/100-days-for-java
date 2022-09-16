import java.util.Scanner;

public class Banking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long bal;
        
        System.out.println("_______Welcome to Atul Banking System________");
        System.out.println();
        System.out.println("Enter your 10 digit account number: ");
        String account = sc.nextLine();
        System.out.println();
        System.out.print("Welcome: ");
        System.out.println(account);
        System.out.println();
        System.out.println("Enter the Balance: ");
        bal = sc.nextLong();
        System.out.println();
        System.out.println("_______Choice the option to perform_______");
        System.out.println("1. To Check Balance");
        System.out.println("2. To Deposit Money");
        System.out.println("3. To Withdraw Money");
        int ch = sc.nextInt();

        
        switch(ch){
            case 1:
              System.out.print("Balance in Account is: ");
              System.out.println(bal);
              break;


            case 2:
            long amt;
              System.out.println("Enter the Amount: ");
              amt = sc.nextLong();
              //long amt;
              bal = bal + amt;
              System.out.print("Amount in Account is: ");
              System.out.println(bal);
              break;
            case 3:
              System.out.println("Enter the amount to withdraw: ");
              long draw;
              draw = sc.nextLong();
              if(bal>=draw){
                bal = bal - draw;
              }else{
                System.out.println("Insufficent Amount");
                break;
              }
              System.out.print("After the Withdraw: ");
              System.out.println(bal);
              sc.close();
              break;
            default:
              System.out.println("Invalid Choice");
              break;
        }
    }
}
