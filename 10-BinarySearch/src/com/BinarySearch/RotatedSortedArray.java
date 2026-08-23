package com.BinarySearch;

public class RotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = {6,7,8,9,10,1,2,3,4,5};
        int peak = pivotElement(arr);
        System.out.println(peak);
        int target = 9;
        int leftSide = search(arr,target,0,peak);
        if (leftSide != -1){
            System.out.println(leftSide);
        }
        int rightSide = search(arr,target,peak + 1,arr.length -1);
        System.out.println(rightSide);
    }
    static int pivotElement(int[] arr) {
      int start = 0;
      int end = arr.length - 1;
      while(start <= end){
          int mid = start + (end - start) / 2;
          //case 1:
          if (mid < end && arr[mid] > arr[mid + 1]){   // detect pivot element
              return mid;
          }
          //case 2:
          if (start < mid && arr[mid] < arr[mid -1]){  // detect pivot element
              return mid -1;
          }
          //case 3:
//          if(arr[start] == arr[mid] && arr[end] == arr[mid]){
//              start++;
//              end--;
//          }
          else if (arr[mid] >= arr[start]){         //decide direction... if not found by above two cases
              start = mid + 1;
          }
          //case4
          else {
              end = mid - 1;
          }
      }
      return -1;
    }

    static int search(int[] nums, int target,int start,int end) {
        while(start <= end){
            int mid = start + (end - start) / 2;
            if (target == nums[mid]){
                return mid;
            }else if (target < nums[mid]){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return -1;
    }
}
