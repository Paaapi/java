package revision;
class Base{
    Base(){
        System.out.println("i am the parent constructor.");
    }
}
class Child extends Base{
    Child(){
        super();
        System.out.println("i am the child class.");
    }
    {System.out.println("I am the instance initializer.");}
}    


public class instance_initializer{
    //It run each time when object of the class is created.
    public static void main(String[] args) {
        Child c =new Child();
        
    }
}