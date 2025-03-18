import java.util.ArrayList;

public class Strings {
    public static void main(String[] args) {
        String a="Paravdeep";
        String b="Paravdeep";
        System.out.println(a==b); // they both  are in String Pool pointing to Single object.

        String name1=new String("Paravdeep");
        String name2= new String("Paravdeep");
        System.out.println(name1==name2); // they are out of pool
        System.out.println(name1.equals(name2)); // it doesnot cares about pool checks only value

        float math=3223.3484f;
        System.out.printf("Formatted String Float %.2f",math); // printing 2 digits after decimal.

        System.out.printf("\n Hello my name is %s I am %s","Paravdeep","Cool\n");

        // String Operators 
        System.out.println('a' + 'c');
        System.out.println('a' + 1);
        System.out.println((char)('a' + 2)); // converting it into character.
        System.out.println("a"+ "b"); // Concatination of Strings.
        System.out.println("a" + 1);
        // Note: When an int in added to string it is converted to its wrappeer class Integer.

        System.out.println("Parav" + new ArrayList<>());
        System.out.println("Parav" + new Integer(34));
        System.out.println(new ArrayList<>() + "" + new Integer(34));
        // you can only use it with primitives and if u wnat to use it with complex objects it ust contains Atleast one String.

    }
}
