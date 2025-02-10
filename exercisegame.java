import java.util.Scanner;
import java.util.Random;
public class exercisegame {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 0 for rock,1 for sccisor,2 for paper");
        int userinput=sc.nextInt();

        Random ran=new Random();
        int computerinput=ran.nextInt(3);

        if(userinput==computerinput){
          System.out.println("Tied");
        }
        else if(userinput==0 && computerinput==1 || userinput==1 && computerinput==2 ){
          System.out.println("Computer Wins..");
        }
        else{
          System.out.println("You Win..");
        }
        System.out.println(+computerinput);
        sc.close();
    }

    
}
