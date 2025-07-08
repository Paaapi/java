public class btiwiseQ4 {
    public static void main(String[] args) {
        int ans=0;
        int n =5;
        int base=4;
        while(n>0){
           int last= n&1;
           n=n>>1;
           ans += last*base;
           base *=4;

        }
        System.out.println(ans);
    }
}
