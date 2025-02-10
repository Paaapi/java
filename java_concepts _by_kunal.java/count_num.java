import java.util.Scanner;
public class count_num {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number=");
        int num = s.nextInt();
        int count = 0;
        System.out.println("Write the value of a=");
        int a = s.nextInt();

        while (num>0) {
            int rem =num%10; 
            if(rem==a){
                count++;
            }
            num=num/10;  // num/=10; to make it shorter
        }
        System.out.println(count);
        s.close();
    }
   
}
