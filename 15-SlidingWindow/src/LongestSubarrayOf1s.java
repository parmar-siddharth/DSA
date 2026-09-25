public class LongestSubarrayOf1s{
    static void main(String[] args) {
        int[] nums = {1,1,0,1};
        System.out.println(longestSubarray(nums));
    }
    static int longestSubarray(int[] nums) {
        int zeros = 0;
        int longest = 0;

        int l = 0;
        for(int r = 0; r < nums.length; r++){

            if(nums[r] == 0) zeros++;

            if(zeros > 1){
                while(zeros > 1){
                    if(nums[l] == 0) zeros--;
                    l++;
                }
            }

            longest = Math.max(longest,r - l);

        }
        return longest;
    }
}
