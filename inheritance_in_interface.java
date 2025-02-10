interface parent{
    void method1();
    void method2();
}
interface child extends parent{
    void meth1();
    void meth2();
}
class parent_ implements child{
    public void meth1(){
        System.out.println("meth1");
    }
    public void meth2(){
        System.out.println("meth2");
    }
    public void method1(){
        System.out.println("method1");
    }
    public void method2(){
        System.out.println("method2");
    }
    
}

public class inheritance_in_interface {
    public static void main(String[] args) {
        parent_ pa=new parent_();
        pa.meth1();
        pa.meth2();
        pa.method1();
        pa.method2();
    }
}
