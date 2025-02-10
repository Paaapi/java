import java.util.Scanner;

public class prac_que3 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number=");
        int num =s.nextInt();
        System.out.println(fibonacci(num));
        s.close();
    }
    static int fibonacci(int num){
        int n1=0,n2=1,n3;
        System.out.print(n1+ " " +n2);
        for(int i=0;i<=num;i++){
             n3=n1+n2;
             n1=n2;
             n2=n3;
             System.out.print(" "+n3);
        }
        return 1;
    
    }
}
