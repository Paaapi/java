import java.util.Arrays;

public class selection_sort {
    public static void main(String[] args) {
        int[] arr={3,1,5,6,2,4,72,67};
        insertion_sort(arr);
        System.out.println(Arrays.toString(arr));
        // sort(arr);
        
        
    }
    //Insertion Sorting 
    static void insertion_sort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    swap(arr, j-1, j);
                }
            }
        }
    }

    // Selection Sorting 
    static void sort(int[] arr){
         for(int i=0;i<arr.length;i++){
            int last=arr.length-i-1;
            int max_i=getmaxindex(arr,0,last);
            swap(arr, max_i,last );
         }
    }
    static int getmaxindex(int[] arr,int start,int last){
        int max_i=start;
        for( int i=start;i<=last;i++){
            if(arr[max_i]<arr[i]){
                max_i=i;
            }
        }
        return max_i;
    }
    static void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
