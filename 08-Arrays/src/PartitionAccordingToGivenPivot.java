import java.util.ArrayList;
import java.util.Arrays;

public class PartitionAccordingToGivenPivot {
    static void main() {
        //int[] nums = {9,12,5,10,14,3,10};
        int[] nums = {-3,4,3,2};
        System.out.println(Arrays.toString(pivotArray(nums,2)));
    }
    static int[] pivotArray(int[] nums, int pivot) {
        int n = nums.length;
        int left = 0;
        int right = n - 1;
        int[] ans = new int[n];

        for (int i = 0, j = n - 1; i < n; i++, j--) {
            if (nums[i] < pivot) {
                ans[left++] = nums[i];
            }

            if (nums[j] > pivot) {
                ans[right--] = nums[j];
            }
        }

        while (left <= right) {
            ans[left++] = pivot;
        }

        return ans;
    }

//    static int[] pivotArray(int[] nums, int pivot) {
//        ArrayList<Integer> lesser = new ArrayList<>();
//        ArrayList<Integer> greater = new ArrayList<>();
//        ArrayList<Integer> equal = new ArrayList<>();
//
//        for(int num : nums){
//            if (num < pivot){
//                lesser.add(num);
//            }
//            else if (num > pivot){
//                greater.add(num);
//            }
//            else{
//                equal.add(num);
//            }
//        }
//        lesser.addAll(equal);
//        lesser.addAll(greater);
//
//        int[] ans = new int[lesser.size()];
//        int index = 0;
//        for (int n : lesser){
//            ans[index++] = n;
//        }
//
//        return ans;
//    }
}
