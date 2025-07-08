public class bitwiseQ8 {
    public static void main(String[] args) {
        int num=10;
        int count = 0;
        while (num > 0) {
            if ((num & 1) == 1) {
                count++;
            }
            num = num >> 1; // Right shift to check the next bit
        }
        System.out.println(count); // Output the count of set bits

    }
}
        