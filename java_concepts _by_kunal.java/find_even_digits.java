public class find_even_digits {
    public static void main(String[] args) {
        int[] nums={12,345,2,6,7896};
        System.out.println(array(nums));
        System.out.println(digits(344567));
        
    }
    // iterate to elements of array
    static int array(int[] nums){
        int count=0;
        for (int i : nums) {
            if(even(i)){
             count++;
            }
        }
        return count;
    }
    // counts digits in number
    static int digits2(int i){
        if(i < 0){
           i= i * -1;
        }
        return (int)(Math.log(i)) + 1;
    }
    static int digits(int i){
        int count=0;
        while (i >0) {
            count++;
            i=i/10;
        }
        return count;
    }
    // check no of digits are even or not
    static boolean even(int i){
       if(digits(i) % 2 ==0){
        return true;
       }
       return false;
    }
}
