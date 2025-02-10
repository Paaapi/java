import java.util.Scanner;

class My_exception extends Exception{
    @Override
    public String toString(){
        return"good Morning";
    }
    @Override
    public String getMessage(){
        return "Welcome to the Class";
        
    }
}
public class Exception_class {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.println("Enter the number=");
        int greet =s.nextInt();
        if(greet<6){
            try {
                 throw new My_exception();
            } catch (Exception e) {
                System.out.println("Handling the exception");
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                System.out.println(e);                 // yeh khud hi to string ko run kare ga Bina declare kiye.
            }       
        }
        else{
            System.out.println("get the fuck out the the try Exception");
        }
        s.close();
    }
}