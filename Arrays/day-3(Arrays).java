import java.util.Scanner;

class Arrays{
    public static void main(String[] args) {
        //arrays

        char[] a = new char[5];
        a[0]='a';
        a[1]='b';
        a[2]='c';
        a[3]='d';
        a[4]='e';

        for(int i =0;i<5;i++){
            System.out.println(a[i]);
        }
        //array2 to store integer value individually

        int[] b = new int[10];

        for(int j=0;j<10;j++){
            b[j]=j;
        }
        for(int j=0;j<10;j++){
            System.out.println(b[j]);
        }
        //change the element in the arrays

        String cars[] = {"BMW","Audi","Mercedes","Volvo"};
        cars[0] = "ATUL";
        System.out.println(cars[0]);

        //2-D Arrays
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row number: ");
        int row = sc.nextInt();
        System.out.println("Enter the column number: ");
        int col = sc.nextInt();
        int[][] arr = new int[row][col];

        //input the values in the array
        for(int i = 0;i<row;i++){
            for(int j = 0;j<col;j++){
                arr[i][j] = sc.nextInt();
                
            }
        }
        //print the array
        for(int i=0;i<row;i++){
            for(int j =0;j<col;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}