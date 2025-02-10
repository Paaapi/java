import java.util.Scanner;
public class prac_que1 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the name of the user=");
         String Name =s.nextLine();
       System.out.println(greet(Name));
       s.close();
    }
    static String greet(String Name){
        
          if( Name.equals("Paravdeep Walia") ){
            System.out.println("hlo Walia Saab Good Morning");
          }
          else if(Name.equals("Sahil")){
            System.out.println("Hlo Sharmaji Good Morning");
          }
          else{
            System.out.println("Good Morning your name isn't Menyion sorry.");
          }
          return "bye";
    }
}
