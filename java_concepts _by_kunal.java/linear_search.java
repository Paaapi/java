public class linear_search {
    public static void main(String[] args) {
        int[] arr={12,3,5,64,5,76,4,25,6,44,7};
        int target=63;

        System.out.println(searching(arr, target));
    }
    static int searching(int[] arr,int target){
        if(arr.length==0){
            return -1;
        }
        for(int i=0;i<arr.length;i++){
            if (arr[i]==target) {
                return i;
            }
        }
        return -2;

    }
}
