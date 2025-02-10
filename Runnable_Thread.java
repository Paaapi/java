
class MyThread_run1 implements Runnable{
    public void run(){
    for(int i=0;i<300;i++){
        System.out.println("I'm thread RunnaBle first.");
    }
}
}
class MyThread_run2 implements Runnable{
    public void run(){
        for(int i=0;i<300;i++){
            System.out.println("I'm thread runnaBle Second.");
        }
    }
}
public class Runnable_Thread {
    public static void main(String[] args) throws Exception{

       MyThread_run1 t =new MyThread_run1();
       Thread t1 =new Thread(t);                  //jaise ek gun ,Bullet k Binaa kuch ni kar sakti 
                                             //hum Bhi sidha Start ni kar sakte upper wali class k method ko,so humme ek Thread ka ojBjet Banana hi PAde ga.
       t1.start();

       MyThread_run2 T =new MyThread_run2();
       Thread t2 =new Thread(T);
       t2.start();
       t1.join();  // join method first implements t1  and t2 and then last thread.
       t2.join();
       System.out.println(t1.isAlive()); // to check thread is running or not.
       System.out.println("thank u.");
    }
}
