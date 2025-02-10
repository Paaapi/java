
class Base{
    public int Bat(){
        System.out.println("Bat in class A");
       return 4;
    }
}
class Child extends Base{
    @Override                             //
    public int Bat(){
        System.out.println("BAt of class B.");
       return 4; 
    }
}

public class method_override {
    public static void main(String[] args) {
        
    Child c=new Child();
    c.Bat();

    Base B=new Base();
    B.Bat();

}
}