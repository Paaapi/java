public class NewtonRaphson_sqrtnum {
    public static void main(String[] args) {
        int n=49;
        System.out.println(sqrt(n));
    }
    static double sqrt(int n){
        double x=n;
        double root;
        while(true){
            root =0.5 * (x + n/x);

            if(Math.abs(root - x)<0.4){ // check precision decimal 
                
                break;
            }
            x=root;
        }
        return root;
    }
}
