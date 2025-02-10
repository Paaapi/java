import java.util.Scanner;

public class prac_que4 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("enter the number=");
        int n=s.nextInt();
        System.out.println(number(n));
        s.close();
    }
    static int number(int n){
        int product=1;
        int sum=0;
        while(n>0){
            int rem=n%10;
             product *= rem;
             sum += rem;
            n/=10;
        }
        return product-sum;
    }
}
