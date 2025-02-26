import java.util.Arrays;

public class bubble_sort {
    public static void main(String[] args) {
        int[] arr={4,56,23,42,78,1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr){
        boolean swapp;
        for(int i=0;i<arr.length;i++){
            swapp= false;
            for(int j=1;j<arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapp=true;
                }
            }// if you didn't swapped for a particular value of i, it sayys array is sorted
            if(!swapp){ // !false=true
                break;
            }
        }
    }
}
