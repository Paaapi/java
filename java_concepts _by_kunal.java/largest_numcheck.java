import java.util.Scanner;

public class largest_numcheck {
    public static void main(String[] args) {
        Scanner num= new Scanner(System.in);
        int a = num.nextInt();
        int b = num.nextInt();
        int c = num.nextInt();
        /*int max=a;
        if (b>max){
            max = b;
        }
        if(c> max){
            max =c;
        }*/
        int max = Math.max(c,Math.max(a,b));   // optimization of code.
        System.out.println( "the largest num is=" + max);
        num.close();
    }
}
