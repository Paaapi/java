
class Print extends Thread implements Runnable{
      public Print(String name){
        super(name);                             // Constructors using implement runnaBle 
      }
      @Override
      public void run(){
        System.out.println("First runnBle Thrread.");

      }
}
public class runnaBle_constructor_ThreAD {
    public static void main(String[] args) {
        Print p=new Print("PARAV");
        Thread t=new Thread(p,"PARAV");
        t.start();
        System.out.println("the name of the thread is " + p.getName()); // to get the name of the thread
        System.out.println("the name ofnthe thread is" + t.getName()); // to get the name of the thread using the thrad oBject
        System.out.println("the id of the thread " + t.threadId());   // to get the id of the thread 
    }
} 
