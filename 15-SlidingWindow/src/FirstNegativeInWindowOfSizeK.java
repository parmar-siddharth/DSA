import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class FirstNegativeInWindowOfSizeK {
    static void main(String[] args) {
        int[] nums = {-8, 2, 3, -6, 10};
        int k = 2;
        System.out.println(firstNegInt(nums,k));
    }
    static List<Integer> firstNegInt(int nums[], int k) {
        Deque<Integer> deque = new ArrayDeque<>();
        List<Integer> ans = new ArrayList<>();

        int l = 0;
        for (int r = 0; r < nums.length; r++) {

            if (nums[r] < 0){
                deque.addLast(r);
            }

            if(r - l + 1 == k){
                while (!deque.isEmpty() && deque.peekFirst() < l){
                    deque.removeFirst();
                }

                if (deque.isEmpty()){
                    ans.add(0);
                }
                else {
                    ans.add(nums[deque.peekFirst()]);
                }
                l++;
            }

        }
        return ans;
    }
}
