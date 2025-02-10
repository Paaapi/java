
import java.util.Scanner;

public class takinguserinput {
    public static void main(String[] args) {
        System.out.println("taking input from user");
        Scanner S = new Scanner(System.in);
       /*  System.out.println("enter num 1 =");
        int a =S.nextInt();
        System.out.println("enter num 2 =");
        float B = S.nextFloat();
        float sum;
        sum =a + B;
        System.out.println("the sum is =");
        System.out.println(sum); */
        String str =S.nextLine();
        System.out.println(str);
        S.close();
    }
    
}
