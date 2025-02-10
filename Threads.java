
class My_thread1 extends Thread{           //Extending thw thread By using the extend keyword
    @Override
    public void run(){
        int i=0;
    while(i<200){
        System.out.println("Running thread 1 \n Good Morning");
        i++;
    }
}
}
class My_thread2 extends Thread{
    @Override
    public void run(){
        int i=0;
        while(i<200){
        System.out.println("Running thread 2 \n Today is a good day");
        i++;
    }
    }
}

public class Threads {
    public static void main(String[] args) {
        My_thread1 t1 =new My_thread1();
        My_thread2 t2 =new My_thread2();
        t1.start();
        t2.start();
        
    }
}
