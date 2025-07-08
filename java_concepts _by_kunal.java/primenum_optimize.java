public class primenum_optimize {
    public static void main(String[] args) {
        System.out.println(isprime(19));
        
    }
    static boolean isprime(int n){
        if(n <=1) return false;
        // its only checking jahan tak uska square na ho jaye taaki number multiply repaet na ho 
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
            // its time complexity is sqrt of n
        }
        return true;
    }
}