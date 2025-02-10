import java.util.Arrays;

public class shadowing { // block Scope x is under class block scope so anythinng in class access the var x.
    static int x=20;     // this will be Shadowed at line 6
    public static void main(String[] args) {
        System.out.println(x); // 20
        int x=30;              // when u declare and intialize the x then it shdow the x of block  scope.
        System.out.println(x); // 30
        shadow();

        var(2,3,4,5,6);
    }

    static public void shadow(){
        System.out.println(x);// 20 
    }
    static public void var(int ...v){ // when u dont know how many variables are declared use int ...v
        System.out.println(Arrays.toString(v));
    }
}
