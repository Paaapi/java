public class bitewiseQ2 {
    public static void main(String[] args) {
        int[] arr = {1,3,5,2,1,5,2};
        System.out.println(print(arr));
        
    }
    static int print(int[] arr){
        int unique=0;
        for (int i : arr) {
            unique ^= i;// unique = unique ^ i;
        }
        return unique;
    } 
}
