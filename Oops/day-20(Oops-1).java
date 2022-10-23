
class Pen{
    String color;
    String type;

    public void write(){
        System.out.println("Writing Something");
    }
    public void printSome(){
        System.out.println(this.color);//this is a keyword is used to access classes by objects
        System.out.println(this.type);
    }
}
class Oops1{
    public static void main(String[] args) {
        Pen pen1 = new Pen();//Pen()-> it is a special type function called Constructor(to construct objects in java)

        pen1.color="Blue";
        pen1.type= "Gel";

        Pen pen2 = new Pen();
        pen2.color = "Black";
        pen2.type="BallPen";

        pen2.printSome();

        pen1.printSome();;
    }
}
