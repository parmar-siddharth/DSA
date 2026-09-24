import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {
    static void main() {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }
    static int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();

        int l = 0;
        int r = 0;

        int maxLen = 0;

        while(r < s.length()){
            char ch = s.charAt(r);

            if(set.contains(ch)){
                while(set.contains(ch)){
                    set.remove(s.charAt(l));
                    l++;
                }
            }
            set.add(ch);
            maxLen = Math.max(maxLen,r - l + 1);

            r++;
        }
        return maxLen;
    }
}
