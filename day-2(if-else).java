import java.util.Scanner;

class Ifelse{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        if(a>b){
            System.out.println(a+" "+"is greater than"+" "+b);
        }else{
            System.out.println(a+" "+"is less than"+" "+b);
        }
        }
    }

