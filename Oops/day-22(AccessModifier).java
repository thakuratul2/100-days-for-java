class Account{
    String name;//by set to default
    public String address;//access anywhere for file
    private int age;//only access within the class
    protected int number;//access only for subclass

    //to access private class by using setter and getters
    public int getPass(){
        return this.age;
    }
    //setters
    public void setPass(int age){
        this.age=age;
    }
}
class AccessModifier {
    public static void main(String[] args) {
        //Access Modifier->to access any propery by using different property
        //their are 4 access modifier are -> public,private,protected and default

        Account ac1 = new Account();
        ac1.name = "Atul";
        ac1.address="Meerut";
        ac1.setPass(19);
        System.out.println(ac1.getPass());
       

    }
}
