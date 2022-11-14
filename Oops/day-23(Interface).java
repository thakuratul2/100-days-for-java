interface Cars{
    void Drive();
}
class BMWBrand implements Cars{
       public void Drive(){
        System.out.println("Cars speed was 40KM");
       }
}
class Interface {
    public static void main(String[] args) {

        //interface:- it is a completely "abstract class" that is used to group related method with empty bodies;
        //Constructors does not allow in the interface
        BMWBrand h1 = new BMWBrand();

        h1.Drive();

    }
}
