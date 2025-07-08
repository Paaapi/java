public class bitwiseQ7 {
    public static void main(String[] args) {
        int num = 5;
        int power = 5;
        int ans = 1;
        while (power > 0) {
            if ((power & 1) == 1) {
                ans = ans * num;
            }
            num *= num;
            power = power >> 1;
        }
        System.out.println(ans);
    }
}