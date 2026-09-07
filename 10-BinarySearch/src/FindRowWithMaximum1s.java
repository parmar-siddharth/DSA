package com.BinarySearch;

public class FindRowWithMaximum1s {
    public static void main(String[] args) {
        int[][] mat = {
                {0,1,0},
                {0,1,1},
                {1,1,1},
                {0,0,0}
        };
        System.out.println(rowWithMax1s(mat));
//        System.out.println(lowerBound(mat[0],0));
    }
//    static int rowWithMax1s(int[][] mat){
//        int index = -1;
//        int totalCount = 0;
//        for (int i = 0; i < mat.length - 1; i++) {
//            int count = 0;
//            for (int j = 0; j < mat[i].length - 1; j++) {
//                if (mat[i][j] == 1){
//                    count++;
//                }
//            }
//            if (totalCount < count){
//                totalCount = count;
//                index = i;
//            }
//        }
//            return index;
//    }

    static int rowWithMax1s(int[][] mat){
        int index = -1;
        int maxCount = -1;
        for (int i = 0; i < mat.length; i++) {
            int len = mat[i].length;
            int count = len - lowerBound(mat[i],1);
            if (count > maxCount){
                maxCount = count;
                index = i;
            }
        }
        return index;
    }

    static int lowerBound(int[] arr,int target){
        int start = 0;
        int end = arr.length - 1;
        while(start < end){
            int mid = start + (end - start) / 2;
            if (arr[mid] < target){
                start = mid + 1;
            }
            else {
                end = mid;
            }
        }
        return start;
    }
}
