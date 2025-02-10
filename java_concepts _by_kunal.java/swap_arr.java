import java.util.Arrays;

public class swap_arr {
    public static void main(String[] args) {
        int[] arr={1,3,5,73,3,6};
        swap(arr, 3, 5);
        System.out.println(Arrays.toString(arr));

        System.out.println(max(arr));
        System.out.println(maxran(arr));

        rev(arr);
        System.out.println(Arrays.toString(arr));

    }
    //reverse elements of array
    static void rev(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            swap(arr, start, end);
            start++;
            end--;
        }
    }
    static void swap(int[] arr,int i1,int i2){
        int temp= arr[i1];
        arr[i1]=arr[i2];
        arr[i2]=temp;
    }
    static int max(int[] arr){
        int maxval=arr[0];
        for(int i=0;i<arr.length;i++){
            if (arr[i]>maxval) {
                maxval=arr[i];
            }
        }
        return maxval;
    }
    static int maxran(int[] arr){
        int maxval=arr[0];
        for(int i=1;i<4;i++){
            if (arr[i]>maxval) {
                maxval=arr[i];
            }
        }
        return maxval;
    }
}
