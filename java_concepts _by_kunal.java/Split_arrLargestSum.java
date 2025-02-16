public class Split_arrLargestSum {
    public static void main(String[] args) {
        int[] nums={7,2,5,8,10};
        int k=2;
        System.out.println(splitArray(nums, k));
    }
    static int splitArray(int[] nums, int k) {
        int start=0;
        int end=0;
        for(int i=0;i<nums.length;i++){
            start=Math.max(start, nums[i]);// it will have the max element among the array.
            end +=nums[i];// sum of all elements in array
        }
        // now we can apply binary search
        while(start<end){
            int mid=start+(end-start)/2;
            int sum=0;
            int pieces=1;
            for (int i : nums) {
                if(sum+i > mid){
                   // you cannot add in this subarray make another one.
                   //asy you add this num in new subarray, then our sum star form next num so sum=i.
                   sum=i;
                   pieces++;
                }
                else{
                    sum +=i;
                }
            }
            if(pieces<=k){
                //means sum of individual number in large so reduce sum
                end=mid;
            }
            else{
                start=mid+1;
            }
        }
        return start;
    }
}