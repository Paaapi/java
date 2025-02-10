import java.util.Scanner;

public class nested_try_Catch {
    public static void main(String[] args) {
        int arr[]={32,4,67,54,12};
        boolean check=true;
        Scanner s= new Scanner(System.in); 
        
       while(check){
            System.out.println("Enter the numBer of index");
            int num=s.nextInt();
        try{
            System.out.println("just testing the Nested try catch exception.");
            try{
                System.out.println(arr[num]);
                check=false;
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("this index doesnot exist");
            }
        }
        catch(Exception e){
            System.out.println("the level of exception is First");
        }
    }
    s.close();
    }
}