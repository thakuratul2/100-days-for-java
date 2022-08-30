import java.util.Scanner;

class Strings{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Declarations
        String str1 = "Hello";
        System.out.println(str1);

        //taking input from user
    
       // String userName = sc.next();//taking inpur from user only full sentence
        String name = sc.nextLine();//taking input from user only full sentence(include spaces)
        sc.close();
       // System.out.println("Your Name is : "+userName);
        System.out.println("Your Name is : "+name);
        
    }
}