public class que_ceiling_of_num {
    public static void main(String[] args) {
        // here we print the next largest number or equal to the target
    int[] arr={-34,-12,-5,0,45,65,76,98,123};
        int target=134;
        System.out.println(binarysearch(arr, target));
    }
    static int binarysearch(int[] arr,int target){
        int start=0;
        int End=arr.length-1;
        // if target no is greater then last element

        if (target>arr[arr.length-1]){
            return -1;
        }
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
        return arr[start];// it will print the number itsself
    }
}
