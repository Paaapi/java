class Base{
    Base(){
        System.out.println("The default cnstructor.");
    }
}
class Child1 extends Base{
    Child1(int x){
        super();
         System.out.println("The Valuye of x-"+ x);
    }
}
class child2 extends Child1{
    child2(int x,int y){
        super(x);                        // one of the use of super keyword
        System.out.println("the value of and y-"+ y);

    }
}
public class contr_inheritance {
    public static void main(String[] args) {
        child2 c=new child2(43,67);
    }
}
