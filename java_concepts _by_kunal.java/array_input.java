import java.util.Arrays;
import java.util.Scanner;

public class array_input {
    public static void main(String[] args) {
        int[][] arr=new int[3][3];
        Scanner s=new Scanner(System.in);

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){ 
                arr[i][j]=s.nextInt();
            }
        } 
        // for(int i=0;i<arr.length;i++){
        //     for(int j=0;j<arr[i].length;j++){
        //        System.out.print(arr[i][j] +" ");
        //     }
        //     System.out.println( );
        // }
        //Another way to print
        // for(int i=0;i<arr.length;i++){
        //     System.out.println(Arrays.toString(arr[i]));
        // }
        
        for (int[] a : arr) {
            System.out.println(Arrays.toString(a));
        }
        s.close();
    }
}
