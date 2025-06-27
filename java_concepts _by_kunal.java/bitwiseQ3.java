public class bitwiseQ3 {
    public static void main(String[] args) {
        int num = 0b1011010; // you  have to add 0b  as prefix to represent it in binary otherwise it will be treated as decimal.
        int n =1;
        System.out.println(print(num, n));
    }
    static int print(int num,int n) {
        return (num & (1<<(n-1))) !=0 ?1 : 0;
    }
}
