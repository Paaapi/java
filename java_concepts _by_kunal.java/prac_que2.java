import java.util.Scanner;

public class prac_que2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the amount in ruppees=");
        Double ruppees=s.nextDouble();
        System.out.println("the amount in dollar=");
        System.out.println(currencychanger(ruppees));
        s.close();
    }
    static double currencychanger(Double ruppees){
        double dollar= ruppees / 86.20;
        return dollar;
    }
}
