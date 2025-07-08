public class sqrtofnum {
    public static void main(String[] args) {
        int n=38;
        int precision=2; //no. of decimal places
        System.out.println(sqrt(n, precision));
    }
    static double sqrt(int n, int precision){
        int s=0;
        int e=n;
        double ans =0.0;
        
        while(s<=e){
            int mid = s +(e-s)/2;
            
            if(mid*mid==n){
                return mid;
            }
            else if(mid*mid<n){
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
        
        double incr=0.1;
        for(int i=0;i<=precision;i++){
            while(ans*ans < n){
                ans +=incr;
            }
            ans -=incr;
            incr /=10;
        }
        return ans;

    }
}
