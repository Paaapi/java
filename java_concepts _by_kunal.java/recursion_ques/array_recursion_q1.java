public class array_recursion_q1 {
    public static void main(String[] args) {
        int[] arr ={2,5,7,35,67,56,88};
        System.out.println(sort(arr, 0));
    }
    static boolean sort(int[] arr, int index){
        if(index== arr.length-1){
            return true; // Base conditon
        }
        return arr[index] < arr[index+1] && sort(arr, index +1);
    }
}
