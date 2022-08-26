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
    }
}