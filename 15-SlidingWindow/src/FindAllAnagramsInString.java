import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllAnagramsInString {
    static void main() {
        String s = "cbaebabacd";
        String p = "abc";
        System.out.println(findAnagrams(s,p));
    }
    static List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();

        int k = p.length();

        int[] freq1 = new int[128];

        for(char ch : p.toCharArray()){
            freq1[ch]++;
        }

        int l = 0;
        int r = 0;

        int[] freq2 = new int[128];

        while(r < s.length()){

            char ch = s.charAt(r);

            freq2[ch]++;

            if(r - l + 1 == k){
                if(Arrays.equals(freq1,freq2)){
                    ans.add(l);
                }
                freq2[s.charAt(l)]--;
                l++;
            }

            r++;
        }
        return ans;
    }
}
