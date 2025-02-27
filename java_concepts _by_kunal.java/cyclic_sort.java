import java.util.Arrays;

public class cyclic_sort {
    public static void main(String[] args) {
        int[] arr={3,5,4,7,6,2,1};
        cycle_sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void cycle_sort(int[] arr){
         int i=0;
         while(i<arr.length){

         int two=arr[i]-1;
        if(arr[i]!=arr[two] && two<arr.length && two>=0){
            swap_arr(arr,i,two);
        }else{
            i++;
        }
    }
    }
    static void swap_arr(int[] arr,int second,int first){
            
                int temp=arr[first];
                arr[first]=arr[second];
                arr[second]=temp;
            
    }
}
