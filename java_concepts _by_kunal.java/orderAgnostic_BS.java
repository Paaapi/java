

public class orderAgnostic_BS {
    public static void main(String[] args) {
        //int[] ar={98,87,56,45,33,28,12,10,7,5,4,1}; //descending series
        int target=45;
        int[] ar={1,2,3,4,5,45,67,78,98}; // Ascending series
        System.out.println(orderAgno_BS(ar, target));
    }
    static int orderAgno_BS(int[] ar,int target){
          int start=0;
          int end=ar.length -1;
          boolean isAscending=ar[start] < ar[end]; // if its correct it return true else false
          while (start<=end) {
            // might be possible that start+end can exceed the range of the integer
            int mid=start + (end-start)/2;

            if(isAscending){
             if(target < ar[mid]) {
                end=mid-1;
             }
             else if (target > ar[mid]){
                start=mid+1;
             }
             else{
               return mid;
             }
            }
            else{
                if(target > ar[mid]) {
                    end=mid-1;
                 }
                 else if (target < ar[mid]){
                    start=mid+1;
                 }
                 else{
                   return mid;
                 }
            }
        }
        return -1;
    }
}
