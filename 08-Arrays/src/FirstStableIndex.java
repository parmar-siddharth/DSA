import java.util.Arrays;

public class FirstStableIndex {
    static void main(String[] args) {
        int[] nums = {5,0,1,4};
        System.out.println(firstStableIndex(nums,3));
    }

    /// brute
//    static int firstStableIndex(int[] nums, int k) {
//        int n = nums.length;
//        for(int i = 0; i < n; i++){
//            if(isStable(Arrays.copyOfRange(nums,0,i+1),Arrays.copyOfRange(nums,i, nums.length),k)) return i;
//        }
//        return -1;
//    }
//    static boolean isStable(int[] arr1,int[] arr2,int k){
//        int max = Integer.MIN_VALUE;
//        int min = Integer.MAX_VALUE;
//        for (int num : arr1){
//            max = Math.max(max,num);
//        }
//        for (int num : arr2){
//            min = Math.min(min, num);
//        }
//        return (max - min) <= k;
//    }

    /// optimized
    static int firstStableIndex(int[] nums, int k) {
        int max = Integer.MIN_VALUE;
        int[] prefix = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            max = Math.max(max,nums[i]);
            prefix[i] = max;
        }

        int min = Integer.MAX_VALUE;
        int[] suffix = new int[nums.length];
        for(int i = nums.length - 1; i >= 0; i--){
            min = Math.min(min,nums[i]);
            suffix[i] = min;
        }

        for(int i = 0; i < nums.length; i++){
            int instabilityScore = prefix[i] - suffix[i];
            if(instabilityScore <= k) return i;
        }

        return -1;
    }

}
