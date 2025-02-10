public class recursion { 
    static int factorial(int n){
        // fromulae for factorial n is = n*n-1*n-2*.....*2*1.
        //another way to write formulae is n*factorial(n-1)
        if(n==0 || n==1){
            return 1;
        }
        else{
            return n*factorial(n-1);
        }
    }
    static int factorial_iterative(int m){
        if(m==0 || m==1){
            return 1;
        }
        else{
            int product =1;
            for(int i=1;i<=m;i++){
                product *= i;
            }
              return product;
        }
    }
    public static void main(String[] args) {
        int r=40;
        System.out.println("the factorial of n is:"+ factorial(r));
        System.out.println("the factorial_iterative of n is :"+ factorial_iterative(r));
        
    }
}
