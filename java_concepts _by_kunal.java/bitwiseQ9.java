public class bitwiseQ9 {
    public static void main(String[] args) {
        int num=7;
        System.out.println(Integer.toBinaryString(num)); // Print binary representation of the number
        int count = 0;
        
        while(num>0){
            num -= (num& -num); // num = num & (num-1); this also a method to count set bits
            count++; // Increment the count of set bits

        }
        System.out.println(count); // Output the count of set bits
    }
}
