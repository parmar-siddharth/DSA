import java.util.Arrays;

public class MinimumSwapsToSortByDigitSum {
    static void main() {
        int[] nums = {18,43,34,16};
        System.out.println(Arrays.toString(minSwaps(nums)));
    }
    static int[] minSwaps(int[] nums) {
        int[] sum = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            sum[i] += findSum(nums[i]);
        }
        return sum;
    }
    static int findSum(int num){
        int sum = 0;
        while(num > 0){
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
