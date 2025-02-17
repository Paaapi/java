package revision;
public class wrapper_class {
    public static void main(String[] args) {
        int num =4;
       // Integer num1= new Integer(num); // boxing 
        Integer num1 =num;    // autoboxing -> conversion of primitive to object automatically.

      //  int num2 = num1.intValue();  // unboxing 
        int num2 = num1; // autounboxing -> conversion of object into primitive automatically.
        System.out.println(num2);


        String str ="23";
        int s = Integer.parseInt(str); // integer also provide us parseint method to convert str into integer format for operations.
        System.out.println(s*2);
    

        
    }
}
