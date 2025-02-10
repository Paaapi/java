import java.util.Scanner;

public class methods {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the name= ");
        String name = s.nextLine();
        String mygreet=greet(name);
        System.out.println(mygreet);
        s.close();
    }
    static String greet( String name){
       String message= "Hey " + name;
       return message;
    }
}
