class Student1{
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    Student1(Student1 s2){
        this.name = s2.name;
        this.age = s2.age;
    }
    Student1(){

    }
}
class Oops3 {
    //copy one constructor to another

    public static void main(String[] args) {
        Student1 s1 = new Student1();

        s1.name = "Atul";
        s1.age= 20;
        Student1 s2 = new Student1(s1);
        s2.printInfo();
    }
}
