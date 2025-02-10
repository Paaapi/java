public class Infinite_arr_2 {
    public static void main(String[] args) {
        int[] arr = {2, 3, 7, 9, 12, 45, 67, 99, 123, 567, 678, 789, 987, 989, 990, 999};
        int target = 123;
        System.out.println(ans(arr, target));
    }

    static int ans(int[] arr, int target) {
        int start = 0;
        int end = 1;

        // Expand the search range exponentially until the target is within range
        while (end < arr.length && target > arr[end]) {
            start = end + 1;
            end = end * 2; // Double the range
            if (end >= arr.length) { // Handle out-of-bounds for end
                end = arr.length - 1;
            }
        }
        return search(arr, target, start, end);
    }

    static int search(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return mid; // Target found
            }
        }
        return -1; // Target not found
    }
}
