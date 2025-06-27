package revision;

public class pracque11 {
    public static void main(String[] args) {
        int[] arr= {1,10,8,6,5,4};
    }
    static int[] largerst(int[] arr ){
        int max=arr[0];
        for(int i =0;i<arr.length;i++){
            if(arr[i] < arr[i+1] ){
                max = arr[i+1];
            }
            if(arr[i] > arr[i+1]){
                return new int[]{i};
            }
        }
        return new int[]{-1};
    }

}