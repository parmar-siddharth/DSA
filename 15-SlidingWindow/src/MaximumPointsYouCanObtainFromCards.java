public class MaximumPointsYouCanObtainFromCards {
    static void main() {
        int[] nums = {1,2,3,4,5,6,1};
        System.out.println(maxScore(nums,3));
    }
    static int maxScore(int[] cardPoints, int k) {
        int total = 0;
        for(int points : cardPoints){
            total += points;
        }

        if(k == cardPoints.length) return total;

        int windowSize = cardPoints.length - k;

        int curr = 0;
        int maxSum = 0;
        int l = 0;

        for(int r = 0; r < cardPoints.length; r++){
            curr += cardPoints[r];

            if(r - l + 1 == windowSize){
                maxSum = Math.max(maxSum,total - curr);

                curr -= cardPoints[l];
                l++;
            }
        }
        return maxSum;
    }
}
