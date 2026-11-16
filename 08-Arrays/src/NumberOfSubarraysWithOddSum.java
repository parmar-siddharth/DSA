import java.util.Arrays;

public class NumberOfSubarraysWithOddSum {
    static void main() {
        int[] arr = {1,3,5};
        System.out.println(numOfSubarrays(arr));
    }
//    static int numOfSubarrays(int[] arr) {
//        int count = 0;
//        int mod = 1000000007;
//        for(int i = 0; i < arr.length; i++){
//            int sum = 0;
//            for(int j = i; j < arr.length; j++){
//                sum += arr[j];
//                if(sum % 2 != 0) count++;
//            }
//        }
//        return count % mod;
//    }

    static int numOfSubarrays(int[] arr) {
        int count = 0;
        int mod = 1000000007;
        int odd = 0, even = 1;
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
            if(sum % 2 == 0){
                count = (count + odd) % mod;
                even++;
            }
            else{
                count = (count + even) % mod;
                odd++;
            }
        }
        return count;
    }
}
