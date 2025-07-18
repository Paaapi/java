public class reverse_1 {
    
   // Method 1
    static int sum =0;
    static void rev(int n){
        if(n==0){
            return;
        }
        int rem = n%10;
        sum =sum*10 +rem;
        rev(n/10);
    }

    // Method 2
    static int rev2(int n){
        int digits= (int)(Math.log10(n))+1;
        return helper(n,digits);
    }

    static int helper(int n,int digits){
        if(n==0){
            return 0;
        }
        int rem=n%10;
        return rem * (int)(Math.pow(10, digits-1)) + helper(n/10, digits-1);
    }
    public static void main(String[] args) {
    //rev(2343);
    //System.out.println(sum);

    System.out.println(rev2(4523));
    }
}
