class practise extends Thread {
    public void run(){
        int i=0;
        while(i<35){
            System.out.println("good Morning");
            i++;
        }
    }
} 
class prac extends Thread{
    public void run(){
    
    int i=0;
    while(i<37){
        System.out.println("Welcome");
        i++;
    }
}
}


public class Ques_Thread {
    public static void main(String[] args) {
        practise p=new practise();
        prac p1 =new prac();
        p.setPriority(4);
        p1.setPriority(7);
        System.out.println(p.getPriority());
        System.out.println(p1.getPriority());  
        p1.start();
        p.start();
        System.out.println(p1.getState());        // for checking the state of the thread in lewman life cycle 
        System.out.println(p.currentThread().getState());  // to get the refernce of the current Thread

    }
}
