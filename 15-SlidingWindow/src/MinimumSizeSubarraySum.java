public class MinimumSizeSubarraySum {
    static void main(String[] args) {
        int[] nums = {2,3,1,2,4,3};
        System.out.println(minSubArrayLen(7,nums));
    }
    static int minSubArrayLen(int target, int[] nums) {
        int minLength = Integer.MAX_VALUE;

        int sum = 0;
        int l = 0;

        for(int r = 0; r < nums.length; r++){
            sum += nums[r];

            while(sum >= target){
                minLength = Math.min(minLength,r - l + 1);
                sum -= nums[l];
                l++;
            }
        }
        if(minLength == Integer.MAX_VALUE) return 0;

        return minLength;
    }
}
