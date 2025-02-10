import java.util.Scanner;

public class reverse_num {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num =s.nextInt();
        int n=0;
    
        while(num>0){
          int rem =num%10;
        //    System.out.print(rem);
          num/=10;
          n =n *10 + rem;
        }
    System.out.println(n);
    s.close(); 
    }
}
