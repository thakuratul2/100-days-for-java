package Functions;

class Funcions {
    public static void main(String[] args) {
        //without parameters
        help();
        //with parameters
        add(100,200);
        //function return value 
        int get_res = Add(25,32);
        System.out.println(get_res);
    }
    //wihtout paratmeters
    public static void help(){
        System.out.println("Hello Function");
    }

    //with parameters
    public static void add(int a,int b){
        System.out.println(a+b);
    }
    //function with return value
    public static int Add(int a, int b){
        int result = a+b;
        return result;
    }
}
