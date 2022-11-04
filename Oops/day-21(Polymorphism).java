class AnimalPoly{
    String name;
    int age;

    public void walk(String name){
        System.out.println(name);
    }
    public void walk(int age){
        System.out.println(age);
    }
    public void walk(String name, int age){
        System.out.println("Animal name is "+name+" "+age);
    }
}
class Polymorphism {
    public static void main(String[] args) {
        //Polymorphism-> It is defines as define class in many forms
        AnimalPoly h1 = new AnimalPoly();
        h1.name = "Horse";
        h1.age=24;
        h1.walk(h1.name,h1.age);
       // h1.walk(h1.age);
    }
}
