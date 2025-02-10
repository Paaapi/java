import java.util.Scanner;

public class pracque1 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("enter marks of math");
        float m1 = S.nextFloat();
        

        System.out.println("enter marks of phy");
        Float m2 = S.nextFloat();
        
        System.out.println("enter marks of chem");
        Float m3 = S.nextFloat();
        

        Float avg = (m1+m2+m3)/3.0f;
        System.out.println("your average marks is=" + avg);

        if(avg>40 && m1>=33 && m2>=33 && m3>=33){
            System.out.println("yor are promoted..");
        }
        else{
            System.out.println("you are not promoted...");
        }
        S.close();
    }
}
