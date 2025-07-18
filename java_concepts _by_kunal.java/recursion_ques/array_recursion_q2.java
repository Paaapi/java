public class array_recursion_q2 {
    public static void main(String[] args) {
        int[] arr={2,46,7,36,58,86,32,24};
        int target =8;
        System.out.println(search(arr, target, 0));
    }
    static boolean search(int[] arr,int target, int index){
        if(index== arr.length){
            return false; // base condition
        }
        
        return arr[index]==target || search(arr, target, index +1);
    }
}
