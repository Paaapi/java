import java.util.Scanner;

public class Handling_Specific_Exception {
    public static void main(String[] args) {
        int arr[]={23,34,56,78};
        Scanner sc = new Scanner(System.in);
        try{
        System.out.println("Enter the numBer of index.");
        int index=sc.nextInt();
        System.out.println("Enter the numBer with which you want to divide.");
        int num=sc.nextInt();
        System.out.println("the result is=" + arr[index]/num);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException occurs!");
            System.out.println(e);
        }
        catch(ArithmeticException e){
            System.out.println("Arithmetic Exception occurs!");
            System.out.println(e);
        }
        catch(Exception e){
            System.out.println("Unknowm Exception occurs !");
            System.out.println(e);
        }
        sc.close();
    }
}
