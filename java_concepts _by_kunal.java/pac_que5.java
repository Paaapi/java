import java.util.Scanner;

public class pac_que5 {
    public static void main(String[] args) {
        // Input a number and print all the factors of that number (use loops).
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the number=");
        int num=s.nextInt();
        System.out.println(factors(num));
        s.close();
    }
    static int  factors(int num){
        for(int i=1;i<=num;i++){
            if(num % i ==0){
                System.out.println(i);
            }
        }
        return 1;                                      
       
    }
}
