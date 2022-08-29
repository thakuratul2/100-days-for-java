import java.util.Scanner;

class Elseif {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        sc.close();
        System.out.println("Enter a Marks :");
        int a = sc.nextInt();
        if(a>=90){
            System.out.println("Grade A");
        }else if(a>=85 && a<90){
            System.out.println("Garde B");
        }else if(a>=75 && a<85){
            System.out.println("Garde C");
        }else{
            System.out.println("Fail");
        }
    }
}
