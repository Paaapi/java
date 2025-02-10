class Parent{
    public void Par(){
        System.out.println("hi i am Parent class.");
    }
}

class Child extends Parent{
    public void Par(){
        System.out.println("hi i am a Child class.");
    }
}
public class dynamic_dispatch {
    public static void main(String[] args) {
        Parent p=new Child();         // here parent is a reference but oBjwct is of child class 
                                      // so method of child class runs not parent this is called dynamic dispatch.(if we want to run parent method then make a OBject of parent {Parent pa=new Parent();})
        p.Par(); 
    }
}
