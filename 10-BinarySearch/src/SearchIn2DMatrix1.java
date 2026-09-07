package com.BinarySearch;

public class SearchIn2DMatrix1 {
    public static void main(String[] args) {
        int[][] arr = {
                {10,20,30,40},
                {12,24,31,42},
                {15,26,34,45},
                {17,29,37,48}
        };
        System.out.println(search(arr,45));
    }

//    static boolean search(int[][] arr,int target){
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i][0] <= target && target <= arr[i][arr[i].length-1]){
//                if (binarySearch(arr[i], target)) {
//                    return true;
//                }
//            }
//        }
//        return false;
//    }
//    static boolean binarySearch(int[] arr,int target){
//        int start = 0;
//        int end = arr.length-1;
//        while (start <= end){
//            int mid = start + (end - start) / 2;
//            // if target == mid
//            if (target == arr[mid]){
//                return true;
//            }
//            else if (target > arr[mid])
//            {
//                start = mid + 1;
//            }
//            else
//            {
//                end = mid - 1;
//            }
//        }
//        return false;
//    }

    // optimal soln:
    static boolean search(int[][] matrix, int target){
        int n = matrix.length;
        int m = matrix[0].length;
        int start = 0;
        int end = n * m - 1;
        while (start <= end){
            int mid = start + (end - start) / 2;
            int row = mid / m;
            int col = mid % m;

            if (matrix[row][col] == target){
                return true;
            }
            else if (matrix[row][col] < target){
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return false;
    }
}
