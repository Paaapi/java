import java.util.Scanner;
import java .util.Random;

class Game{
    int computer_no;
    int user_no;
      Game(){
        Random r= new Random();
        this.computer_no= r.nextInt(100);
    }
    public void userinput(){
        Scanner s = new Scanner(System.in);
        System.out.println("select a number from 0 to 100=");
        user_no=s.nextInt();
    }
    Boolean Iscorrect_no(){
        if(user_no < computer_no){
            System.out.println("The numBer is smallest then computer choice.");
      
        }
        else if(user_no > computer_no){
            System.out.println("the number is greater then then the computer choice.");
        }
        else if(user_no == computer_no){
            System.out.println("the number is equal to the computer numbER.");
            return true;
        }
        return false;
    }
}


public class Guess_numBer {
    public static void main(String[] args) {
        Game g= new Game();
        Boolean b= false;
        while(!b){
        g.userinput();
        b = g.Iscorrect_no();
        System.out.println(b);
        }
    }
}
