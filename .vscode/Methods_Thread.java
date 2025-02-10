class Car extends Thread{
    public void run(){
        int i=0;
        while(i<455){
            System.out.println("i like the car which is mucle and Royality.");
            i++;
            try{
                Thread.sleep(1000);        // yeh method ko 1000 millisec k duration k gap mein chalata hai.
            }
            catch(InterruptedException f){       //Thrown when a thread is waiting, sleeping, or otherwise occupied, and the thread is interrupted, either before or during the activity.
                System.out.println(f);
            }
        }
    }
}
class Engine extends Thread{
    public void run(){
    int i=0;
    while(i<544){
        System.out.println("the power of the italian Brand cars has V type engines");
        i++;
    }
}
}

public class Methods_Thread {
    public static void main(String[] args) {
        Car c=new Car();
        c.start();
        /*try{
            c.join();                 //yeh phele first waale ko khatam kare gaa uske BAad dusra  wala chaleyegaa
        }
        catch(Exception d){
            System.out.println(d);
        } */
        Engine e =new Engine();
        e.start();
    }
}
