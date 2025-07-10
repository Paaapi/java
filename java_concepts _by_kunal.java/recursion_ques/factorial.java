//package recursion_ques;

public class factorial {
    public static void main(String[] args) {
        System.out.println(fac(5));
    }
    static int fac(int n){
        if(n==1){   // this is our base condition
            return 1;
        }
        return n * fac(n-1);
    }
}
