import java.util.Scanner;
public class case_check {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the Sring name");
        char s = in.nextLine().trim().charAt(0);  // trim removes extra spaces and charAt is used 
         if(s >= 'a' && s<='z'){
            System.out.println("Lower Case");
         }
         else{
            System.out.println("Upper Case");
         }
         in.close();
    }
}
