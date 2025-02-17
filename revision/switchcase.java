package revision;
import java.util.Scanner;

public class switchcase {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("enter the num=");
        int num= s.nextInt();

        switch (num) {
            case 1:
                System.out.println("hey bro..");
                break;
            case 2:
                System.out.println("i'm the second.");
                break;
            case 3:
                System.out.println("I'm at third position.");
                break;
            default:
            System.out.println("Not in the mention case sorry.");
            
        }
        s.close();
    }
}
