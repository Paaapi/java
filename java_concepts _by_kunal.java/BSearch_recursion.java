public class BSearch_recursion {
    public static void main(String[] args) {
        
        int[] arr = {2,5,6,8,12,34,67};
        System.out.println(search(arr, 34, 0, arr.length-1));
    }
    static int search(int[] arr,int target, int s, int e){
        // s=0;
        // e= arr.length-1;  we donot need to intialize it bcause of recursion call
        
        int m = s + (e-s)/2;
        if(s > e){
            return -2;
        }
        if(arr[m] == target){
            return m;
        }
        if(arr[m]< target){
            return search(arr,target,m+1,e);
        }
        return search(arr, target, s, m-1);

    }
}
