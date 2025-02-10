public class binary_search_algo {
    public static void main(String[] args) {
        int[] arr={-34,-12,-5,0,45,65,76,98,123};
        int target=32;
        System.out.println(binarysearch(arr, target));
    }
    static int binarysearch(int[] arr,int target){
        int start=0;
        int End=arr.length-1;
        while (start<=End) {
            // might be possible that start+end can exceed the range of the integer
            int mid=start + (End-start)/2;
            if(target < arr[mid]) {
                End=mid-1;
            }
             else if (target > arr[mid]){
                start=mid+1;
            }
            else{
               return mid;
            }
        }
        return -1;
    }
}
