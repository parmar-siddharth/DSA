import java.util.Arrays;

public class PermutationInString {
    static void main() {
        String s1 = "ab";
        String s2 = "eidbaooo";
        System.out.println(checkInclusion(s1,s2));
    }
    static boolean checkInclusion(String s1, String s2) {
        int[] freq1 = new int[128];

        for(char c : s1.toCharArray()){
            freq1[c]++;
        }

        int k = s1.length();
        int[] freq2 = new int[128];

        int l = 0;

        for(int r = 0; r < s2.length(); r++){
            char ch = s2.charAt(r);

            freq2[ch]++;

            if(r - l + 1 == k){

                if(Arrays.equals(freq1,freq2)){
                    return true;
                }

                freq2[s2.charAt(l)]--;
                l++;
            }
        }
        return false;
    }
}
