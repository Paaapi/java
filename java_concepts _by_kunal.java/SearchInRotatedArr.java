public class SearchInRotatedArr {
    public static void main(String[] args) {
        int[] arr={2,5,2,0,1,2};
        System.out.println(pivotele(arr));
        int target=0;
        System.out.println(search(arr, target));
    }

    static int search(int[] arr,int target){
        int pivot=pivotele(arr);
        if(pivot ==-1){
            // if pivot is  not found then simple binary search.
            return Searching(arr, target,0,arr.length-1 );  
        }
        if(target >= arr[0]){
              return Searching(arr, target, 0, pivot); // pivot written because if size of array two is taken.
        }
        if(target <= arr[arr.length-1]){
           return Searching(arr, target, pivot+1, arr.length-1); 
        }
        if(arr[pivot] == target){
            return pivot;
        }
        return -1;
    }
    
    static int pivotele(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start < end){
            int mid=start +(end-start)/2;
            if(mid> start && arr[mid] < arr[mid-1]){
                return mid-1;
            }
            if(mid<end && arr[mid] > arr[mid+1]){
                return mid;
            }
            if(arr[start] >= arr[mid]){
                end=mid-1;   
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }
    static int Searching(int[] arr,int target,int start,int end){
        
        while(start <= end){    // add equal to because if start and end in case is very close it will return -1.
            int mid=start +(end-start)/2;
            if(target < arr[mid]){
                end=mid-1;
            }
            else if(target >arr[mid]){
                start=mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
    static int pivotele_Duplicate(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start < end){
            int mid=start +(end-start)/2;
            if(mid> start && arr[mid] < arr[mid-1]){
                return mid-1;
            }
            if(mid<end && arr[mid] > arr[mid+1]){
                return mid;
            }
            if(arr[start]==arr[mid] && arr[mid]==arr[end]){
                //first we have to check start and end are pivot or not.
                if(arr[start]> arr[start+1]){
                    return start;
                }
                start++;
                if(arr[end]<arr[end-1]){
                    return end-1;
                }
                end--;
            }
                //suppose over pivot is at left hand side.
                else if(arr[start] > arr[mid] || arr[start] == arr[mid] && arr[mid]<arr[end]){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
        }
        return -1;
    }
}

