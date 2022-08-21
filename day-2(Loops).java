import java.util.Scanner;
class Loops {
    //While Loop
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number: ");
        int a = sc.nextInt();
        while(a<=25){
            System.out.println(a);
            a++;
        }
        //For Loop
        System.out.println("Enter The Number: ");
        int b = sc.nextInt();
        int i;
        for(i=0;i<=b;i++){
            System.out.println(i);
        }
    }
}
