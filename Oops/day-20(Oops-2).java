class Student{
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    //make constructor with parameters
    Student(){
       System.out.println("Constructor");
    }
}

class Oops2 {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.name="Atul";
        s1.age = 20;
        s1.printInfo();

        
        
    }
}
