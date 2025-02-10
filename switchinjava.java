import java.util.Scanner;
public class switchinjava {
    public static void main(String[] args) {
         Scanner s= new Scanner(System.in);
        // System.out.println("Enter the name of the fruit: ");
        // String Fruit=s.nextLine();
        /*there is a inhanced switch syntax 
         * case"Mango" -> System.out.println("statement");
         * case"Peaches" -> System.out.println("statement");
         * no need to add break statement
         */
        // switch(Fruit){
        //     case "Peaches":
        //         System.out.println("I love Peaches I love u \n u got me bae, I got u...");
        //         break;
        //     case "Mango":
        //         System.out.println("I'm the king.");
        //         break;
        //     case"Apple":
        //         System.out.println("I keeps Doctor away.");
        //         break;
        //     case "Pineapple":
        //         System.out.println("An apple on a pine.");
        //         break;
        //     default:
        //        System.out.println("Enter the valid fruit name.");
        // }
        System.out.println("Enter the day number= ");
        int day= s.nextInt();
        switch (day) { // enhanced switch cases syntax
            case 1,2,3,4,5 -> System.out.println("Weekdays");
            case 6,7 -> System.out.println("Weekends");
        }
    }
}