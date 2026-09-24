import java.util.HashSet;

public class MaximumSumOfDistinctSubarraysWithLengthK {
    static void main() {
        int[] nums = {1,5,4,2,9,9,9};
        System.out.println(maximumSubarraySum(nums,3));
    }
    static long maximumSubarraySum(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();

        long maxSum = 0;
        long curr = 0;

        int l = 0;
        int r = 0;

        while(r < nums.length){
            if(set.contains(nums[r])){
                while(set.contains(nums[r])){
                    set.remove(nums[l]);
                    curr -= nums[l];
                    l++;
                }
            }

            curr += nums[r];
            set.add(nums[r]);

            if(r - l + 1 == k){
                maxSum = Math.max(maxSum,curr);
                curr -= nums[l];
                set.remove(nums[l]);
                l++;
            }

            r++;
        }
        return maxSum;
    }
}
