
class mythread extends Thread{
    public mythread(String name){
        super(name);
    }
    public void run(){
        int i=0;
        while(i<400){
        System.out.println("the name of the thread is:" + this.getName());
        i++;
    }
}
} 
public class Priority_Thread {
    public static void main(String[] args) {
        mythread m =new mythread("Parav");
        mythread m1=new mythread("Deep");
        mythread m2=new mythread("Walia");
        m.setPriority(Thread.MAX_PRIORITY);
        m1.setPriority(Thread.NORM_PRIORITY);                 //NORM priortiy default chalti hai.
        m2.setPriority(Thread.MIN_PRIORITY);
        m.start();
        m1.start();
        m2.start();
        
    }
}
