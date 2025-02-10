import java.util.Scanner;

public class pracque2 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
         System.out.println("enter your income=");
       Float income = S.nextFloat(); 
        Float tax = 0f;

        if(income<=2.5){
            tax=tax + 0;
        }
        else if(income>2.5f && income<=5f){
            tax=tax + 0.05f * (income - 2.5f);
        }
        else if(income>5f && income<= 10f){
            tax=tax + 0.05f * (5f - 2.5f);
            tax=tax + 0.2f * (income - 5.0f);
        }
        else if(income>10f){
            tax=tax + 0.05f * (5f - 2.5f);
            tax=tax + 0.2f * (10f - 5.0f);
            tax=tax + 0.3f * (income - 10.0f);
        }
        
            System.out.println("your tax amount is ="+ tax);
        
        S.close();

    }
}
