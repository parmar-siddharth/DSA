import java.util.Arrays;

public class SumOfBeautyInArray {
    static void main(String[] args) {
        int[] nums = {2,4,6,4};
        System.out.println(sumOfBeauties(nums));
    }

    static int sumOfBeauties(int[] nums) {
        int n = nums.length;

        int[] leftMax = new int[n];
        int leftmax = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            leftmax = Math.max(leftmax,nums[i]);
            leftMax[i] = leftmax;
        }

        int[] rightMin = new int[n];
        int rightmin = Integer.MAX_VALUE;
        for (int i = n-1; i >= 0; i--) {
            rightmin = Math.min(rightmin,nums[i]);
            rightMin[i] = rightmin;
        }

        int sum = 0;
        for(int i = 0; i < n; i++){
            if(i >= 1 && i <= n - 2){
                if(leftMax[i-1] < nums[i] && nums[i] < rightMin[i+1]){
                    sum += 2;
                }
                else if(nums[i-1] < nums[i] && nums[i] < nums[i+1]){
                    sum += 1;
                }
                else{
                    sum += 0;
                }
            }
        }
        return sum;
    }

}
