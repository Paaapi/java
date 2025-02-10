import java.util.Scanner;
public class calculator_prac {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        while(true){
          System.out.println("enter two numbers= ");
          int num1=s.nextInt();
          int num2=s.nextInt();
          int ans=0;
          System.out.println("Enter the operator= ");
          char a=s.next().trim().charAt(0);
        
          if(a == '*' || a == '+'|| a == '-' || a=='%' || a=='/' ){
            if(a=='*'){
                ans= num1*num2;
            }
            if(a=='+'){
                ans=num1+num2;
            }
            if(a=='-'){
                ans=num1-num2;
            }
            if(a=='%'){
                ans=num1%num2; 
            }
            if(a=='/' && num2!=0){
                ans=num1/num2;
            }
         }
         else if(a=='x' || a=='X'){
            break;
         } 
         else{
            System.out.println("Invalid Operator.");
            
         }
         System.out.println("your final ans is= " + ans);
    
        }
        s.close();
    }
}