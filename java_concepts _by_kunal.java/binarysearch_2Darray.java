import java.util.Arrays;

public class binarysearch_2Darray {
    public static void main(String[] args) {
        int[][] arr={
            {12,32,45,49},
            {16,35,46,58},
            {18,37,48,78}
        };
        
        System.out.println(Arrays.toString(search(arr, 46)));
    }
    static int[] search(int[][] arr,int target){
        int row=0;
        int column=arr.length-1;
        while(row<arr.length && column>=0){
            if(arr[row][column]==target){
                return new int[]{row,column};
            }
            else if(arr[row][column] <target){
                row++;
            }
            else{
                column--;
            }
        }
        return new int[]{-1,-1};
    }
}
