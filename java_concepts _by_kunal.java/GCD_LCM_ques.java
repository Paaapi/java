public class GCD_LCM_ques {
    public static void main(String[] args) {
        System.out.println(gcd(20, 50));
        System.out.println(lcm(4, 7));
    }
    static int gcd(int a,int b){
        if(a==0){
            return b; // If a is 0, GCD is b
        }
        return gcd(b%a,a);
    }

    static int lcm(int a,int b){
        return (a * b)/ gcd(a, b);
    }
}
