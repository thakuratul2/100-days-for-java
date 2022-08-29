class TypeCast {
    public static void main(String[] args){

        //Implict type casting(Widening Conversion)
        byte a = 20;
        int b = a;
        System.out.println(b);

        //Explicit type casting(Narrowing Conversion)
        int num = 230;
        long bnum = (long)num;
        System.out.println(bnum);
    }
    
}
