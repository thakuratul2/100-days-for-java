

class Shape{
    String color;
}
//single level
class Triangle extends Shape{
    public void printInfo(){
        System.out.println("Display color");
    }
//multi level
class Circle extends Triangle{
    public void CircleInfo(int r){
        System.out.println((3.14)*r*r);
    }
}
//herichy
class Rectangle extends Shape{
    public void Info(){
        System.out.println("Hello");
    }
}

}
class Inheritance{
    public static void main(String[] args) {
        //Inheritance-> inherit one class property to another property by using extends
        //their are 4 types of inheritance(single level,multi level,herichy,hybrid )
        Triangle t1 = new Triangle();

        t1.color="Red";
        t1.printInfo();
        

    }
}