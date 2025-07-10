import java.util.Arrays;

public class BSearchSorted2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {2, 3, 4, 5},
                {6, 7, 8, 9},
                {10, 11, 12, 13}
        };
        System.out.println(Arrays.toString(search(arr, 13))); // [2,3]
    }
    
    static int[] binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target) {
        while (cStart <= cEnd) {
            int mid = cStart + (cEnd - cStart) / 2;
            if (matrix[row][mid] == target) {
                return new int[]{row, mid};
            } else if (target > matrix[row][mid]) {
                cStart = mid + 1;
            } else {
                cEnd = mid - 1;
            }
        }
        return new int[]{-1, -1};
    }

    static int[] search(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        if (rows == 0 || cols == 0) {
            return new int[]{-1, -1}; // Empty matrix case
        }

        int rStart = 0;
        int rEnd = rows - 1;
        int cMid = cols / 2;

        // Binary search on row until only two rows remain
        while (rStart < (rEnd - 1)) { // Runs until two rows remain
            int rMid = rStart + (rEnd - rStart) / 2;
            if (matrix[rMid][cMid] == target) {
                return new int[]{rMid, cMid};
            } else if (target < matrix[rMid][cMid]) {
                rEnd = rMid;
            } else {
                rStart = rMid + 1;
            }
        }

        // Now we have two rows left: rStart and rStart + 1
        // Check mid-column of both rows
        if (matrix[rStart][cMid] == target) {
            return new int[]{rStart, cMid};
        }
        if (rStart + 1 < rows && matrix[rStart + 1][cMid] == target) {
            return new int[]{rStart + 1, cMid};
        }

        // Search in four quadrants
        // 1st quadrant (left half of row `rStart`)
        if (cMid - 1 >= 0 && target <= matrix[rStart][cMid - 1]) {
            return binarySearch(matrix, rStart, 0, cMid - 1, target);
        }
        // 2nd quadrant (right half of row `rStart`)
        if (cMid + 1 < cols && target >= matrix[rStart][cMid + 1] && target <= matrix[rStart][cols - 1]) {
            return binarySearch(matrix, rStart, cMid + 1, cols - 1, target);
        }
        // 3rd quadrant (left half of row `rStart + 1`)
        if (rStart + 1 < rows && cMid - 1 >= 0 && target <= matrix[rStart + 1][cMid - 1]) {
            return binarySearch(matrix, rStart + 1, 0, cMid - 1, target);
        }
        // 4th quadrant (right half of row `rStart + 1`)
        if (rStart + 1 < rows && cMid + 1 < cols) {
            return binarySearch(matrix, rStart + 1, cMid + 1, cols - 1, target);
        }

        return new int[]{-1, -1}; // Element not found
    }
}
