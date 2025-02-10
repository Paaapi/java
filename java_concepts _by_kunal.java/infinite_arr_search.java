public class infinite_arr_search{
    public static void main(String[] args) {
        int[] arr={2,3,7,9,12,45,67,99,123,567,678,789,987,989,990,999};
        int target=123;
        System.out.println(ans(arr, target));
    }
    static int ans(int[] arr,int target){
        int start=0;
        int end=1;
        while(target>arr[end]){
            int emp=end +1;
            //end = previous end-size of box*2
            end=end + (end-start+1)*2;
            start=emp;
        }
        return search(arr, target, start, end);
    }
    static int search(int[] arr,int target,int start,int end){
        
          while (start<=end) {
            int mid=start+(end - start)/2;
            if(target>arr[mid]){
                start=mid+1;
            }
            else if(target<arr[mid]){
                end=mid-1;
            }
            else{
                return mid;
            }
          }
          return -2;
    }
}