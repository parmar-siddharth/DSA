public class CountNumberOfNiceSubarrays {
    static void main(String[] args) {
        int[] nums = {1,1,2,1,1};
        int k = 3;
        System.out.println(numberOfSubarrays(nums,k));
    }

    static int numberOfSubarrays(int[] nums, int k) {
        return atMost(nums,k) - atMost(nums,k - 1);
    }
    static int atMost(int[] nums,int k){
        int l = 0;
        int count = 0;
        int oddCount = 0;

        for(int r = 0; r < nums.length; r++){
            if(nums[r] % 2 != 0) oddCount++;

            while(oddCount > k){
                if(nums[l] % 2 != 0) oddCount--;
                l++;
            }

            count += r - l + 1;
        }

        return count;
    }
}
