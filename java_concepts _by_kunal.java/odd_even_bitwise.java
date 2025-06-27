public class odd_even_bitwise {
    public static void main(String[] args) {
        
        System.out.println(print(101));
    }
    static boolean print(int n){
        return (n&1) == 1;
    }
}
