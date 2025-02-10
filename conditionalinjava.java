import java.util.Scanner;
public class conditionalinjava{
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
                
           System.out.println("enter age=");      
        int age = S.nextInt();
       
        if(age >=20){
            System.out.println("he or she is an adult..");
        }
        else{
            System.out.println("he or she is not an adult..");
        }
        S.close();
    }
}
