public class primenum_till_n {
    public static void main(String[] args) {
        int n =40;
        boolean[] isprime= new boolean[n+1];

        prime(n, isprime);
    }
    // Sieve of Eratosthenes algorithm to find all prime numbers up to n
    // Time complexity: O(n log log n)
    static void prime(int n,boolean[] isprime){
        for(int i=2;i<=n;i++){
            if(isprime[i] == false){
                for(int j=i*2;j<=n;j +=i){
                    isprime[j] = true;
                }
            }
        }
        for(int i=2;i<=n;i++){
            if(isprime[i] == false){
                System.out.println(i);
            }
        }
    }
}
