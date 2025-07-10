//package recursion_ques;

public class n_to_1 {
    public static void main(String[] args) {
        fun(6);
        funrev(5);
    }
    static void fun(int n){
        if(n==0){
            return;
        }
        System.out.print(n+ " ");
        fun(n-1);
    }
    static void funrev(int n){
        if(n==0){
            return;
        }
        funrev(n-1);
        System.out.print("\n" +n+ " ");
    }
}
