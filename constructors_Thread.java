
class Parent extends Thread{
    public Parent(String name){
        super(name);    //isne Thread mein se constructor ko call kiya hai.  
    }
    @Override
    public void run(){
        int i =43;
         while(i<32){
            System.out.println("hii i'm a constructor of Thread.");
            i++;
        }
    }    

}
public class constructors_Thread {
    public static void main(String[] args) {
        Parent p =new Parent("paapi");
        p.start();
        System.out.println("The name of the constructor"+ p.getName());
        System.out.println("The id of Thread."+ p.getId());
    }
}
