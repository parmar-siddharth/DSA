public class MaximumAverageSubarrayI {
    static void main() {
        int[] nums = {1,12,-5,-6,50,3};
        System.out.println(findMaxAverage(nums,4));
    }
    static double findMaxAverage(int[] nums, int k) {
        int l = 0;
        int r = 0;
        double sum = 0;
        double maxAvg = -Double.MAX_VALUE;
        while(r < nums.length){
            sum += nums[r];
            if(r - l + 1 == k){
                double avg = sum / k;
                maxAvg = Math.max(maxAvg,avg);
                sum -= nums[l];
                l++;
            }
            r++;
        }
        return maxAvg;
    }
}
