public class LongestStrictlyIncDecSubarray {
    static void main(String[] args) {
        int[] nums = {1,4,3,3,2};
        System.out.println(longestMonotonicSubarray(nums));
    }
    static int longestMonotonicSubarray(int[] nums) {
        int longInc = 1;
        int longDec = 1;
        int l = 0, j = 0;
        for(int r = 1; r < nums.length; r++){
            if(nums[r] <= nums[r - 1]){
                l = r;
            }
            longInc = Math.max(longInc, r - l + 1);

            if(nums[r] >= nums[r - 1]){
                j = r;
            }
            longDec = Math.max(longDec, r - j + 1);
        }
        return Math.max(longInc,longDec);
    }
}
