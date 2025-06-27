//package revision;
import java.util.Scanner;
/*public class palindrome {
    public static void main(String[] args) {
        String rev="";
        Scanner s =new Scanner(System.in);
        System.out.println("enter the word to check palindrome:");
        String letter= s.nextLine();
        int length =letter.length();
        // it used for String Data type
        for(int i=length-1;i>=0;--i){
            // here charAt is used  to Sting concatination and i represents index value of String
         rev =rev +letter.charAt(i);
        }     
            if(letter.equals(rev)){
                System.out.println("It is a palindrome Strng.\n" +rev);
            }
            else{
                System.out.println("it is not palindrome String.");
            }
        
    }
}
*/
public class palindrome {

    public static void main(String[] args) {
        System.out.println("Enter the number to check=");
        Scanner s =new Scanner(System.in);
        int num= s.nextInt();
        int org_num=num;
        int rev=0;
        while (num>0) {
            rev =rev*10 + num%10;
            num=num/10;
        }
        if (org_num==rev) {
            System.out.println("yes it is palindrome number.");
        }
        else{
            System.out.println("it is not palindrome num.");
        }
        s.close();
    }
}