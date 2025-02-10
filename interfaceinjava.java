interface Bicycle{
    int a=30;
    void speedcontrol(int increase);
    void applybrakes(int decrement);
}
class Cycle implements Bicycle{
    public void speedcontrol(int increase){
        System.out.println("Controling the speed of cycle.");
       
    }
    public void applybrakes(int decrement){
        System.out.println("applying Brakes when needed in traffic.");
    }
}
public class interfaceinjava {
    public static void main(String[]args){
        Cycle c =new Cycle();
       System.out.println(c.a);   //you can create properties in interfaces
                                  //you cannot modify properties as they are final 
        c.speedcontrol(10);
        c.applybrakes(3);
        


    }

}
