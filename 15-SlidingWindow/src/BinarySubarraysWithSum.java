public class BinarySubarraysWithSum {
    static void main(String[] args) {
        int[] nums = {1,0,1,0,1};
        int goal = 2;
        System.out.println(numSubarraysWithSum(nums,goal));
    }
    static int numSubarraysWithSum(int[] nums, int goal) {
        return atMost(nums,goal) - atMost(nums,goal - 1);
    }
    static int atMost(int[] nums,int k){
        if(k < 0) return 0;

        int l = 0;
        int sum = 0;
        int count = 0;

        for(int r = 0; r < nums.length; r++){
            sum += nums[r];

            while(sum > k){
                sum -= nums[l];
                l++;
            }

            count += r - l + 1;
        }
        return count;
    }
}
