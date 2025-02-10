import java.util.Scanner;

public class que {
    public static void main(String[] args) {
        
        System.out.println("Result of student");
        Scanner S = new Scanner(System.in);

        System.out.println("name of student");
        String str = S.nextLine();
        //String str = "Paravdeep";// char given at compile time
        System.out.println(str);

        System.out.println("marks out of");
        int outof =S.nextInt();
        int a = outof*5;
        System.out.println(a);
        
        System.out.println("marks 1=");
        float marks1=S.nextFloat();

        System.out.println("Marks 2=");
        float marks2=S.nextFloat();

        System.out.println("Marks 3=");
        float marks3=S.nextFloat();

        System.out.println("Marks 4=");
        float marks4=S.nextFloat();

        System.out.println("Marks 5=");
        float marks5=S.nextFloat();

        float sum=marks1 + marks2 + marks3 + marks4 + marks5;
        System.out.println(sum);

        System.out.println("total percentage otained By student=");
        float step=(sum/a);
        float per = step*100;
        System.out.println(per);
        S.close();

    }
}
