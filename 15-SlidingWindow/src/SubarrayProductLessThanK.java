import java.util.HashSet;

public class SubarrayProductLessThanK {
    static void main(String[] args) {
        int[] nums = {686, 28, 455, 675, 605, 29, 942, 48, 502, 889, 854, 206, 231, 796, 272, 565, 887, 969, 558, 13, 22, 455, 145, 804, 15};
        int k = 515854;
        System.out.println(numSubarrayProductLessThanK(nums,k));
    }
    static int numSubarrayProductLessThanK(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        int count = 0;
        for(int num : nums){
            if (!set.contains(num)){
                set.add(num);
                count++;
            }
        }

        int product = 1;

        int l = 0;
        for(int r = 0; r < nums.length; r++){

            product *= nums[r];

            while(product >= k){
                product = product / nums[l];
                l++;
            }

            if (!set.contains(product)) {
                set.add(product);
                count++;
            }
        }
        return count;
    }
}
