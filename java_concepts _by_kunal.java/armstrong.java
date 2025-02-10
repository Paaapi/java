import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the number= ");
        int n=s.nextInt();
        System.out.println(arm(n));
        s.close();
    }
    static boolean arm(int n){
        int org = n;
        int sum =0;
        while(n>0){
            int rem=n%10;
            n /=10;
            sum += rem*rem*rem;
            
        }
        if(sum == org){
            System.out.println("the number is Armstrong");
            return true;
        }
        else
        return false;

    }
}