abstract class parent {
    parent(){
        System.out.println("i am parent ");         //aBstract class ek refence layi hundi hai jo ki dusri derived class layi kuch cond set kardi hai 
    }
    abstract public void game();
}
class child extends parent{
    child(){
        System.out.println("i am a child of parent class.");
    }
    public void game(){
        System.out.println("i love to play video games.");
    }
}
abstract class child2 extends parent{
    public void child2(){
        System.out.println("yah tah iss class nu abstract Banao yah phir saare abstract methods parent de edee vich paoo.");
    }
}
public class aBstractclass_methods {
    public static void main(String[] args) {
       // child2 c2=new child2();               // abstract class da kade object ni bandaa..(ERROR DAYU)
       // parent p=new parent();                // Same reason utee alaa 
        
       child c=new child();
       c.game();
    }
}
