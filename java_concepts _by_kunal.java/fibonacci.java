import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int n1=0 , n2=1,n3;
        System.out.println("Enter the number");
        int num = s.nextInt();
        System.out.println("the fibonacci series is:\n" +n1 );
        for(int i=0;i<=num;i++){
            n3=n1+n2;
            n1=n2;
            n2=n3;
            System.out.print(" " + n3);
            s.close();
        }
    }
}
