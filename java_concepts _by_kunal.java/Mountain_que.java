public class Mountain_que {
    public static void main(String[] args) {
        int[] ar={1,3,5,9,10,45,56,34,23,13,1};
       System.out.println(peak(ar)); 
    }
    static int peak(int[] ar){
        int start=0;
        int end=ar.length-1;
        while(start < end){
            int mid=start +(end -start)/2;
            if(ar[mid] > ar[mid+1]){
                // you are in decreasing part of  array.
                end=mid;
            }
            else{
                start=mid+1; // yor are in increasing part of array.
            }
        }
        return start; // return end; returns same value because at last start and end pointoing to the same and highest element in the array.
    }
}
