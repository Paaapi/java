import java.util.Scanner;

public class prime_num {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number= ");
        int n=s.nextInt();
        boolean ans=prime(n);
        System.out.println(ans);
        s.close();
    }
    static boolean prime(int n){
        if(n<=1){
            return false;
        }
        int c=2;
        while(c*c <= n){
            if(n%c == 0){
              return false;
            }
            c++;
        }
        return c*c > n;
        

    }
}
