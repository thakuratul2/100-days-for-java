abstract class Animal{
    public abstract void walk();//it is only declared

}
class Horse extends Animal{
    public void walk(){
        System.out.println("Walk on 4 legs");
    }
}
class Chicken extends Animal{
    public void walk(){
        System.out.println("Walk on 2 legs");
    }
}

class Abstraction {
    //abstraction means to hiding valuable info to the user only do main operations
    //to declare -> abstract keyword is used
    public static void main(String[] args) {
        Horse h1 = new Horse();
        h1.walk();
        Chicken c1 = new Chicken();
        c1.walk();
    }
}
